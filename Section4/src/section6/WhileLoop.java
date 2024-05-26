package section6;

public class WhileLoop {

	public static void main(String[] args) {
		
		int num=5;
		while(num<20) {
			if(num%2==0) {
				System.out.println(num+" is  even"+isEvenNumber(num));
				
			}
			else {
				System.out.println(num+" is even  number"+isEvenNumber(num));
			}
			num++;
		}
		
	
		
	
	
	
	
	
	
	}
	public static boolean isEvenNumber(int number) {
		if(number%2==0) {
			return true;
		}
		
		else {
			
			return false;
		}		
	} 

}
