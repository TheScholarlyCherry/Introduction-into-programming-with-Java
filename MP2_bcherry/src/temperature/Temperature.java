package temperature;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		 double totalCentigrade = 0.0;
	     double totalFahrenheit = 0.0;
	     int count = 0;

	     while (true) // Loop starts
	     {
	    	 System.out.print("Enter Temp in Centigrade or <= -100.0 to quit: ");
	         double centigrade = scan.nextDouble(); // User input
	         
	         if (centigrade <= -100.0)
	       {
	    	   break; // Exit the loop
	       }

	         double fahrenheit = (9.0 / 5.0) * centigrade + 32.0; // Calculate fahrenheit 
	         System.out.println("Temperature: F(" + fahrenheit + ") C(" + centigrade + ")");
	         // Calculations
	         totalCentigrade += centigrade;
	         totalFahrenheit += fahrenheit;
	         count++; // Adds to count
	        }
	        if (count > 0) {
	            double averageCentigrade = totalCentigrade / count; // Calculates averages
	            double averageFahrenheit = totalFahrenheit / count;
	            System.out.println("Average: Centigrade(" + averageCentigrade + ") Average: Fahrenheit(" + averageFahrenheit + ")");
	        }

	        scan.close(); // close scan

	}

}
