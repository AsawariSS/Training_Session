package com.prorigo.april17;

public class LowestNumber {

	public static void main(String[] args) {
		int[] numbers = { 5, 10, 2, 8, 13 };
		int lowest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < lowest) {
				lowest = numbers[i];
			}
		}

		System.out.println("The lowest number is: " + lowest);

	}

}
