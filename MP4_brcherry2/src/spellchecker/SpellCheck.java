package spellchecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class SpellCheck {

    private HashSet<String> dictionary = new HashSet<>();
    private TreeSet<String> missSpelledWords = new TreeSet<>();

    public SpellCheck() throws FileNotFoundException {
        // Read words from dictionary.txt and add them to the dictionary HashSet
        try (Scanner dictionaryScanner = new Scanner(new File("dictionary.txt"))) {
            while (dictionaryScanner.hasNext()) {
                String word = dictionaryScanner.next().toLowerCase();
                dictionary.add(word);
            }
        }
    }

    public void checkSpelling(String fileName) throws FileNotFoundException {
        System.out.println("======== Spell checking " + fileName + " ========");
        missSpelledWords.clear();

        try (Scanner fileScanner = new Scanner(new File(fileName)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                StringTokenizer tokenizer = new StringTokenizer(line, " \t,.;:-%'\"");

                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken().toLowerCase();

                    // Skip non-letter starting words
                    if (!Character.isLetter(word.charAt(0))) {
                        continue;
                    }

                    // Check if the word is in the dictionary or missSpelledWords
                    if (dictionary.contains(word) || missSpelledWords.contains(word)) {
                        continue;
                    }

                    // If the word ends with 's', try the singular version
                    if (word.endsWith("s")) {
                        String singularWord = word.substring(0, word.length() - 1);
                        if (dictionary.contains(singularWord) || missSpelledWords.contains(singularWord)) {
                            continue;
                        }
                    }

                    System.out.println("Misspelled word: " + word);
                    System.out.print("Do you want to add this word to the dictionary? (y/n): ");
                    Scanner userInput = new Scanner(System.in);
                    String response = userInput.nextLine();
                    userInput.close();

                    if (response.trim().equalsIgnoreCase("y")) {
                        dictionary.add(word);
                    } else {
                        missSpelledWords.add(word);
                    }
                }
            }
        }
    }

    public void dumpMissSpelledWords() {
        System.out.println("Misspelled words:");
        for (String word : missSpelledWords) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        try {
            SpellCheck spellCheck = new SpellCheck();

            for (String fileName : args) {
                System.out.println("Processing file: " + fileName);
                spellCheck.checkSpelling(fileName);
                spellCheck.dumpMissSpelledWords();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
