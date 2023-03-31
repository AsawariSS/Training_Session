package com.prorigo.march27;

import java.util.Scanner;

public class MultiplicationWithoutOperators_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		int result = multiplication(num1, num2);
		System.out.println(num1 +" "+"multiplied by" +" "+ num2 +" "+ "is"+" "+ result);

		scanner.close();

	}

	public static int multiplication(int num1, int num2) {
		if (num1 == 0 || num2 == 0) {
			return 0;
		}

		if (num2 < 0) {
			num1 = -num1;
			num2= -num2;
		}

		int result = 0;
		for (int i = 0; i < num2; i++) {
			result += num1;
		}

		return result;
	}

}
