package section4;

public class Ch1 {

	
	public static void main(String[] args) {
   
		double first = 20.00, second=80.00;
		double sum = (first+second)*100;
		System.out.println(sum);
		
		double rem = sum%40;
		
		boolean value = rem==0 ? true:false;
		System.out.println(value);
		
	if(!value) {
		System.out.println("got some reminder");
	}
		
 
 
	}

}
