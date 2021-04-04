package javaBasics;

public class SwapNumber {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		int t;

		System.out.println("Before swap x=" + x);
		System.out.println("Before swap y=" + y);
		// 1.Without using third variable
		// x=x+y;
		// y=x-y;
		// x=x-y;
		// System.out.println("After swap x="+x);
		// System.out.println("After swap y="+y);
		// 2.Using third variable
		// t=y;
		// y=x;
		// x=t;
		// System.out.println("After swap x="+x);
		// System.out.println("After swap y="+y);

		// 3.
		x = x * y;// 50
		y = x / y;
		x = x / y;
		System.out.println("After swap x=" + x);
		System.out.println("After swap y=" + y);

	}

}
