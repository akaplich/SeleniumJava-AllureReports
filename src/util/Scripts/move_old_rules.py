#!/usr/bin/env python3

import json
import os
import re
import shutil
import glob

# File paths
json_file = '/Users/Brightidea/git/SeleniumJava/src/util/Scripts/Old Rules Modal Regression.json'
source_dir = '/Users/Brightidea/git/SeleniumJava/src/test/groovy/TestCases/RWHQImports/RWHQTestCases_Untested'
target_dir = os.path.join(source_dir, 'OldRuleSet')

# Create target directory if it doesn't exist
if not os.path.exists(target_dir):
    os.makedirs(target_dir)
    print(f"Created directory: {target_dir}")

# Function to extract IDs from JSON
def extract_ids_from_json(json_file):
    try:
        with open(json_file, 'r', encoding='utf-8') as f:
            data = json.load(f)
        
        # Extract IDs from the "name" field in the "executiontestcases" array
        ids = []
        if "executiontestcases" in data and isinstance(data["executiontestcases"], list):
            for item in data["executiontestcases"]:
                if "name" in item and isinstance(item["name"], str):
                    # Look for pattern "C" followed by numbers and ending with " -"
                    match = re.search(r'(C\d+)\s*-\s*', item["name"])
                    if match:
                        ids.append(match.group(1))
        
        return ids
    except Exception as e:
        print(f"Error parsing JSON file: {e}")
        return []

# Function to find and move files
def find_and_move_files(source_dir, target_dir, ids):
    # Get all .groovy files in the source directory
    groovy_files = glob.glob(os.path.join(source_dir, '*.groovy'))
    
    moved_count = 0
    for file_path in groovy_files:
        file_name = os.path.basename(file_path)
        
        # Check if any ID is in the filename
        for id in ids:
            if id in file_name:
                # Move the file to the target directory
                target_path = os.path.join(target_dir, file_name)
                shutil.move(file_path, target_path)
                print(f"Moved: {file_name} -> {target_dir}")
                moved_count += 1
                break  # Stop checking other IDs once a match is found
    
    return moved_count

# Main function
def main():
    print(f"Parsing JSON file: {json_file}")
    ids = extract_ids_from_json(json_file)
    
    if not ids:
        print("No IDs found in the JSON file.")
        return
    
    print(f"Found {len(ids)} IDs: {', '.join(ids)}")
    
    print(f"Searching for files in: {source_dir}")
    moved_count = find_and_move_files(source_dir, target_dir, ids)
    
    print(f"Moved {moved_count} files to {target_dir}")
    print("Processing complete!")

if __name__ == "__main__":
    main() 