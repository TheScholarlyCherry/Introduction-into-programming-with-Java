package cps161_lu4;
import java.util.Scanner; // import
public class TuitionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // scanner
		// Variables
		int f2fIN = 99;
		int f2fOUT = 176;
		int dlIN = 112;
		int dlOUT = 125;
		int credit_hours = 0;
		int f2f = 0;
		int district = 0;
		int total_cost = 0;
		
		System.out.println("Please enter (1) for Face to Face, or (2) for Distance Learning.");
		f2f = scan.nextInt();
		
		if (f2f == 1) 
		{
			System.out.println("Are you in district? Enter (1) for yes, or (2) for no.");
			district = scan.nextInt();
			if (district == 1) 
			{
				System.out.println("How many credit hours are you taking?");
				credit_hours = scan.nextInt();
				total_cost = f2fIN * credit_hours;
				System.out.println("Your total will be: $ " + total_cost);
			} 
			else 
			{
			System.out.println("How many credit hours are you taking?");
			credit_hours = scan.nextInt();
			total_cost = f2fOUT * credit_hours;
			System.out.println("Your total will be: $ " + total_cost);
			}
		} 
		else if (f2f == 2) 
		{
			System.out.println("Are you in district? Enter (1) for yes, or (2) for no.");
			district = scan.nextInt();
			if (district == 1) 
			{
				System.out.println("How many credit hours are you taking?");
				credit_hours = scan.nextInt();
				total_cost = dlIN * credit_hours;
				System.out.println("Your total will be: $ " + total_cost);
			} 
			else 
			{
			System.out.println("How many credit hours are you taking?");
			credit_hours = scan.nextInt();
			total_cost = dlOUT * credit_hours;
			System.out.println("Your total will be: $ " + total_cost);
			}
		} 
		scan.close();
	}
}
