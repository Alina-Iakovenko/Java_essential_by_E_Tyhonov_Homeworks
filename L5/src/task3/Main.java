package task3;

public class Main {
    public static void main(String[] args) {

            // Sample text from the internet
            String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";

            // Calculate the midpoint of the text
            int midpoint = text.length() / 2;

            // Find the indices of the first and last sentences
            int firstSentenceEnd = text.indexOf('.', midpoint) + 1;
            int secondSentenceStart = text.lastIndexOf('.', midpoint) + 1;

            // Extract the first and second sentences
            String firstSentence = text.substring(0, firstSentenceEnd).trim();
            String secondSentence = text.substring(secondSentenceStart).trim();

            // Print the sentences
            System.out.println("First Sentence:");
            System.out.println(firstSentence);

            System.out.println("\nSecond Sentence:");
            System.out.println(secondSentence);
        }
    }