package javaBasics;

public class FindLargestSmallestNumber {

	public static void main(String[] args) {
		int number[] = { 10, -15, 100, 300, -5, 1000, 3000, -3000 };

		int largest = number[0];
		int smallest = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			} else if (number[i] < smallest) {
				smallest = number[i];
			}

		}
		System.out.println("largest number=" + largest);
		System.out.println("Smallest number=" + smallest);
	}

}
