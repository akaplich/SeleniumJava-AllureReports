#!/usr/bin/env python3

import os
import re
import glob

# Directory containing the test cases
test_dir = '/Users/Brightidea/git/SeleniumJava/src/test/groovy/TestCases/RWHQImports/OldRuleSet'

# Pattern to match @Test annotations
test_pattern = re.compile(r'(@Test\s*)(?=\s|$)')

def process_file(file_path):
    try:
        # Read the file content
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()
        
        # Check if the file already has the tag
        if '@Tag("OldRulesModalRegression")' in content:
            print(f"Skipping {os.path.basename(file_path)}: Already has OldRulesModalRegression tag")
            return False
        
        # Find all @Test annotations
        matches = test_pattern.finditer(content)
        if not any(matches):
            print(f"Skipping {os.path.basename(file_path)}: No @Test annotations found")
            return False
        
        # Replace @Test with @Test @Tag("OldRulesModalRegression")
        new_content = test_pattern.sub(r'@Test @Tag("OldRulesModalRegression") ', content)
        
        # Write the updated content back to the file
        with open(file_path, 'w', encoding='utf-8') as f:
            f.write(new_content)
        
        print(f"Updated {os.path.basename(file_path)}: Added @Tag annotation")
        return True
    
    except Exception as e:
        print(f"Error processing {os.path.basename(file_path)}: {e}")
        return False

def main():
    print(f"Processing files in {test_dir}...")
    
    # Get all .groovy files in the directory
    groovy_files = glob.glob(os.path.join(test_dir, '*.groovy'))
    
    if not groovy_files:
        print("No .groovy files found in the directory.")
        return
    
    print(f"Found {len(groovy_files)} .groovy files.")
    
    # Process each file
    updated_count = 0
    for file_path in groovy_files:
        if process_file(file_path):
            updated_count += 1
    
    print(f"Updated {updated_count} files.")
    print("Processing complete!")

if __name__ == "__main__":
    main() 