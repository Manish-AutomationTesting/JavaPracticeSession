package javaBasics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(407);
		isArmstrongNumber(121);
	}
	// Armstrong Number
	// 153=
	// 1*1*1=1
	// 5*5*5=125
	// 3*3*3=27

	public static void isArmstrongNumber(int num) {
		int cube = 0;
		int r = 0;
		int t;
		t = num;
		while (num > 0) {
			r = num % 10;
			cube = cube + r * r * r;
			num = num / 10;

		}
		if (t == cube) {
			System.out.println(t + " is a Armstrong Number");

		} else {
			System.out.println(t + " is not a Armstrong Number");
		}

	}

}
