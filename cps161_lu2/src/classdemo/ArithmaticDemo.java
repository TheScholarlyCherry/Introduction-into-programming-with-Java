package classdemo;

public class ArithmaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration of variables
		
		int firstNumb = 10;
		int secondNumb = 3;
		int addResult;
		int subResult;
		int mulResult;
		int divResult;
		int modResult;
		double doubleDivResult;
		
		// Processing
		
		addResult = firstNumb + secondNumb;
		subResult = firstNumb - secondNumb;
		mulResult = firstNumb * secondNumb;
		divResult = firstNumb / secondNumb;
		doubleDivResult = (double)firstNumb / secondNumb;
		modResult = firstNumb % secondNumb;
		// Output
		
		System.out.println("addResult is: " + addResult);
		System.out.println("subResult is: " + subResult);
		System.out.println("mulResult is: " + mulResult);
		System.out.println("divResult is: " + divResult);
		System.out.println("doubleDivResult is: " + doubleDivResult);
		System.out.println("modResult is: " + modResult);
		
		// Casting: short int long float double
		double myDouble = 5.5;
		int myInt = 7;
		// String myStr = "Hi";
		
		myInt = (int)myDouble;
		myDouble = myInt;
		System.out.println("myDouble: " + myDouble);
		System.out.println("myInt: " + myInt);
		
		// ++ adds one to the value of a variable, -- subtracts one from the value of a variable
		int n = 2;
		n++; // Can also use ++n. ++n will evaluate before n, n++ after		
		System.out.println("n is: " + n);
		System.out.println((n++)*2);
	}

}
