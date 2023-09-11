package additionalTask;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // Specify the file name

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            String text = "This is some sample text that we'll write to the file.";
            writer.write(text);
            System.out.println("Text written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
