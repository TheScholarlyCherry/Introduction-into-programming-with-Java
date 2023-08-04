package cps161_lu5;
import java.util.Scanner;
public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		boolean cont = true;
		String answer = "yes";
		
		while (cont)
		{
			System.out.println("Do you wish to continue?");
			answer = scan.next();
			if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"))
			{
				System.out.println("Process something.");
				cont = true;
			} 
			else if (answer.equalsIgnoreCase("no")|| answer.equalsIgnoreCase("n")) 	
			{
				cont = false;
			} else 
			{
				System.out.println("Invalid entry.");
			}
		 scan.close();
		}
	}
}
