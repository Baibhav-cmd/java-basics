package OOP1;

public class inheritance {
 public static void main(String[] args) {
	
	 Animal animal =new Animal("generic","huge", 400);
	 doAnimal(animal,"slow");
	 
	 Dog dog =new Dog();
	 doAnimal(dog,"fast");
}
 public static void doAnimal(Animal animal,String speed ) {
	 
	 animal.move(speed);
	 animal.sound();
	 System.out.println(animal);
	 System.out.println("__________");
	  
	 
	 
	 
 }
}
