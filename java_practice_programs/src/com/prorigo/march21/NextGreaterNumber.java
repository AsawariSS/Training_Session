package com.prorigo.march21;

public class NextGreaterNumber {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 25, 10 };
		greaterElement(arr);
	}

	public static void greaterElement(int[] arr) {
		int num = arr.length;

		for (int i = 0; i < num; i++) {
			int nextGreater = -1;
			for (int j = i + 1; j < num; j++) {
				if (arr[j] > arr[i]) {
					nextGreater = arr[j];
					break;
				}
			}
			System.out.println("Greatest element for " + arr[i] + " is " + nextGreater);
		}

	}
}