package Encusplation;

public class Player {

	public String name;
	public int health;
	public String weapon;
	
	public void loseHealth (int damage) {
	health=health-damage;
		if(health<=0) {
			
			System.out.println("palyaeer Knockout");
		}
		
	}
	
	public void restoreHealth(int extrahealth) {
		health=health+extrahealth;
		if(health>100) {
			System.out.println("tit is full 100%");
			health=100;
		}
	}
	
	
	public  int healthremaning(int loseHealth) {
		return health;
	}
}
