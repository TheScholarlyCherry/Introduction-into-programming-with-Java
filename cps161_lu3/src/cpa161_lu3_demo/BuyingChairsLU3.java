package cpa161_lu3_demo;

import java.util.Scanner; // scanner utility import

public class BuyingChairsLU3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Scanner
		
		// Declaration of variables
		
		double user_funds = 0;
		double chair_cost = 0;
		int number_of_chairs = 0;
		double remaining_funds = 0;
		
		// User Input
		
		System.out.println("Please enter your funds.");
		user_funds = scan.nextDouble();
		System.out.println("Please enter the cost of the chairs.");
		chair_cost = scan.nextDouble();
		
		number_of_chairs = (int) (user_funds / chair_cost);
		remaining_funds = user_funds % chair_cost;
		
		System.out.printf("You can purches " + number_of_chairs + " chairs and you will have $ " + remaining_funds + " remaining.");
		
		scan.close();
		
	}

}
