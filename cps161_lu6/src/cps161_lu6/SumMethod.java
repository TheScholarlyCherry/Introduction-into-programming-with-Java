package cps161_lu6;

public class SumMethod {
	// modifier returnValueType methodName (list of parameters){method body;}
	public static int sum(int startVal,int endVal) 
	{
		int total = 0;
		
		for(int i = startVal; i <= endVal; i++)
		{
			total += i;
		}
		return total;
	}
	
	public static void printSum(int startVal, int endVal) 
	{
		int total = 0;
		for (int i = startVal; i <= endVal; i++) 
		{
			total += i;
		}
		if (total > 40) {
		return;
		} else 
		{
		System.out.println("total is : " + total);
		}
		System.out.println("this is the end of printSum method");
		
	}
	
	public static void main(String[] args) 
	{
		
//		int sum = 0;
//		for(int i = 1; i <= 10; i++)
//		{
//			sum += i;
//		}
//		System.out.println("Sum from 1 to 10 is: " + sum);
//		
//		sum = 0;
//		for(int i = 11; i <=20 ; i++)
//		{
//			sum += i;
//		}
//		System.out.println("Sum from 11 to 20 is: " + sum);
		int startVal = 10;
		int endVal = 25;
		int total;
		total = sum(startVal, endVal);
		System.out.println(sum(8, 20));
		System.out.println("the total is: " + total);
		System.out.println("the total is: " + sum(startVal, endVal));
		printSum(30, 50);
	}

}
