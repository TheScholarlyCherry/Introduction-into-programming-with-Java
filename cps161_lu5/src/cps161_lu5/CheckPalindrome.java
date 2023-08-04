package cps161_lu5;
import java.util.Scanner;
public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String myStr;
		
		System.out.println("Please enter a string: ");
		myStr = scan.nextLine();
		boolean ind = true;
		for (int i = 0; i < myStr.length()/2; i++) 
		{
			if (myStr.charAt(i) != (myStr.length()-1-i))
			{
				ind = false;
				break;
			}
			
			if (ind) 
			{
				System.out.println("it is a palindrome.");
			} else 
			{
				System.out.println("it is not a palindrome.");
			}
			// System.out.println(myStr.charAt(myStr.length()-1-i));
		}
	}

}
