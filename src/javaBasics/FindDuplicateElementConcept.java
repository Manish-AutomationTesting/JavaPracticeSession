package javaBasics;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementConcept {

	public static void main(String[] args) {

		String names[] = { "Java", "Python", "C++", "Java", "Selenium", "Ruby", "PHP", "Python" };
		int namesLength = names.length;
		// 1.
		for (int i = 0; i < namesLength; i++) {
			for (int j = i + 1; j < namesLength; j++) {
				if (names[i].equalsIgnoreCase(names[j])) {
					System.out.println("Duplicate Elements-->" + names[i]);

				}

			}

		}
		// 2.

		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate Element-->" + name);
			}

		}

	}

}
