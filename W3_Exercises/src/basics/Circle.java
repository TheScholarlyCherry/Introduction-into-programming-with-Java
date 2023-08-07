package basics;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		11. Write a Java program to print the area and perimeter of a circle.
//		Test Data:
//		Radius = 7.5
//		Expected Output
//		Perimeter is = 47.12388980384689
//		Area is = 176.71458676442586
		
		double radius = 7.5;
		
		System.out.println("Perimeter: " + (2*Math.PI*radius));
		
		System.out.println("Area: " + ( Math.PI*radius*radius));
		
		

	}

}
