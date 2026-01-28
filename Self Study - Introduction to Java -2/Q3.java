import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class WordCount {

    public static void main(String[] args) {

        // Check command line arguments
        if (args.length != 2) {
            System.out.println("Usage: java WordCount <filename> <word>");
            return;
        }

        String fileName = args[0];
        String wordToFind = args[1];
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Split line into words (removing punctuation)
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToFind)) {
                        count++;
                    }
                }
            }

            System.out.println("The word '" + wordToFind + "' occurred " + count + " times in the file.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
