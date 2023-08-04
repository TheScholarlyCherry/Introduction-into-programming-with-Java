package mp4_bcherry;

public class Player 
{
	
	// Declaration of variables
	
    private String name;
    private String status;
    private int experience;
    private int level;
    private int currentHitPoints;
    private int maxHitPoints;
    private int damagePoints;
    
    public Player(String name, int experience, int currentHitPoints) 
    {
        this.name = name;
        this.experience = experience;
        this.currentHitPoints = currentHitPoints;
        this.status = "alive";
        
        this.level = this.experience / 100;
        if (this.level < 1) 
        {
            this.level = 1;
        }
        this.maxHitPoints = (int) (this.level * 100 * (1 + this.level / 10.0));
        this.damagePoints = this.level * 30;
    }
    
    // Getters
    
    public String getName() 
    {
        return name;
    }
    
    public String getStatus() 
    {
        return status;
    }
    
    public int getExperience() 
    {
        return experience;
    }
    
    public int getLevel() 
    {
        return level;
    }
    
    public int getCurrentHitPoints() 
    {
        return currentHitPoints;
    }
    
    public int getMaxHitPoints() 
    {
        return maxHitPoints;
    }
    
    public int getDamagePoints() 
    {
        return damagePoints;
    }
    
    // Setters
    
    public void setName(String name) 
    {
        this.name = name;
    }
    
    public void setStatus(String status) 
    {
        this.status = status;
    }
    
    // XP
    
    public void setExperience(int experience) 
    {
        this.experience = experience;
        updateLevel();
    }
    
    // Current HP
    
    public void setCurrentHitPoints(int currentHitPoints) 
    {
        this.currentHitPoints = currentHitPoints;
        if (this.currentHitPoints <= 0) 
        {
            this.status = "dead";
        }
        if (this.currentHitPoints > this.maxHitPoints) 
        {
            this.currentHitPoints = this.maxHitPoints;
        }
    }
    
    // Update player levels
    
    private void updateLevel() 
    {
        this.level = this.experience / 100;
        if (this.level < 1) 
        {
            this.level = 1;
        }
        this.maxHitPoints = (int) (this.level * 100 * (1 + this.level / 10.0));
        this.damagePoints = this.level * 30;
    }
    
    // Opponent
    
    public void battle(Player opponent) 
    {
        opponent.setCurrentHitPoints(opponent.getCurrentHitPoints() - this.damagePoints);
        this.currentHitPoints -= opponent.getDamagePoints();
        this.experience += 50;
        
        if (opponent.getCurrentHitPoints() <= 0) 
        {
            opponent.setStatus("dead");
        }
        if (this.currentHitPoints <= 0) 
        {
            this.status = "dead";
        }
    }
    
    public String toString() 
    {
        return "Player [name=" + name + ", status=" + status + ", experience=" + experience +
                ", level=" + level + ", currentHitPoints=" + currentHitPoints +
                ", maxHitPoints=" + maxHitPoints + ", damagePoints=" + damagePoints + "]";
    }
    
    // Main Method
    
    public static void main(String[] args) 
    {
        Player player1 = new Player("God Emperor Frodo ", 450, 10000);
        Player player2 = new Player("Plasmatic Poltergeist Mooka Dooka ", 230, 190);

        System.out.println("Before the battle:");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player1.getName() + " is battling " + player2.getName());

        player1.battle(player2);

        System.out.println("After the battle:");
        System.out.println(player1);
        System.out.println(player2);

        System.out.println("Battle again:");
        player1.battle(player2);

        System.out.println("After the battle:");
        System.out.println(player1);
        System.out.println(player2);
    }
}