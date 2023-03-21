package com.prorigo.march21;

import java.util.Scanner;
import java.text.*;

public class NumberstoWords {
	private static final String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fouteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"ninteen" };
	private static final String[] tens = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	public static String convert(final int num) {
		if (num < 0) {
			return "Minus" + convert(-num);
		}
		if (num < 20) {
			return ones[num];
		}
		if (num < 100) {
			return tens[num / 10] + ((num % 10 != 0) ? " " : " ") + ones[num % 10];
		}
		if (num < 1000) {
			return tens[num / 100] + "Hundred" + ((num % 100 != 0) ? " " : " ") + convert(num % 100);
		}
		if (num < 100000) {
			return convert(num / 1000) +" " +"thousand" + ((num % 10000 != 0) ? " " : " ") + convert(num % 1000);
		}
		if (num < 10000000) {
			return convert(num / 100000) +" "+ "lakh" + ((num % 100000 != 0) ? " " : " ") + convert(num % 100000);
		}

		return convert(num / 10000000) + "Crore" + ((num % 10000000 != 0) ? " " : " ") + convert(num % 10000000);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		System.out.println(NumberFormat.getInstance().format(num) +" "+ "=" +" "+ convert(num) + " ");
	}

}
