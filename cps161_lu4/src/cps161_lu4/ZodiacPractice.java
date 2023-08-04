package cps161_lu4;
import java.util.Scanner;
public class ZodiacPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int year = 0;
		String zodiac;
		
		System.out.println("Please input your birth year.");
		year = scan.nextInt();
		
		zodiac = switch (year) 
		{
		case 1984 -> "Rat";
		case 1985 -> "Ox";
		case 1986 -> "Tiger";
		case 1987 -> "Rabbit";
		case 1988 -> "Dragon";
		case 1989 -> "Snake";
		case 1990 -> "Horse";
		case 1991 -> "Goat";
		case 1992 -> "Monkey";
		case 1993 -> "Rooster";
		case 1994 -> "Dog";
		case 1995 -> "Pig";
		default -> "Invalid.";
		};
		System.out.println("Your zodiac is: " + zodiac);
		scan.close();
	}	
}
