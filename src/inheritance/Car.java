package inheritance;

public class Car extends Vehicle {
	//class variable
	int value=100;
	int wheel=4;

	Car(){
		super(10);
		System.out.println("Car class--->Constructor");
	}
	public void start(){
		System.out.println("Car--->start()");
	}

	public void engine() {
		System.out.println("Car-->engine()");
	}
	public void run(){
		System.out.println("Car--> Run()");
	}
	public static void hiding(){
		System.out.println("Car--->hiding()");
	}
}
