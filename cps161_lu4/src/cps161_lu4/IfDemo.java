package cps161_lu4;

public class IfDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	/*	
		String light = "green";
		
		if (light.equals("red")) 
		{
			System.out.println("red means stop");
		} 
		else 
		{
			System.out.println("go");
		}
		System.out.println("continue driving");
	*/
		// ==, > <=, <, >=, !=
		System.out.println(3 ==4);
		System.out.println(3 >= 4);
		System.out.println( 3 != 4);
		int my_score = 100;
		int your_score = 200;
		int bonus;
		if(my_score > your_score) 
		{
			System.out.println("I win.");
			bonus = 50;
		}
		else
		{
			System.out.println("I still win..");
			bonus = 0;
		}
		int hours_worked = 50;
		if(hours_worked > 40) 
		{
			System.out.println("You get overtime pay.");
		}
	}
}
