package cps161_lu4;
import java.util.Scanner;
public class Height_Req_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int rider_height = 0;
		int height_requirement = 50;
		
		System.out.println("Please enter your heigh in Inches: ");
		rider_height = scan.nextInt();
		
		if (rider_height >= height_requirement) 
		{
			System.out.println("You are tall enough to ride.");
		}
		else 
		{
			System.out.println("You're short and should be sad.");
		} scan.close();
	}
}
