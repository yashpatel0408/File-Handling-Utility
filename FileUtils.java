// FileUtils.java
import java.io.*;

public class FileUtils {

   //read content from a file
    public String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null; // Handle the error as appropriate for your application
        }
        return content.toString();
    }

  //write a content in file
    public void writeFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            // Handle the error as appropriate for your application
        }
    }

   //append content in file
    public void appendToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }

   //modify the chnages in file
    public void modifyFile(String filePath, String searchString, String replacementString) {
        try {
            String content = readFile(filePath); // Reuse readFile()
            if (content != null) { // Only proceed if readFile was successful
                content = content.replace(searchString, replacementString);
                writeFile(filePath, content); // Reuse writeFile()
            }
        } catch (Exception e) {
            System.err.println("Error modifying file: " + e.getMessage());
        }
    }
}

