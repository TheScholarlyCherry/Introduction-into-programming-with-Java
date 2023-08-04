
package cpa161_lu3_demo;
import java.util.Scanner;

public class TempConversionLU3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner scan = new Scanner(System.in); // Scanner
			
			// Declaration of Variables
			
			double cel_Temp = 0;
			double cel_Temp2;
			double fah_Temp = 0;
			double fah_Temp2;
			int conversion;
			
			// User Input
			
			System.out.println("Which unit would you like to convert?" + "\n \t 1) Fahrenheit" + "\n \t 2) Celsius");
			conversion = scan.nextInt();
			
			// Fahrenheit Conversion
			
			if (conversion == 1) {
				System.out.println("Please input your degrees in Fahrenheit: ");
				fah_Temp = scan.nextDouble(); // Input
				
				fah_Temp2 =(fah_Temp - 32)*5/9; // Processing
				
				System.out.printf(fah_Temp + " degrees Fahrenheit is " + fah_Temp2 + " degrees in Celsius.");	// Output
				
			}
			
			else if (conversion == 2) {
				System.out.println("Please input your degrees in Celsius: ");
				cel_Temp = scan.nextDouble(); // Input
				
				cel_Temp2 = (cel_Temp*9/5)+32; // Processing
				
				System.out.println(cel_Temp + " degrees Celsius is " + cel_Temp2 + " degrees in Fahrenheit."); // Output
			}
					
			else {
					System.out.println("Please enter a valid response.");
				}
			scan.close(); // closes scanner
			}		
		}
