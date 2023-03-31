package com.prorigo.march24;

import java.util.*;

public class PowerofExponential_5 {
	public static int power(int base, int exponent) {
		if (exponent == 0)
			return 1;

		int result = base;
		int temp = base;
		int i, j;

		for (i = 1; i < exponent; i++) {
			for (j = 1; j < base; j++) {
				result += temp;
			}
			temp = result;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Input the base: ");
		int base = scan.nextInt();
		System.out.print("Input the exponent: ");
		int exponent = scan.nextInt();
		scan.close();
		if (base > 0 && exponent > 0)
			System.out.println("Power of given number: " + power(base, exponent));
	}

}
