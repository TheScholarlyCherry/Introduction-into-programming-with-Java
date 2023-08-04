package cps161_lu4;
import java.util.Scanner;
public class FinalGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double user_grade;
		
		System.out.println("Please enter your score: ");
		user_grade = scan.nextDouble();
		
		if (user_grade >= 90) 
		{
			System.out.println("You got an A.");
		} 
		else if (user_grade >= 80 && user_grade < 90) 
		{
			System.out.println("You got a B.");
		}
		else if (user_grade >= 70 && user_grade < 80) 
		{
			System.out.println("You got a C.");
		}
		else if (user_grade >= 60 && user_grade < 70) 
		{
			System.out.println("You got a D.");
		}
		else 
		{
			System.out.println("You got an F.");
		}
		scan.close();
	}

}
