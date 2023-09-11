package task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Read input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
            reader.close();

            // Replace prepositions with "Java"
            String modifiedContent = content.toString().replaceAll("\\b(?:at|in|on|with|for)\\b", "Java");

            // Write modified content to output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(modifiedContent);
            writer.close();

            System.out.println("Prepositions replaced in " + inputFile + " and written to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}