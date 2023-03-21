package com.prorigo.march16;

import java.util.*;

public class NumberstoWords_4 {
	private static final String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fouteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"ninteen" };
	private static final String[] tens = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };
	private static final String[] thousands = { "", "thousand","lakh" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		System.out.println("In words:" + " " + numberToWords(num));

	}

	public static String numberToWords(int num) {
		if (num == 0) {
			return "zero";
		}
		String word = "";
		int idx = 0;
		do {
			int number = num % 1000;
			if (number != 0) {
				String words = numberToWordsLessThanThousand(number);
				word = words + " " + thousands[idx] + " " + word;
			}
			idx++;
			num /= 1000;
		} while (num > 0);
		return word.trim();
	}

	private static String numberToWordsLessThanThousand(int num) {
		String word = " ";
		if (num % 100 < 20) {
			word = ones[num % 100];
			num /= 100;
		} else {
			word = ones[num % 10];
			num /= 10;
			word = tens[num % 10] + " " + word;
			num /= 10;
		}
		if (num != 0) {
			word = ones[num] + " " + "hundred" + " " + word;
		}
		return word;
	}

}
