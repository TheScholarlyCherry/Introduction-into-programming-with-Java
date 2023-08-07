package basics;

public class Expression {

	public static void main(String[] args) {
		//9. Write a Java program to compute the specified expressions and print the output.
		//Test Data:
		//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))	
		
		double a = 25.5;
		double b = 3.5;
		double c = 40.5;
		double d = 4.5;
		
		System.out.println((a * b - b * b) / (c - d));
	}

}
