package inheritance;

public class Vehicle {

	int wheel=4;
	int value=10;
	String CarName="BMW";

	Vehicle(){
		System.out.println("Vehicle-->constructor");
	}
	Vehicle(int j){
		System.out.println("1 Parameter cons");
		
	}
	public void engine(){
		System.out.println("Vehicle-->engine()");
	}
	//public final void start(){//can not override final method from vehicle
	public void start(){
		System.out.println("Vehicle--start()");
	}
	public void refule(){
		System.out.println("vehicle-->refule()");
	}
	
	public static void hiding(){
		System.out.println("Vehicle-->hiding()");
	}
}
