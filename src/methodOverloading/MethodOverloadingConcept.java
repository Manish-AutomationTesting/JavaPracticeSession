package methodOverloading;

public class MethodOverloadingConcept {
	int a = 10;
	String s1 = "Selenium";

	public void sum() {

	}

	public void sum(int i) {
		System.out.println(i);

	}

	public void sum(int i, int j) {

		System.out.println(i + j);
	}

	public void sum(int i, double d) {

		System.out.println(d + i);
	}

	public void sum(double d, int i) {
		System.out.println(d + i);

	}

	public static void main(String[] args) {
		MethodOverloadingConcept ob = new MethodOverloadingConcept();
		ob.sum();
		ob.sum(10);
		ob.sum(2.0, 10);

	}

	// we can over load main method also
	public static void main(int k) {

	}

	public static void main(int k, int j) {

	}

}
