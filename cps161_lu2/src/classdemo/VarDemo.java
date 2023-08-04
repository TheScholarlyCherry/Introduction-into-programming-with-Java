package classdemo;

public class VarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaration of Variables
		int firstNumb = 5;
		int secondNumb = 10;
		firstNumb = secondNumb; // Changes value of first variable.		
		double myDouble = 5.98;
		char myChar = 'a'; // USE SINGLE QUOTE. Only one character, more characters are a string.
		boolean myBool = true; // True or False. Only values booleans can have.
		
		// Double quote is a string, single quote is a character.
		
		// Output
		
		System.out.println("first number is: " + firstNumb); // Prints variable firstNumb. Concatenates string with first Numb 
		System.out.println(myDouble); // Prints myDouble variable
		System.out.println(myChar); // Prints myChar variable
		System.out.println(myBool); // Prints myBool variable
		
	}

}
