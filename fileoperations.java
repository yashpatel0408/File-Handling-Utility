// FileOperationsDemo.java
public class fileoperations {

    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        String filePath = "yash.txt"; 

        // 1. Write to the file
        fileUtils.writeFile(filePath, "Hello world.\nMy name is yash.\n");
        System.out.println("File '" + filePath + "' written with initial content.");

        // 2. Read from the file
        String content = fileUtils.readFile(filePath);
        System.out.println("\nContent of '" + filePath + "':\n" + content);

        // 3. Append to the file
        fileUtils.appendToFile(filePath, "i hope you guys are fine.\ni am also fine here!.\n");
        System.out.println("File '" + filePath + "' appended with more content.");

        // 4. Read again to see the appended content
        content = fileUtils.readFile(filePath);
        System.out.println("\nContent of '" + filePath + "' after appending:\n" + content);

        // 5. Modify the file
        fileUtils.modifyFile(filePath, "content", "data");
        System.out.println("File '" + filePath + "' modified.");
        content = fileUtils.readFile(filePath);
        System.out.println("\nContent of '" + filePath + "' after modification:\n" + content);

        // 6. Demonstrate file operations on a new file.
        String newFilePath = "yashmodified.txt";
        fileUtils.writeFile(newFilePath, "This is a new file.\n");
        System.out.println("Created and wrote to " + newFilePath);

        String newFileContent = fileUtils.readFile(newFilePath);
        System.out.println("Content of " + newFilePath + ":\n" + newFileContent);

        fileUtils.appendToFile(newFilePath, "Appended more data.\n");
        System.out.println("Appended to " + newFilePath);

        newFileContent = fileUtils.readFile(newFilePath);
        System.out.println("Content of " + newFilePath + " after append:\n" + newFileContent);

        fileUtils.modifyFile(newFilePath, "new", "modified");
        System.out.println("Modified " + newFilePath);
        newFileContent = fileUtils.readFile(newFilePath);
        System.out.println("Content of " + newFilePath + " after modify:\n" + newFileContent);
    }
}
