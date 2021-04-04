package javaBasics;

public class PrimeNumberConcept {

	public static void main(String[] args) {
		// System.out.println(isPrimeNumber(2));
		// System.out.println(isPrimeNumber(13));
		// System.out.println(isPrimeNumber(11));
		// System.out.println(isPrimeNumber(13));
		// System.out.println(isPrimeNumber(9));
		primenuber(20);
	}
	// Prime Number
	// 2 3 5 7 11 13 17 19.....

	public static boolean isPrimeNumber(int num) {
		// Edge Corner
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void primenuber(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.println("" + i);
			}

		}

	}

}
