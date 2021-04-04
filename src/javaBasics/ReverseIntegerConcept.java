package javaBasics;

public class ReverseIntegerConcept {

	public static void main(String[] args) {
		// 1.
		int num = 12345;
		int r = 0;
		int rev = 0;

		while (num > 0) {
			r = num % 10;
			rev = (rev * 10) + r;
			num = num / 10;
		}
		System.out.println("Reverse Number=" + rev);

		// 2.
		int number = 12345;
		StringBuffer sb = new StringBuffer(String.valueOf(number)).reverse();
		System.out.println(sb);

	}

}
