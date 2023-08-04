package cps161_lu7;

public class Timedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time();
		//System.out.println(time.getHour());
		//time.setHour = 23;
		//time.displayTime();
		System.out.println(time);
		Time time2 = new Time(13, 50, 50);
		System.out.println(time2);
		//time2.displayTime();
		Time time3 = new Time(time2);
		System.out.println(time3);
		//time3.displayTime();
		System.out.println(time2 == time3);
		System.out.println(time2.equals(time3));
	}

}
