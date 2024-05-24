package section5;

public class Tur1 {

	public static void main(String[] args) {
		Highscore(1000);
		
		DisplayHighScorePostion("raju",1);

		
	}
	

	 public static void DisplayHighScorePostion(String Playername, int Playerpostion ) {
		
		 System.out.println("the name of player is "+Playername+" he has got "+Playerpostion+" postion");
		 
		 
		
		 
		 
	 } 
	 public static String Highscore (int score) {
		 if(score==1000) {
			 System.out.println("you have got first postion");
		 }
		 else if(score<=1000 && score >=500) {
			 System.out.println("you have got second postion");
		 }
		 
		 return "zero";
	 } 
      
}
