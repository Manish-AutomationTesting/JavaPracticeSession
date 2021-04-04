package javaBasics;

public class MainMethodOverloading {

	public static void main(String[] args) {
		main(10);
		main(10, 20);
		main("Maneesh", 27, 40000.00);
	}

	public static void main(int x) {
		System.out.println("Main Method Overloading-1");
	}

	public static void main(int x, int y) {
		System.out.println("Main Method Overloading-2");
	}

	public static void main(String name, int age, double Sailary) {
		System.out.println("Main Method Overloading-3");
	}

}
