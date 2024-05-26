package section6;
import java.util.*;

public class UserInput {
	
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
		int count =1;
	int sum=0;
	
	while(count<5) {
		System.out.println("Enter the number #"+count+" ");
		int number=input.nextInt();
		sum+=number;
		count++;
	}
	System.out.println("thr sum of number is "+sum);

	
	
	
	
	
	}
	

}
