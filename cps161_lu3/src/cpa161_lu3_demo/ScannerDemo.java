package cpa161_lu3_demo;

import java.util.Scanner; // utility import for scanner

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); //scanner
		
		// declaration of variables
		int myInt;
		int yourInt;
		double myDouble;
		String myStr;
		
		// Scans and inputs
		
		System.out.println("Please enter 2 integers.");
		myInt = scan.nextInt();
		yourInt = scan.nextInt();
		System.out.println("Please enter a double value.");
		myDouble = scan.nextDouble();
		System.out.println("Please enter a string.");
		myStr = scan.next(); // [Pauses after line]
		myStr = scan.nextLine(); // [Doesn't pause after line]
		
		// Outputs
		
		System.out.println("myInt: " + myInt);
		System.out.println("yourInt: " + yourInt);
		System.out.println("myDouble: " + myDouble);
		System.out.println("myString: " + myStr);
		
		scan.close();
	}

}
