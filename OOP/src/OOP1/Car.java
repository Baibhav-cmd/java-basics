package OOP1;

public class Car {
private String Maker="ford";
private String  Model="F20";
private String color="Gray";
private int doors=10;
private boolean Convertible=true;

//  using getter and setter for accessing private field
public String getmaker() {
	return Maker;
}
public String getModel() {
	return Model;
}
public String getColor() {
	return color;
}
public int getDoors() {
	return doors;
}
public boolean isConvertible() {
	return Convertible;
}

public void setMaker(String Maker) {
	if(Maker==null) Maker= "unKnown";
	String Lowercase=Maker.toLowerCase();
	switch(Lowercase) {
	case "holden","ford","suv"->this.Maker=Maker;
	
	default->{
	System.out.println("unreconigation");
	} }
	
}
public void setModel(String Model) {
	this.Model = Model;
}
public void setColor(String color) {
	this.color = color;
}
public void setDoors(int doors) {
	this.doors = doors;
}
public void setConvertible(boolean convertible) {
	this.Convertible = convertible;
}
public void Describecar() {
	
	System.out.println(doors+" doors"
			+ color +" "+
			Maker + "  "+
			Model+" "+
			(Convertible ? "Convertible":" False"));
	
}
}
