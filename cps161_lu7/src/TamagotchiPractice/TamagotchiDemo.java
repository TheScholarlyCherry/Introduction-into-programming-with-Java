package TamagotchiPractice;

public class TamagotchiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 5;
		System.out.println("number of pets: " + Tamagotchi.getNumbOfPets());
		Tamagotchi luna = new Tamagotchi("Luna");
		System.out.println("Number of pets: " + Tamagotchi.getNumbOfPets());
		Tamagotchi maxwell = new Tamagotchi("Maxwell");
		System.out.println("Number of pets: " + Tamagotchi.getNumbOfPets());
		System.out.println(luna);
		System.out.println(maxwell);
		luna.speak();
		maxwell.speak();
		luna.timePassed(hour);
		System.out.println(luna);
		luna.feed();
		System.out.println(luna);
		luna.playing();
		System.out.println(luna);
	}

}
