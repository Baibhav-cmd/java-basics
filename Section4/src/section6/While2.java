package section6;

public class While2 {

	public static void main(String[] args) {
int number=5,sum=0;
		while(number>0) {
			
			sum+=number;
			number++;
			
		}
		System.out.println("the sum of digit is  "+sumDigit(number));

	

	}
	
	public static int sumDigit(int number) {
		int sum=0;
		if (number<0) {
			return -1;
		}	
		else {
			return sum;
		}
		
	}

}
