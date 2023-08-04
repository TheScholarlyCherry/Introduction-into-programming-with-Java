package fizz;

public class Fizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0; // Counter variable

        for (int i = 1; i <= 100; i++) { // For loop
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz "); // Multiples of 2 and 5
            } else if (i % 3 == 0) {
                System.out.print("Fizz "); // Multiples of 3
            } else if (i % 5 == 0) {
                System.out.print("Buzz "); // Multiples of 5
            } else {
                System.out.print(i + " ");
            }

            count++; // Count increase
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }

	}

}
