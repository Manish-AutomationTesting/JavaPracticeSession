package javaBasics;

public class ReverseStringConcept {

	public static void main(String[] args) {
		// there are two way to reverse String
		// 1. for loop
		// String s="Selenium";
		String s = "Maneesh Kumar Mishra";
		int len = s.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse String is--->" + rev);

		StringBuffer sb = new StringBuffer("Maneesh Kumar Mishra");
		System.out.println("Reverse String is--->" + sb.reverse());
	}

}
