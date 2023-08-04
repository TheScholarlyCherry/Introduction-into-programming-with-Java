package cps161_lu7;

public class PassingReferenceType {

	public static void ChangeTime(Time time) 
	{
		time.setHour(20);
	}
	
	public static void greeting(String name) 
	{
		name = "Hi " + name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time(1, 30, 30);
		System.out.println(time);
		ChangeTime(time);
		System.out.println(time);
		String name = new String("Brandon");
		System.out.println(name);
		greeting(name);
		System.out.println(name);
	}

}
