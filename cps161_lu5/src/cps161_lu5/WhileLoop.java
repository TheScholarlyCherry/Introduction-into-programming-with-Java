package cps161_lu5;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int numb = 11;
		
		while (numb < 10)
		{
			System.out.println("inside of while loop");
			System.out.println("numb is: " + numb);
			numb++;
		}
		do 
		{
			System.out.println("Inside of the do while loop.");
			System.out.println("numb is: " + numb);
			numb++;
		} while (numb < 10);
		System.out.println("outside of loop.");
		System.out.println("the final value of numb is: " + numb);
		*/
		
		// Scanner scan = new Scanner(System.in);
	    //int numb;
	    /*
		System.out.println("enter int, negative value to exit");
		numb = scan.nextInt();
		
		while(numb >= 0) 
		{
			System.out.println("numb is: " + numb);
			System.out.println("enter int, negative value to exit");
			numb = scan.nextInt();
		}
		*/
		
		/*do 
		{
			System.out.println("enter int, negative value to exit");
			numb = scan.nextInt();
			if (numb >= 0) 
			{
			System.out.println("numb is: " + numb);
			}
		} while (numb >= 0);
		System.out.println("outside of loop");
		scan.close(); */
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				System.out.println(i+j);
			}
			System.out.println();
		}
	}	

}
