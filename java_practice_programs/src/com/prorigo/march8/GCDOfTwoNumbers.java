package com.prorigo.march8;

import java.util.Scanner;

public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		int gcd = 1;
		int num1, num2;
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number: ");
		num1 = in.nextInt();
		System.out.print("Input second number: ");
		num2 = in.nextInt();

		for (int i = 1; i <= num1 && i <= num2; i++) {

			if (num1 % i == 0 && num2 % i == 0)

				gcd = i;
		}

		System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
	}
}
