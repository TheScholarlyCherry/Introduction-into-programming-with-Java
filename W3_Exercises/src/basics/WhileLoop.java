package basics;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to multiplication table.");
		int x = scan.nextInt();
		
		for (int i = 0; i < 11; i++) {
			int equals = x*i;
			System.out.println(equals);
		}
		
		scan.close();
	}

}
