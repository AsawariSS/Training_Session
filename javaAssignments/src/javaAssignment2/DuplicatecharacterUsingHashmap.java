package javaAssignment2;

import java.util.HashMap;
import java.util.Set;

public class DuplicatecharacterUsingHashmap {
	static void duplicateChar(String inputString) {
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		char[] stringArray = inputString.toCharArray();

		for (char c : stringArray) {
			if (charMap.containsKey(c)) {

				charMap.put(c, charMap.get(c) + 1);
			} else {

				charMap.put(c, 1);
			}
		}

		Set<Character> charsInString = charMap.keySet();

		System.out.println("Duplicate Characters In " + inputString);

		for (Character ch : charsInString) {
			if (charMap.get(ch) > 1) {

				System.out.println(ch);
			}

		}

	}

	public static void main(String[] args) {
		duplicateChar("asawari sarnobat");

		duplicateChar("prorigosoftwares");

	}

}
