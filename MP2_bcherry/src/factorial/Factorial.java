package factorial;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); // Scanner
		// Variable
        String answer = "y";
        // Loop starts
        while (answer.equalsIgnoreCase("y")) {
            System.out.print("Enter in N: ");
            int n = scan.nextInt(); // User input
            // Computes factorial
            int factorial = 1;
            for (int i = n; i >= 1; i--) {
                factorial *= i;
            }
            // Output
            System.out.println("Factorial = " + factorial);

            System.out.print("Do you want to continue? (y/n): ");
            answer = scan.next();
        }

        System.out.println("\nHave a good day");

        scan.close();
	}

}
