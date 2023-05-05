package com.prorigo.april17;

public class Second_lowestNumber {

	public static void main(String[] args) {
		int[] numbers = { 5, 10, 2, 8, 13 };
		int lowest = Integer.MAX_VALUE;
		int secondLowest = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < lowest) {
				secondLowest = lowest;
				lowest = numbers[i];
			} else if (numbers[i] < secondLowest && numbers[i] != lowest) {
				secondLowest = numbers[i];
			}
		}

		System.out.println("The second lowest number is: " + secondLowest);

	}

}
