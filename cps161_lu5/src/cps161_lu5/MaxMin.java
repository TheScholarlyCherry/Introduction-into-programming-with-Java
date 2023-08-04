package cps161_lu5;
import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String answer;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int numb;
		
		do {
			System.out.println("Enter an interger.");
			numb = scan.nextInt();
			scan.nextLine();
			if (numb > max) 
			{ 
				max = numb;
			}
			
			if (numb < min) 
			{
				min = numb;
			}
			System.out.println("Do you want to continue?");
			answer = scan.nextLine();
			} while (answer.toLowerCase().charAt(0)=='y');
		System.out.println("The max value you entered is: " + max);
		System.out.println("The min value you entered is: " + min);
		
		scan.close();
	}

}
