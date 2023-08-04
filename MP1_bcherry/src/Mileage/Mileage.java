package Mileage;
import java.util.Scanner; // scanner import
public class Mileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); // scanner
		
		// Declaration of Variables
		
		double gas_consumed = 0;
		double distance_traveled = 0;
		double mpg = 0;
		
		// Input
		
		System.out.println("Please enter amount of gasoline (in gallons) consumed: ");
		gas_consumed = scan.nextDouble();
		System.out.println("Please input distance (in miles) traveled: ");
		distance_traveled = scan.nextDouble();
		
		// Processing
		
		mpg = distance_traveled/gas_consumed;
		
		System.out.printf("Your MPG is: %6.2f", mpg);
	}

}
