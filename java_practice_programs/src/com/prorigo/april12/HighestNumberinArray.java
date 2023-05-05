package com.prorigo.april12;

public class HighestNumberinArray {
	public static int findHighestNumber(int[] arr) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("Array must have at least one element");
		}
		int highestNumber = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > highestNumber) {
				highestNumber = arr[i];
			}
		}
		return highestNumber;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 1, 9, 3 };
		int highestNumber = findHighestNumber(arr);
		System.out.println("The highest number in the array is: " + highestNumber);
	}

}
