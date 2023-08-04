package mp3_bcherry;
import java.util.Scanner;
public class RomanCalculatorProblem {

	public static int romanToDecimal(String romanNumeral) 
	{
        romanNumeral = romanNumeral.toUpperCase();
        int decimal = 0;

        for (int i = 0; i < romanNumeral.length(); i++) 
        {
            char currentChar = romanNumeral.charAt(i);

            if (i < romanNumeral.length() - 1) 
            {
                char nextChar = romanNumeral.charAt(i + 1);
                if (getRomanValue(nextChar) > getRomanValue(currentChar)) 
                {
                    decimal -= getRomanValue(currentChar);
                } else 
                {
                    decimal += getRomanValue(currentChar);
                }
            } else 
            {
                decimal += getRomanValue(currentChar);
            }
        }

        return decimal;
    }

    public static String decimalToRoman(int decimal) 
    {
        StringBuilder romanNumeral = new StringBuilder();
        int[] decimalValues = {1000, 500, 100, 50, 10, 5, 1};
        String[] romanSymbols = {"M", "D", "C", "L", "X", "V", "I"};

        for (int i = 0; i < decimalValues.length; i++) 
        {
            while (decimal >= decimalValues[i]) {
                romanNumeral.append(romanSymbols[i]);
                decimal -= decimalValues[i];
            }
        }

        return romanNumeral.toString();
    }

    public static int getRomanValue(char romanSymbol) 
    {
        switch (romanSymbol) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String operator;
        do 
        {
            System.out.print("Enter Operator (+, -, *, /): ");
            operator = scanner.nextLine().trim();
            
            if (!operator.matches("[+\\-*/]")) 
            {
                System.out.println("Invalid operator, please enter a valid operator.");
            }
        } 
        while (!operator.matches("[+\\-*/]"));

        String operand1;
        do {
            System.out.print("Enter first operand: ");
            operand1 = scanner.nextLine().trim();
            
            if (!operand1.matches("[IVXLCDMivxlcdm]+")) 
            {
                System.out.println("Invalid operand, please enter a valid Roman numeral.");
            }
        } while (!operand1.matches("[IVXLCDMivxlcdm]+"));

        String operand2;
        do 
        {
            System.out.print("Enter second operand: ");
            operand2 = scanner.nextLine().trim();
            if (!operand2.matches("[IVXLCDMivxlcdm]+")) 
            {
                System.out.println("Invalid operand, please enter a valid Roman numeral.");
            }
        } while (!operand2.matches("[IVXLCDMivxlcdm]+"));

        int decimal1 = romanToDecimal(operand1);
        int decimal2 = romanToDecimal(operand2);
        int result = 0;

        switch (operator) 
        {
            case "+":
                result = decimal1 + decimal2;
                break;
            case "-":
                result = decimal1 - decimal2;
                break;
            case "*":
                result = decimal1 * decimal2;
                break;
            case "/":
                result = decimal1 / decimal2;
                break;
        }

        String romanResult = decimalToRoman(Math.abs(result));
        if (result < 0) 
        {
            romanResult = "-" + romanResult;
        }

        System.out.println("Answer = " + romanResult);

        scanner.close();
    }
}
