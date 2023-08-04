package TamagotchiPractice;

public class Tamagotchi {
	private String name;
	private int hunger;
	private int boredom;
	private static int numbOfPets;
	private String[] vocab = {"Hello", "Yo", "Epstein didn't kill himself.", "Bush did 9/11"};
	
	public String[] getVocab() {
		return vocab;
	}

	public void setVocab(String[] vocab) {
		this.vocab = vocab;
	}

	public static int getNumbOfPets() 
	{
		return numbOfPets;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public int getHunger() 
	{
		return hunger;
	}
	
	public void setHunger(int hunger) 
	{
		this.hunger = hunger;
	}
	
	public int getBoredom() 
	{
		return boredom;
	}
	
	public void setBoredom(int boredom) 
	{
		this.boredom = boredom;
	}
	
	public Tamagotchi(String name) 
	{
		super();
		this.name = name;
		hunger = 10;
		boredom = 10;
		numbOfPets++;
	}
	
	@Override
	public String toString() {
		String str = "";
		if(hunger > 30) 
		{
			str = str + name + " is hungry.\n";
		}
		if (boredom > 30) 
		{
			str = str + name +  " is bored.";
		}
		if(str.isEmpty()) 
		{
			str = name + " is happy.";
		}
		return "Tamagotchi [name=" + name + ", hunger=" + hunger + ", boredom=" + boredom + "]\n"
				+ str + "numb of pets: " + numbOfPets;
	}
	public void feed() 
	{
		System.out.println("Feeding " + name);
		hunger -= 5;
	}
	public void playing()
	{
		System.out.println("Playing with " + name);
		boredom -= 5;
	}
	public void timePassed(int hour) 
	{
		System.out.println(hour + " hours went by.");
		for (int i =0; i<hour; i++) 
		{
			hunger += 5;
			boredom += 5;
		}
	}
	public void speak() {
		int temp = (int) (Math.random()*3);
		System.out.println(vocab[temp]);
	}
}
