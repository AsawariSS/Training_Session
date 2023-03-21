package com.prorigo.march17;

public class TripletsArray_1 {
	static void tripletsInArray(int[] arr, int num) {
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				for (int k = j + 1; k < num; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1 };
		int num = arr.length;
		tripletsInArray(arr, num);

	}
}
