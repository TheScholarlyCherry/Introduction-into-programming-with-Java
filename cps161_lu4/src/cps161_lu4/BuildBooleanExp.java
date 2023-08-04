package cps161_lu4;

public class BuildBooleanExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// and = &&,  or = ||
		int score = -5;
		if (score > 0 && score < 10) 
		{
			System.out.println("score is between 0 and 10");
		} 
		else 
		{ 
			System.out.println("Score is not between 0 and 10");
		}
		// less than 0 or grater than 10
		if (score < 0 || score > 10) 
		{
			System.out.println("score is less than 0 or greater than 10");
		} 
		else 
		{ 
			System.out.println("score is not less than 0 or greater than 10");
		}
		
		// score < 0 || score > -10
		// score < 0 && score > 10
		
		
	}

}
