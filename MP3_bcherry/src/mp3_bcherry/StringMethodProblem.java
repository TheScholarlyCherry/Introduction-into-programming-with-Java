package mp3_bcherry;
import java.util.Scanner;
public class StringMethodProblem 
{
	public static int countOccurrences(String str, String subStr) 
	{
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(subStr, index)) != -1) 
        {
            count++;
            index += subStr.length();
        }
        return count;
    }
    
    public static int countUppercaseLetters(String str) 
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) 
            {
                count++;
            }
        }
        return count;
    }
    
    public static String pigLatin(String word) 
    {
        word = word.toLowerCase();
        String vowels = "aeiou";
        int index = -1;
        for (int i = 0; i < word.length(); i++) 
        {
            if (vowels.contains(String.valueOf(word.charAt(i)))) 
            {
                index = i;
                break;
            }
        }
        if (index == -1) {
            // No vowels found, return the word as is
            return word;
        }
        String beginning = word.substring(0, index);
        String end = word.substring(index);
        return end + beginning + "ay";
    }
    
    public static void main(String[] args) // Testing
    {
        Scanner scanner = new Scanner(System.in);
        
        // Test to count occurrences
        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter a word to count occurrences: ");
        String word = scanner.nextLine();
        int occurrences = countOccurrences(sentence, word);
        System.out.println("Occurrences of \"" + word + "\": " + occurrences);
        
        // Test for counting upper case letters
        System.out.print("Enter text to count upper case letters: ");
        String text = scanner.nextLine();
        int uppercaseCount = countUppercaseLetters(text);
        System.out.println("Uppercase letters count: " + uppercaseCount);
        
        // Test for pigLatin
        System.out.print("Enter a word to convert to Pig Latin: ");
        String originalWord = scanner.nextLine();
        String pigLatinWord = pigLatin(originalWord);
        System.out.println("Pig Latin of \"" + originalWord + "\": " + pigLatinWord);
        
        scanner.close();
    }
}
