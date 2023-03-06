package java_practice_programs;

import java.util.Scanner;

public class NonRepeating {
	public static void main(String[] args) {
		String string;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string:");
		string = s.nextLine();
		int index = -1;
		char letter = ' ';
		for (char i : string.toCharArray()) {
			if (string.indexOf(i) == string.lastIndexOf(i)) {
				letter = i;
				break;
			} else {
				index += 1;
			}
		}
		if (index == 1) {
			System.out.println("Either all characters are repeating or " + "string is empty");
		} else {
			System.out.println("First non-repeating character is " + letter);
		}
	}
}
