package TamagotchiPractice;

public class PartArrayDemo {
	private Tamagotchi[] pets; // null
	private int maxNumbOfPets;
	private int currentNumbOfPets;
	public PartArrayDemo(int maxNumbOfPets) {
		this.maxNumbOfPets = maxNumbOfPets;
		pets = new Tamagotchi[maxNumbOfPets];
	}

	public void add(Tamagotchi newPet) {
//		for (int i = 0; i<pets.length; i++) {
//			if(pets[i] == null) {
//				pets[i] = newPet;
//				break;
//			}
//		}
		if(currentNumbOfPets < maxNumbOfPets) {
			pets[currentNumbOfPets++] = newPet;
		} else {
			System.out.println("overflowing, cannot add");
			}
	}
	public void displayAll() {
		for (Tamagotchi tamagotchi : pets) {
			tamagotchi.speak();
			System.out.println(tamagotchi);
			}
		}
		public void allSpeak() {
//			for (Tamagotchi tamagotchi : pets) {
//				if (Tamagotchi!=null) {
//					tamagotchi.speak();
//				}
//			}
//		}
			for(int i=0; i<currentNumbOfPets; i++) {
				pets[i].speak();
			}
	}
	public static void main(String[] args) {
		PartArrayDemo myPets = new PartArrayDemo(5);
		myPets.add(new Tamagotchi("Luna"));
		myPets.add(new Tamagotchi("Maxwell"));
		myPets.add(new Tamagotchi("NookNook"));
		myPets.add(new Tamagotchi("KookKook"));
		myPets.add(new Tamagotchi("TookTook"));
		myPets.displayAll();
	}
}
