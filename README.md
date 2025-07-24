# FILE-HANDLING-UTILITY

*COMPANY* : CODTECH IT SOLUTIONS

*NAME* : SAUGATA KUNDU

*INTERN ID* : CT04DZ671

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR* : NEELA SANTHOSH

## 📄 Description

This Java program demonstrates basic **file handling operations**—**read**, **write**, and **modify**—using core Java I/O classes. Built as part of the CODTECH Internship Task-1, the script provides a clean and modular `FileHandler` class that interacts with text files, allowing users to perform file operations directly from the terminal.

### ✨ Features

* **Read**: Display the entire contents of a text file.
* **Write**: Overwrite an existing file with new content.
* **Modify**: Replace specific text within the file (find and replace).

### 📂 How It Works

The `FileHandler` class accepts a file path and ensures the file exists before proceeding. It uses `BufferedReader` and `BufferedWriter` for efficient file input and output operations. The program supports command-line arguments to make it user-friendly and scriptable:

* `-r <filepath>`: Reads and prints the file content.
* `-w <filepath> "<newText>"`: Writes the provided text to the file.
* `-m <filepath> "<oldText>" "<newText>"`: Replaces all occurrences of old text with new text.

Each operation handles exceptions gracefully and checks file permissions for safety.

### 🔧 Requirements

* Java 8 or higher
* Command-line interface (e.g., Terminal or Command Prompt)

This utility is ideal for learners looking to understand Java file I/O operations and serves as a practical base for more complex text processing tools.
