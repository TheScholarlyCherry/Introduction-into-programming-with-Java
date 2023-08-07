package basics;
import java.util.Scanner;

public class Input_and_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5. Write a Java program that takes two numbers as input and displays the product of two numbers.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number.");
		double x = scan.nextDouble();
		System.out.println("Enter the second number.");
		double y = scan.nextDouble();
		double equals = x * y;
		System.out.println(equals);
		
		scan.close();
	}

}
