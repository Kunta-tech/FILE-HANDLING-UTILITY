# FILE-HANDLING-UTILITY

*COMPANY* : CODTECH IT SOLUTIONS

*NAME* : SAUGATA KUNDU

*INTERN ID* : CT04DZ671

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR* : NEELA SANTHOSH

---

## 📄 Description

This Java program demonstrates basic **file handling operations**—**read**, **write**, and **modify**—using core Java I/O classes. Built as part of the CODTECH Internship Task-1, the script provides a clean and modular `FileHandler` class that interacts with text files, allowing users to perform file operations directly from the terminal.

## OUTPUT
![Output Image](https://private-user-images.githubusercontent.com/79380857/470365027-731c0a57-157c-40f1-8a16-8c22ca79d9e0.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTMzNjg3MjIsIm5iZiI6MTc1MzM2ODQyMiwicGF0aCI6Ii83OTM4MDg1Ny80NzAzNjUwMjctNzMxYzBhNTctMTU3Yy00MGYxLThhMTYtOGMyMmNhNzlkOWUwLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNTA3MjQlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjUwNzI0VDE0NDcwMlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTAwZGUyZjgxYTEwYWY3MjFkNzg5ZDA0OGNkMjAyODU2ZTUwNjgzYmRmYjczMjNlYmFkOTg5MmQyNjhkMzcxOTMmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.xIRHkP30NNGniR1P4vQfzNOZXwnL4DdOG9Kuq12CVwI)

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
