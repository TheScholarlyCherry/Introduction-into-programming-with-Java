package cps161_lu5;
import java.util.Scanner;
public class Boundpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int start;
		int upper;
		int step;
		
		System.out.println("Please enter a starting point.");
		start = scan.nextInt();
		System.out.println("Please enter the upper bound.");
		upper = scan.nextInt();
		System.out.println("Please enter amount to step.");
		step = scan.nextInt();
		int counter = 1;
		for (int i = start; i <= upper; i += step) 
		{
			System.out.println(i + " ");
			if(counter %5 == 0) 
			{
				System.out.println();
			}
		}
		
		scan.close();		
	}
}
