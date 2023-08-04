package mp3_bcherry;
import java.util.Scanner;
public class NewtonSquareRootProblem 
{
	public static double mySQRT(double N)
	{
		// Variables
        double lastGuess = N / 2; // Initial guess
        double newGuess = ((N / lastGuess) + lastGuess) / 2;
        double accuracy = Math.abs(newGuess - lastGuess);
        
        while (accuracy >= 0.000001) // While loop for accuracy
        {
            lastGuess = newGuess;
            newGuess = ((N / lastGuess) + lastGuess) / 2;
            accuracy = Math.abs(newGuess - lastGuess);
        }
        
        return newGuess;
    }  
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); // Scanner
        
        System.out.print("Enter a number for Newton's square root calculation: ");
        double N = scan.nextDouble(); // User Input
        
        double mySQRTResult = mySQRT(N);
        double mathSQRTResult = Math.sqrt(N);
        
        System.out.println("mySQRT(" + N + ") = " + mySQRTResult);
        System.out.println("Math.sqrt(" + N + ") = " + mathSQRTResult);
        scan.close();
    }
}