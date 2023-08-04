package jar;
import java.util.Scanner;
public class Jar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // declaration of variables

        double penny;
        double nickel;
        double dime;
        double quarter;
        double total = 0;

        // Input

        System.out.println("Please input number of Pennies in the Jar: ");
        penny = scan.nextDouble();
        System.out.println("Please input number of Nickels in the Jar: ");
        nickel = scan.nextDouble();
        System.out.println("Please input number of Dimes in the Jar: ");
        dime = scan.nextDouble();
        System.out.println("Please input number of Quarters in the Jar: ");
        quarter = scan.nextDouble();

        // Processing

        total = penny * 0.01 + nickel * 0.05 + dime * 0.10 + quarter * 0.25;

        // Output

        System.out.printf("You have a total of $%.2f%n", total);
        
        scan.close();
    }
}
