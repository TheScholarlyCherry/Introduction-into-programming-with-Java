package alphabet;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		char start = 'a';
        char end = 'z';
        
        // Loop
        for (char ch = start; ch <= end; ch++) { // Loops until outputting "z"
            String letterType;

            switch (ch) { // Switch. Identifies the vowels, defaults to consonants.
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    letterType = "vowel";
                    break;
                default:
                    letterType = "consonant";
                    break;
            }

            System.out.println(ch + " is a " + letterType); // Output
	}
  }
}
