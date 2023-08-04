package cps161_lu6;
import java.util.Scanner;
public class PalindromeMethod {
	public static boolean isPalindrome(String myStr) 
	{
		for (int i = 0; i < myStr.length()/2; i++) 
		{
			if (myStr.charAt(i) != (myStr.length()-1-i))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String myStr;
		System.out.println("Please enter a string.");
		myStr = scan.nextLine();
		if(isPalindrome(myStr)) 
		{
			System.out.println("It is a palindrome.");
		} else
		{
			System.out.println("Not a palindrome.");
		}

	}

}
