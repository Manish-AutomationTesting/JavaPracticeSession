package javaBasics;

public class PalinDromeNumber {

	public static void main(String[] args) {
		isPalinDrome(121);
		isPalinDrome(123);
		isPalinDrome(12321);
		isPalinDrome(12345);
	}

	// Palindrome Number
	// 121, 141, 12321, 151
	public static void isPalinDrome(int num) {
		int r = 0;
		int t;
		int sum = 0;
		t = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (t == sum) {
			System.out.println(t + " is a Palindrome Number.");

		} else {
			System.out.println(t + " is not a Palindrome Number.");
		}

	}

}
