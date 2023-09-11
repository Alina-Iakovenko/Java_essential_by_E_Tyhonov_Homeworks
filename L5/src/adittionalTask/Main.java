import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Sample text from the internet
        String text = "In this text, sentences have different word counts. " +
                "We need to sort them in ascending order of word count. And print them in acsendint order to consol.";

        // Split the text into sentences
        String[] sentences = text.split("\\.");

        // Create a comparator to sort sentences by word count
        Comparator<String> sentenceComparator = (s1, s2) ->
                countWords(s1) - countWords(s2);

        // Sort the sentences by word count
        Arrays.sort(sentences, sentenceComparator);

        // Print the sorted sentences
        for (String sentence : sentences) {
            System.out.println(sentence.trim());
        }
    }

    // Count the number of words in a sentence
    private static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}