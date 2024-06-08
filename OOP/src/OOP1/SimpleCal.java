package OOP1;

public class SimpleCal {

private double FirstNumber;
private  double SecondNumber;


public double getFirstNumber() {
	return FirstNumber;
}

//public void setFirstNumber(double firstNumber) {
//	this.FirstNumber = firstNumber;
//}

public double getSecondNumber() {
	return SecondNumber;
}

//public void setSecondNumber(double secondNumber) {
//	this.SecondNumber = secondNumber;
//}
 public double getadditionalresult() {
	 
	 return FirstNumber+SecondNumber;
 }
 
public SimpleCal(double firstnumber, double secondnumber) {
	this.FirstNumber=firstnumber;
	this.SecondNumber=secondnumber;
System.out.println("fully constructor");

}
public SimpleCal() {
	this(100,200);
	System.out.println("this is a empty constructor");
	
	
	
}

}
