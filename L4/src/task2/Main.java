package task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String fileName = "output.txt"; // Specify the file name

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            String message = "Hello, world!"; // The text you want to write
            writer.write(message); // Write the message to the file
            System.out.println("Message written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print the line to the console
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}