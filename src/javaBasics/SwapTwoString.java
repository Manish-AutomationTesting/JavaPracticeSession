package javaBasics;

public class SwapTwoString {

	public static void main(String[] args) {
		String x = "Hellow";
		String y = "World";
		System.out.println("Before Swap x=" + x);
		System.out.println("Before Swap y=" + y);
		x = x + y;
		y = x.substring(0, x.length() - y.length());
		System.out.println("After Swap y=" + y);
		x = x.substring(y.length());
		System.out.println("After Swap x=" + x);

	}

}
