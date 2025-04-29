import os

# Define the target directory
target_directory = '/Users/Brightidea/Git/SeleniumJava/src/util/RWHQTestCaseRetrieval'

# Change to the target directory
os.chdir(target_directory)

print("Renaming files to remove '\\r\\n' characters...")

# Iterate through all files in the directory
for filename in os.listdir(target_directory):
    if '\\r\\n' in filename:
        # Create the new name by replacing '\r\n' with an empty string
        new_name = filename.replace('\\r\\n', '')
        print(f"Renaming: {filename} -> {new_name}")
        # Rename the file
        os.rename(filename, new_name)

print("Renaming complete!")