package cps161_lu11;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int dividend;
		int divisor;
		int result;
		
		Scanner scan = new Scanner(System.in);
		
	do {
		try 
		{
		System.out.println("Enter a dividend: ");
		dividend = scan.nextInt();
		System.out.println("Enter a divisor: ");		
		divisor = scan.nextInt();	
		result = dividend / divisor;
		System.out.println(dividend + "/" + divisor + " is " + result);
		System.out.println("Inside of try block");
		scan.close();
		break;
		} catch(InputMismatchException e) 
		{
			System.out.println("Mismatch");
			scan.nextLine();
		}
		catch(RuntimeException e) 
		{
			System.out.println("runtime exception");
			scan.nextLine();
		}
		catch(Exception e) 
		{
			System.out.println("oopsies, ya done goofed!");
			scan.nextLine();
		}
	   } while (true);
		System.out.println("This is in main");
  }

}
