package cps161_lu11;
import java.util.Scanner;
public class ThrowDemo 
{
	public static void mustBeThree() throws Exception 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter 3: ");
		try 
		{
			if(scan.nextInt()!=3) 
			{
			throw new Exception("must enter 3");
	    	}
			return;
        } 
		catch(Exception e) 
				{	
        		} 
		finally 
				{
        		System.out.println("Finally");
				}
		System.out.println("Outside of try catch.");
	}

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		//try {
			mustBeThree();
		//} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
	}
}
