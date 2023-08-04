package cpa161_lu3_demo;

public class stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0123456789
		//Good Morning Brandon!
		// charAt, Length, position, toLowerCase, toUpperCase
		//indexof, subString, equals
		
		
		// declaration of variables
		
		String greeting = "Good Morning ";
		String name = "Brandon!";
		String myStr;
		
		// Processing
		
		myStr = greeting + name;
		String myStr2 = "Good Morning Brandon!";
		
		// Output
		
		System.out.println(myStr);
		int size = myStr.length(); //length
		System.out.println("The size of the String: " + size);
		char myChar = myStr.charAt(2); // position
		System.out.println(myChar);
		String lowerStr = myStr.toLowerCase(); // to lower case
		System.out.println("myStr is: " + myStr);
		System.out.println("lowerStr is: " + lowerStr);
		int index = myStr.indexOf('d', 6); // Find a letter, returns first time the character shows.
		System.out.println("index is: " + index);
		System.out.println(myStr.indexOf("Brandon"));
		System.out.println(myStr.substring(4, 9));
		System.out.println((myStr.equals(myStr2)));
		System.out.println(myStr.equalsIgnoreCase(myStr2));

	}

}
