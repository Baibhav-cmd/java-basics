package section6;

public class FoorloopChallange {

	public static void main(String[] args) {
		// prime number upto 50
		
		int num,divisor=5;
		
		for(num=2;num<divisor;num++) {
			if(divisor%num==0) {
				
				System.out.println(divisor +" is not prime number");
			}

			else {
				System.out.println(divisor +"is a prime number");
			}	
		}
		

	}

}
