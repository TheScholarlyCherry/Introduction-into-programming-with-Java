package cps161_lu6;
import java.util.Scanner;
public class GradeMethod {
	
	public static char finalGrade(double score) 
	{
		if (score >= 90) 
		{
			return 'A';
		} 
		else if (score >= 80) 
		{
			return 'B';
		}
		else if (score >= 70) 
		{
			return 'C';
		}
		else if (score >= 60) 
		{
			return 'D';
		}
		else 
		{
			return 'F';
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double score;
		System.out.println("Enter grade: ");
		score = scan.nextDouble();
		System.out.println("Your final grade is: " + finalGrade(score));
	}
}
