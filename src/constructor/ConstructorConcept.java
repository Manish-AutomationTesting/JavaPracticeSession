package constructor;

public class ConstructorConcept {
	// class variable or Global variable
	String name = "Maneesh";
	int age = 12;

	ConstructorConcept() {
		System.out.println("No argument---> constructor or default constructor");
		System.out.println(name);
	}

	ConstructorConcept(int i) {
		System.out.println("1 argument---> constructor");
		System.out.println(age);
		this.name = "Pankaj";// Local variable
		this.age = 15;// Local variable
		System.out.println(name);
		System.out.println(age);
	}

	ConstructorConcept(int i, int j) {
		System.out.println("2 arguments--->constructor");
	}

	ConstructorConcept(String name, int age) {
		this.name = name;// Local variable
		this.age = age;// Local variable
		System.out.println("2 arguments--->constructor");
	}

	public static void main(String[] args) {
		ConstructorConcept cons = new ConstructorConcept();
		ConstructorConcept cons1 = new ConstructorConcept(10);
		ConstructorConcept cons2 = new ConstructorConcept(10, 10);
		ConstructorConcept cons3 = new ConstructorConcept("Maneesh", 10);

	}

}
