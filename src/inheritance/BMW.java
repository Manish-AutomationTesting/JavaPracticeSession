package inheritance;

public class BMW extends Car {
	
	int value=100;
	
	BMW(){
		System.out.println("BMW--->Constructor");
	}
	
	public void musicSystem(){
		super.start();
		super.refule();
		System.out.println("BMW-->musicSystem()");
		
	}
	public void theifSafety(){
		System.out.println("BMW--->theifSafety()");
	}
	
	

}
