package inheritance;

public class Test {

	public static void main(String[] args) {
		System.out.println("*****Car class object*****");
		Car c=new  Car();
		c.refule();
		c.engine();
		c.run();
		c.start();
		//Car.hiding();
		
		System.out.println("*****Vehicle Class object*****");
		Vehicle v=new Vehicle();
		//v.engine();
		v.refule();
		v.start();
		Vehicle.hiding();
		
		System.out.println("Child class objects is reffered by parent reference variable. This procees is known as run time polymophism.");
		Vehicle v1=new Car();
		v1.start();
		v1.refule();
		//v1.hiding();
		v1.engine();
		
		System.out.println("******BMW class obejest******");
		BMW b=new BMW();
		b.engine();
		b.musicSystem();
		b.refule();
		b.run();
		b.start();
		b.theifSafety();
		

	}

}

