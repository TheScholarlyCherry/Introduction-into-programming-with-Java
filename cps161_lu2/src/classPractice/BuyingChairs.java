package classPractice;
import java.text.DecimalFormat;
public class BuyingChairs {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// Declaration of Variables
	
	double user_Funds = 100;
	int chair_Cost = 30;
	int chairs_Purchased;
	double remaining_Funds;
	
	// Processing 
	chairs_Purchased = (int) (user_Funds/chair_Cost);
	remaining_Funds = user_Funds%chair_Cost;
	
	//Rounds answers to two decimal places.
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	
	// Apply rounding by formatting the result
    String formattedResult = decimalFormat.format(remaining_Funds);
	
	// Output

    System.out.println("\t You could purchase " + chairs_Purchased + " chairs \n \t and the amount of money left after your purchase would be: $" + formattedResult);
    
	}

}
