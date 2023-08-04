package classPractice;
import java.text.DecimalFormat;
public class TempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Declaration of Variables
		
		double cel_Temp = 23.6;
		double cel_Temp2;
		double fah_Temp = 88.6;
		double fah_Temp2;	

		// Processing
		
		fah_Temp2 =(fah_Temp - 32)*5/9;
		cel_Temp2 = (cel_Temp*9/5)+32;
		
		//Rounds answers to two decimal places.
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		// Apply rounding by formatting the result
        String formattedResult = decimalFormat.format(fah_Temp2);
		
		// Output
		
		System.out.println(fah_Temp + " degrees Fahrenheit is " + formattedResult + " degrees in Celsius.");
		System.out.println(cel_Temp + " degrees Celsius is " + cel_Temp2 + " degrees in Fahrenheit.");
	}

}
