package task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomNumberSortingExample {
    public static void main(String[] args) {
        String fileName = "random_numbers.txt"; // Specify the file name

        // Generate and write random numbers to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            List<Integer> randomNumbers = generateRandomNumbers(20);
            writeNumbersToFile(randomNumbers, writer);
            System.out.println("Random numbers written to the file.");

            // Sort the numbers
            Collections.sort(randomNumbers);

            // Write sorted numbers to the file
            try (BufferedWriter sortedWriter = new BufferedWriter(new FileWriter(fileName, true))) {
                writeNumbersToFile(randomNumbers, sortedWriter);
                System.out.println("Sorted numbers written to the file.");
            }

            // Print sorted numbers to the console
            System.out.println("Sorted numbers:");
            for (Integer number : randomNumbers) {
                System.out.println(number);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Generates a list of random numbers
    private static List<Integer> generateRandomNumbers(int count) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            randomNumbers.add(random.nextInt(100)); // Generate random number between 0 and 99
        }
        return randomNumbers;
    }

    // Writes a list of numbers to a BufferedWriter
    private static void writeNumbersToFile(List<Integer> numbers, BufferedWriter writer) throws IOException {
        for (Integer number : numbers) {
            writer.write(number.toString());
            writer.newLine();
        }
    }
}
