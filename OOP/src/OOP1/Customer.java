package OOP1;

public class Customer {

	private String name;
	private double limit;
	private String email;

	public String getname() {
		return name;
	}

	public double getlimit() {
		return limit;
	}

	public String getemail() {
		return email;
	}

	public Customer() {
		this("rajuy", "aa@gmail.com");

		System.out.println("it is an empty constructor");
	}

	public Customer(String name, double limit, String email) {
		this();
		this.name = name;
		this.email = email;
		this.limit = limit;
		System.out.println("name= " + name);
		System.out.println("limit= " + limit);
		System.out.println("email " + email);

	}

	public Customer(String name, String email) {
		
		this.email = email;
		this.name = name;
		System.out.println("name= " + name);
		System.out.println("email= " + email);

	}

}
