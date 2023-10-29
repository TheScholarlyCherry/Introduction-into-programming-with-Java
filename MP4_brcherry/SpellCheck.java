import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class SpellCheck 
{

    private HashSet<String> dictionary = new HashSet<>();
    private TreeSet<String> missSpelledWords = new TreeSet<>();
    private HashSet<String> addedToDictionary = new HashSet<>();

    public SpellCheck() throws FileNotFoundException 
    {
        try (BufferedReader dictionaryReader = new BufferedReader(new FileReader("dictionary.txt"))) 
        {
            String line;
            while ((line = dictionaryReader.readLine()) != null) 
            {
                String word = line.trim().toLowerCase();
                dictionary.add(word);
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    public void checkSpelling(String fileName) throws FileNotFoundException 
    {
        System.out.println("======== Spell checking " + fileName + " ========");
        missSpelledWords.clear();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) 
        {
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            String line;
            int lineCounter = 0;
            while ((line = fileReader.readLine()) != null) 
            {
                lineCounter++;
                StringTokenizer tokenizer = new StringTokenizer(line, " \t,.;:-%'\"");
                while (tokenizer.hasMoreTokens()) 
                {
                    String word = tokenizer.nextToken().toLowerCase();
                    if (!Character.isLetter(word.charAt(0))) 
                    {
                        continue;
                    }
                    if (dictionary.contains(word) || missSpelledWords.contains(word)) 
                    {
                        continue;
                    }
                    if (word.endsWith("s")) {
                        String singularWord = word.substring(0, word.length() - 1);
                        if (dictionary.contains(singularWord) || missSpelledWords.contains(singularWord)) 
                        {
                            continue;
                        }
                    }
                    System.out.println(lineCounter + " : " + line);
                    System.out.print(word + " not in dictionary. Add to dictionary? (y/n): ");
                    System.out.flush();
                    String response = userInputReader.readLine();
                    if (response.trim().equalsIgnoreCase("y")) 
                    {
                        dictionary.add(word);
                        addedToDictionary.add(word);
                    } else {
                        missSpelledWords.add(word);
                    }
                }
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    public void dumpMissSpelledWords() 
    {
        if (missSpelledWords.isEmpty()) 
        {
            System.out.println("====== No spelling errors found ======");
        } else {
            System.out.println("====== Misspelled words ======");
            for (String word : missSpelledWords) 
            {
                System.out.println(word);
            }
        }
    }

    public void dumpAddedToDictionary() 
    {
        if (!addedToDictionary.isEmpty()) 
        {
            System.out.println("====== Words added to the dictionary ======");
            for (String word : addedToDictionary) 
            {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) 
    {
        try {
            SpellCheck spellCheck = new SpellCheck();

            for (String fileName : args) 
            {
                System.out.println("Processing file: " + fileName);
                spellCheck.checkSpelling(fileName);
            }

            spellCheck.dumpMissSpelledWords(); // Misspelled words
            spellCheck.dumpAddedToDictionary(); // Added words
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

