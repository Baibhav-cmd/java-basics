package Encusplation;

public class Main {

	public static void main(String[] args) {
		Player p1=new Player();
		p1.name="baibahv";
		p1.health=45;
		p1.weapon="gun";
		
		p1.loseHealth(18);
		System.out.println("remaning health is = "+p1.healthremaning(0));
		

	}

}
