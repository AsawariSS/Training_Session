package com.prorigo.march8;

import java.util.Scanner;

public class AdditionwithoutArithmaticOperator {

	public static void main(String[] args) {
		int num1, num2;
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number: ");
		num1 = in.nextInt();
		System.out.print("Input second number: ");
		num2 = in.nextInt();
		while (num2 != 0) {
			int temp = num1 & num2;
			num1 = num1 ^ num2;
			num2 = temp << 1;
		}
		System.out.print("Total: " + num1);
		System.out.print("\n");
	}
}
