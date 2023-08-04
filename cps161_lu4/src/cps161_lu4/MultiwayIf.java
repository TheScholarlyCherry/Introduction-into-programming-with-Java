package cps161_lu4;

public class MultiwayIf {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String light = "green";
		if (light.equals("red")) 
		{
			System.out.println("red means stop");
		} 
		else if (light.equals("yellow"))
		{
			System.out.println("Be careful");
		}
		else if (light.equals("green")) 
		{
			System.out.println("Go.");
		}
		else 
		{
			System.out.println("invalid");
		}
		System.out.println("continue driving");
	
		// ==, > <=, <, >=, !=
		System.out.println(3 ==4);
		System.out.println(3 >= 4);
		System.out.println( 3 != 4);
		int my_score = 100;
		int your_score = 200;
		int bonus = 0;
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
