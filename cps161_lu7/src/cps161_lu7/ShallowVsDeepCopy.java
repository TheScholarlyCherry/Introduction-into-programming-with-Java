package cps161_lu7;

public class ShallowVsDeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time myTime = new Time(4, 50, 50);
		Time yourTime = new Time(10, 30, 30);
		// Shallow Copy
//		System.out.println("Shallow copy.");
//		System.out.println("My time: " + myTime);
//		System.out.println("Your time: " + yourTime);
//		myTime = yourTime;
//		System.out.println("My time: " + myTime);
//		System.out.println("Your time: " + yourTime);
// 		yourTime.setHour(14);
//		System.out.println("My time: " + myTime);
//		System.out.println("Your time: " + yourTime);
//		myTime.setHour(20);
//		System.out.println("My time: " + myTime);
//		System.out.println("Your time: " + yourTime);
		// Deep Copy
		System.out.println("Deep copy.");
		myTime = new Time(yourTime);
		System.out.println("My time: " + myTime);
		System.out.println("Your time: " + yourTime);
 		yourTime.setHour(14);
		System.out.println("My time: " + myTime);
		System.out.println("Your time: " + yourTime);
 		yourTime.setHour(20);
		System.out.println("My time: " + myTime);
		System.out.println("Your time: " + yourTime);
	}

}
