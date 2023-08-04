package cps161_lu8;
import java.util.Scanner;
public class PasswordPractice {
	
	// Password Requirements
	public static boolean isLongEnough(String password)
	{
		if(password.length() < 10) 
		{
			return false;
		}
		return true;
	}
	
	public static boolean hasUpperCase(String password) 
	{
		for (int i = 0; i < password.length(); i++) 
		{
			if (Character.isUpperCase(password.charAt(i))) 
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasLowerCase(String password) 
	{
		for (int i = 0; i < password.length(); i++) 
		{
			if(Character.isLowerCase(password.charAt(i))) 
			{
				return true;
			}
		} 
		return false;
	}
	
	public static boolean hasNumber(String password) 
	{
		for (int i = 0; i < password.length(); i++) 
		{
			if (Character.isDigit(password.charAt(i))) 
			{
				return true;
			}
		} 
		return false;
	}
	// Main, user prompts
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String password;
		System.out.println("Enter your password: ");
		password = scan.nextLine();
		
		StringBuilder msg = new StringBuilder();
		if(!isLongEnough(password))
		{
			msg.append("Password needs to be at least 10 characters long.");
			msg.append("\n");
		}
		
		if(!hasUpperCase(password))
		{
			msg.append("Password must contain an uppercase letter.");
			msg.append("\n");
		}
		
		if(!hasLowerCase(password))
		{
			msg.append("Password must contain a lowercase letter.");
			msg.append("\n");
		}
		
		if(!hasNumber(password))
		{
			msg.append("Password must contain a number.");
			msg.append("\n");
		}
		
		System.out.println(msg);
		

	}

}
