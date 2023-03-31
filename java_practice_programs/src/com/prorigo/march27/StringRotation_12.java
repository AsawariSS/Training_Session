package com.prorigo.march27;

import java.util.Scanner;

public class StringRotation_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();

		boolean isRotation = isRotation(str1, str2);

		if (isRotation) {
			System.out.println(str2 + " is a rotation of " + str1);
		} else {
			System.out.println(str2 + " is not a rotation of " + str1);
		}

		scanner.close();

	}

	public static boolean isRotation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		String concatenated = str1 + str1;

		return concatenated.contains(str2);
	}
}
