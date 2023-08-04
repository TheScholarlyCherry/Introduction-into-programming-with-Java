package make_change;
import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); // scanner
		
		// Declaration of Variables
		
		int price_dollars;
		int price_cents;
		int price;
		int dollars_received;
		int cents_received;
		int received;
		int change;
		int change_in_pennies;
		int pennies;
		int nickels;
		int dimes;
		int quarters;
		int dollars = 0;
		
		// Input Price
		
		System.out.println("Please enter price in dollars: ");
		price_dollars = scan.nextInt();
		System.out.println("Please enter price in cents: ");
		price_cents = scan.nextInt();
		
		// Input Received
		
		System.out.println("Please enter money received in dollars: ");
		dollars_received = scan.nextInt();
		System.out.println("Please enter money received in cents: ");
		cents_received = scan.nextInt();		
				
		// Processing the change in dollars and cents
		
		price = price_dollars * 100 + price_cents;
		received = dollars_received * 100 + cents_received;
		change = received - price;
		dollars = change / 100;
		change_in_pennies = change % 100;

		// Processing the number of quarters, dimes, nickels, and pennies
		
		quarters = change_in_pennies / 25;
		change_in_pennies %= 25;

		dimes = change_in_pennies / 10;
		change_in_pennies %= 10;

		nickels = change_in_pennies / 5;
		pennies = change_in_pennies % 5;
			
		// Output
		
		System.out.println("Change returned:");
        System.out.println(dollars + " dollar(s)");
        System.out.println(quarters + " quarter(s)");
        System.out.println(dimes + " dime(s)");
        System.out.println(nickels + " nickel(s)");
        System.out.println(pennies + " pennies");

        scan.close();
	}
}
