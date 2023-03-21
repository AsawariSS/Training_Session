package com.prorigo.march8;

import java.util.Arrays;

public class UnionOfArray {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 4, 5, 6, 7, 8 };
		int[] result = arrayUnion(array1, array2);
		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));
		System.out.println("Union of arrays: " + Arrays.toString(result));
	}

	private static int[] arrayUnion(int[] array1, int[] array2) {
		int m = array1.length;
		int n = array2.length;
		int[] result = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (array1[i] < array2[j]) {
				result[k++] = array1[i++];
			} else if (array2[j] < array1[i]) {
				result[k++] = array2[j++];
			} else {
				result[k++] = array2[j++];
				i++;
			}
		}
		while (i < m) {
			result[k++] = array1[i++];
		}
		while (j < n) {
			result[k++] = array2[j++];
		}
		int[] finalResult = Arrays.copyOf(result, k);
		return finalResult;
	}
}
