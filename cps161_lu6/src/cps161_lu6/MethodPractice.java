package cps161_lu6;
import java.util.Scanner;
public class MethodPractice {
	
	public static int max(int maxVal) 
	{
		Scanner scan = new Scanner(System.in);
		int first = 0;
		int second = 0;
		
		System.out.println("Please enter two integers: ");
		first = scan.nextInt();
		second = scan.nextInt();
		
		if (first > second) 
		{
			maxVal = first;
		} else {maxVal = second;}
		
		scan.close();
		
		return maxVal;
	}

	public static void main(String[] args) 
	{
		int maxValue = 0;
		maxValue = max(maxValue);
		System.out.println("The maximum value is: " + maxValue);

	}
}
