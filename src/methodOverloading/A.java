package methodOverloading;

public class A {
	/*
	 * Duplicate method error at compile time public int foo(){ return 10; }
	 * public char foo(){ return 'a'; }
	 */
	public int foo(int i) {
		return 10;
	}

	public char foo() {
		return 'a';
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.foo(10));

	}

}
