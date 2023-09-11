package task2;

public class Main {
    public static void main(String[] args) {
        // Sample text from the internet
        String text = "In every sentence of the text, swap the first and last words. " +
                "Do this without changing the sentence length.";

        // Split the text into sentences
        String[] sentences = text.split("\\.");

        // Process each sentence
        for (String sentence : sentences) {
            String modifiedSentence = swapFirstLastWords(sentence.trim());
            System.out.println(modifiedSentence);
        }
    }

    // Swap the first and last words in a sentence
    private static String swapFirstLastWords(String sentence) {
        String[] words = sentence.split("\\s+");

        if (words.length > 1) {
            String firstWord = words[0];
            String lastWord = words[words.length - 1];

            words[0] = lastWord;
            words[words.length - 1] = firstWord;
        }

        return String.join(" ", words);
    }

}
