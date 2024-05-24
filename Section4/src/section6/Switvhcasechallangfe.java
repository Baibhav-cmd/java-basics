package section6;

public class Switvhcasechallangfe {

	public static void main(String[] args) {

		Daysinweek(1);

	}

	public static void Daysinweek(int days) {

		switch (days) {
		case 1 -> System.out.println("Sunday");
		case 2 -> System.out.println("Monday");
		case 3 -> System.out.println("Tuesday");
		case 4 -> System.out.println("Wensday");
		case 5 -> System.out.println("thursday");
		case 6 -> System.out.println("Friday");
		case 7 -> System.out.println("Saturday");

		default -> System.out.println("invalid days");

		}

	}

}
