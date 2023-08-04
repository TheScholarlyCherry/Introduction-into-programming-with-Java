package loxosceles0001;

public class Battle {
	String name;
	int level;
	
	Character(){
		level = 1;
	}
	
	void attack() {
		System.out.println(name + " attack!");
	}
}