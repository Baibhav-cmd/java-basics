package OOP1;

public class Tur1 {

	public static void main(String[] args) {
		
//          Car car=new Car();
		Car car=null;
          car.setMaker("tata");
          
          car.Describecar();
          System.out.println(car.getmaker());
          System.out.println("model = "+ car.getModel());
          System.out.println("doors = "+ car.getDoors());
	}

}
