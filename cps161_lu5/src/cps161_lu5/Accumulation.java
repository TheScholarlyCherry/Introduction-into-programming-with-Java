package cps161_lu5;

import java.util.Scanner;

public class Accumulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
	    int numb;
	    int count = 0;
	    int sum = 0;
	    double average;
		System.out.println("enter int, negative value to exit");
		numb = scan.nextInt();
		
		while(numb >= 0) 
		{
			System.out.println("numb is: " + numb);
			count++;
			sum = sum + numb;
			System.out.println("enter int, negative value to exit");
			numb = scan.nextInt();
		}
		average = sum/count;
		System.out.println("You entered " + count + " positive numbers or zeros, the sum is" + sum + " and the average is " + average);
		System.out.println("Outside of loop.");
		
		scan.close();
	}

} 