#!/usr/bin/env python3

import os
import re
import glob

# Directory containing the test cases
test_dir = '/Users/Brightidea/git/SeleniumJava/src/test/groovy/TestCases/RWHQImports/OldRuleSet'

# Pattern to match class declarations
class_pattern = re.compile(r'(class\s+[A-Za-z0-9_]+\s*)(?:\{|$)')

# Function to process a file
def process_file(file_path):
    try:
        # Read the file content
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()
        
        modified = False
        
        # Check if the file already has 'extends TestBase'
        if 'extends TestBase' in content:
            print(f"Skipping extends TestBase in {os.path.basename(file_path)}: Already extends TestBase")
        else:
            # Find the class declaration
            match = class_pattern.search(content)
            if not match:
                print(f"Skipping extends TestBase in {os.path.basename(file_path)}: No class declaration found")
            else:
                # Get the class declaration
                class_declaration = match.group(1)
                
                # Create the new class declaration with 'extends TestBase'
                new_class_declaration = f"{class_declaration}extends TestBase "
                
                # Replace the class declaration in the content
                content = content.replace(class_declaration, new_class_declaration)
                
                print(f"Updated {os.path.basename(file_path)}: Added 'extends TestBase'")
                modified = True
        
        # Check if the file already has 'import BaseClasses.TestBase'
        if 'import BaseClasses.TestBase' in content:
            print(f"Skipping import in {os.path.basename(file_path)}: Already imports BaseClasses.TestBase")
        else:
            # Find the last import statement
            import_pattern = re.compile(r'(import\s+[A-Za-z0-9_.]+\s*;?\s*)(?=\n)')
            imports = import_pattern.findall(content)
            
            if imports:
                # Get the last import statement
                last_import = imports[-1]
                
                # Create the new import statement
                new_import = f"{last_import}import BaseClasses.TestBase\n"
                
                # Replace the last import statement in the content
                content = content.replace(last_import, new_import)
                
                print(f"Updated {os.path.basename(file_path)}: Added 'import BaseClasses.TestBase'")
                modified = True
            else:
                # No import statements found, add it before the class declaration
                match = class_pattern.search(content)
                if match:
                    class_declaration = match.group(0)
                    new_content = f"import BaseClasses.TestBase\n\n{content}"
                    content = new_content
                    
                    print(f"Updated {os.path.basename(file_path)}: Added 'import BaseClasses.TestBase' before class declaration")
                    modified = True
                else:
                    print(f"Skipping import in {os.path.basename(file_path)}: No class declaration found")
        
        # Write the updated content back to the file if modified
        if modified:
            with open(file_path, 'w', encoding='utf-8') as f:
                f.write(content)
            return True
        
        return False
    
    except Exception as e:
        print(f"Error processing {os.path.basename(file_path)}: {e}")
        return False

# Main function
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