package section6;

public class Forloop {

	public static void main(String[] args) {
		

		for(double rate=7.5;rate<=10;rate=rate+0.25 ) {
			
			double  amt=Interest(10000,rate);
				System.out.println(rate+" is rate and the amount is "+ " "+amt);
		}
	
	

	}
	public static double Interest(double amt, double interestrate) {
		
		return (amt*(interestrate/100));
	}

}
