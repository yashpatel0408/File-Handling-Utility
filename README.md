# File-Handling-Utility

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: YASHKUMAR PATEL

*INTERN ID*: CT04DL1118

*DOMAIN*: JAVA PROGRAMMING

*DURATIONS*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

*DESCRIPTION*:
#File handling Utility - java

#OVERVIEW
## Project Description

This Java File Handling Utility is a real-world and beginner-level project constructed based on fundamental Java concepts. The primary goal of this project is to illustrate how file operations like reading from a file, writing to a file, and altering text within a file can be executed efficiently with the help of Java's in-built I/O classes. It was created as a deliverable for an assignment under the *Java Programming Domain* at *Codtech*, as part of an internship program.

File handling is a crucial aspect of software development in the real world. Storing logs, saving user information, loading configuration files, or processing reports, file input/output (I/O) is a skill every developer needs to have. This utility presents the fundamental concepts behind Java's file handling API in a clean, modular, and easy-to-grasp manner.

### Purpose and Objective

The main objective of this project is to create a basic utility that:
- Produces a text file (if one doesn't exist).
- Saves text content into the file.
- Reads and outputs the contents of the file.
- Alters particular content in the file by replacing phrases or words.

Through these operations, users gain knowledge about how Java can be employed to automate straightforward file-based tasks, which are usually found in enterprise programs.

### Technology Used

This project is developed using:
- *Java SE (Standard Edition)* – version-agnostic (works on Java 8 and later).
- No external dependencies – relies solely on Java's native I/O libraries (FileWriter, FileReader, BufferedReader, etc.).
- Text-based interface (console-based).

### Functional Overview

The project includes the following main methods:

1. **saveText(String fileName, String data)**
This approach creates or replaces a file with the specified name and writes the given string content into it. It employs FileWriter to write data to the file. This can be used for logging or saving user input.

2. **getText(String fileName)**
This method reads the file line by line with a BufferedReader and loads the content into a string. It returns the entire content of the file as a String. This method illustrates reading file data, which is vital to process saved input or logs.

3. **updateText(String fileName, String findWord, String replaceWord)**
This technique is employed to update existing file content. It reads the file first, replaces the given old word with a new one using String.replace(), and writes the changed text back to the same file. This method is particularly helpful for automatic changes in config or document files.

### Flow of Execution

The execution starts in the main() method:
1. The program outputs initial content to a file called demo.txt.
2. It reads and displays that content on the console.
3. It updates the content by replacing a word (e.g., replacing "Codtech" with "CodTech Solutions").
4. It reads and displays the updated content to display the outcome of the operation.

### Why This Project Matters

This project not only discusses file handling but also promotes:
- *Principles of good coding* like modular coding (distinct methods for distinct operations).
- *String manipulation ability* which is frequently required in file processing.
- *Handling exceptions* using try-catch blocks so that the program runs smoothly without errors when dealing with files (like not finding a file, permission errors, etc.).

It also acquaints interns or beginners with working out how the data gets persisted and manipulated outside the memory, which is a major topic of study in backend as well as system programming.

### Future Scope and Extensions

This project has a lot of scope for extensions. Some potential future extensions include:
- Incorporating an *append* mode instead of overwrite.
- Making the user input *file names and content* dynamically through console or GUI.
- Incorporating a *search function* which can locate the position of some given text within the file.
- Maintaining a *log file* of changes to the file (version tracking).
- Designing a *GUI* with Java Swing or JavaFX to enhance user-friendliness of the utility.

### Conclusion

This Java File Handling Utility project is a perfect place to start learning core Java file I/O operations. It features three simple yet fundamental file operations combined in one utility: write, read, and modify. The application was done as part of an exercise task during the Codtech internship and showcases both theoretical knowledge and practical implementation of Java programming. It is an excellent precursor to future projects involving file systems, data storage, or backend operations.


*OUTPUT*:![Image](https://github.com/user-attachments/assets/d2fa60bb-a3dd-4986-9330-e03160406309)
