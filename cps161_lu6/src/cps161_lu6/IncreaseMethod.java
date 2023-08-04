package cps161_lu6;

public class IncreaseMethod {
	public static int increase(int val) {
		val++;
		return val;
	}

	public static void main(String[] args) {
		int numb = 5;
		System.out.println("The value of numb is: " + numb);
		numb = increase(numb);
		System.out.println("after increase.");
		System.out.println("the value of numb is " + numb);
	}

}
