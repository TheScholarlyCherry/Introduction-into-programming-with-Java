package bill;
import java.util.Scanner;

public class Coco_Mama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declaration of variables

        String dish_one;
        int dish_one2;
        double dish_one3;
        double dish_one_total;

        String dish_two;
        int dish_two2;
        double dish_two3;
        double dish_two_total;

        String dish_three;
        int dish_three2;
        double dish_three3;
        double dish_three_total;

        double subtotal;
        double subtotal2;
        double tax = 0;
        double tip = 0;
        double total = 0;

        // Input

        System.out.println("Please input name of dish 1: ");
        dish_one = scan.nextLine();
        System.out.println("Please input quantity: ");
        dish_one2 = scan.nextInt();
        System.out.println("Please input the price of dish: ");
        dish_one3 = scan.nextDouble();

        System.out.println("Please input name of dish 2: ");
        scan.nextLine();
        dish_two = scan.nextLine();
        System.out.println("Please input quantity: ");
        dish_two2 = scan.nextInt();
        System.out.println("Please input the price of dish: ");
        dish_two3 = scan.nextDouble();

        System.out.println("Please input name of dish 3: ");
        scan.nextLine();
        dish_three = scan.nextLine();
        System.out.println("Please input quantity: ");
        dish_three2 = scan.nextInt();
        System.out.println("Please input the price of dish: ");
        dish_three3 = scan.nextDouble();

        // Processing

        dish_one_total = dish_one2 * dish_one3;
        dish_two_total = dish_two2 * dish_two3;
        dish_three_total = dish_three2 * dish_three3;
        subtotal = dish_one_total + dish_two_total + dish_three_total;
        tip = subtotal * 0.06;
        subtotal2 = subtotal + tip;
        tax = subtotal2 * 0.18;
        total = subtotal2 + tax;

        // Output

        System.out.println("\t======== Your Order ========");
        System.out.println("Dish\t\t\tQuantity\tPrice\tTotal");
        System.out.printf("%s\t\t%d\t\t%.2f\t%.2f%n", dish_one, dish_one2, dish_one3, dish_one_total);
        System.out.printf("%s\t%d\t\t%.2f\t%.2f%n", dish_two, dish_two2, dish_two3, dish_two_total);
        System.out.printf("%s\t\t%d\t\t%.2f\t%.2f%n", dish_three, dish_three2, dish_three3, dish_three_total);
        System.out.println("");
        System.out.println("\t======== Your Total ========");
        System.out.printf("Subtotal:\t\t%.2f%n", subtotal);
        System.out.printf("18%% tip (before tax):\t%.2f%n", tip);
        System.out.printf("6.00%% sales tax:\t%.2f%n", tax);
        System.out.printf("Total:\t\t\t%.2f%n", total);
        
        scan.close();
    }
}

