package cps161_LU10;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1, 2, 3, 4};
		int [] intArray;
		intArray = new int[5];
		//System.out.println(intArray);
		//System.out.println(intArray[0]);
		int sum = 0;
		double average;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random()*20)+1;
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	    for (int eachInt : intArray) {
			System.out.println(eachInt);
		}
		
		for (int eachInt : intArray) {
			System.out.println(eachInt);
			sum += eachInt;
			if(eachInt>max) {
				max = eachInt;
			}
			if (eachInt < min) {
				min = eachInt;
			}
			average = (double)sum/intArray.length;
			System.out.println("The sum is: " + sum);
			System.out.println("The average is: " + average);
			System.out.println("The max is: " + max);
			System.out.println("The min is: " + min);
		}
	}

}
