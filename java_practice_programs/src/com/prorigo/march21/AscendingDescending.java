package com.prorigo.march21;

import java.util.Arrays;

public class AscendingDescending {

	public static void main(String[] args) {
		String[] name = { "Asawari", "Vaisnavi", "Sourav", "Hrishikesh", "Yogini" };
		//System.out.print("Original List:" + name);
		System.out.println("Original List:" + Arrays.toString(name));
		int size = name.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i; j < size; j++) {
				if (name[i].compareTo(name[j]) > 0) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;

				}
			}
		}
		System.out.println("Ascending Order:" + Arrays.toString(name));
		StringBuilder rev = new StringBuilder();
		for (int i = size; i > 0; i--) {
			rev.append(name[i - 1]).append(" ");

		}
		String[] revArr = rev.toString().split(" ");
		System.out.println("Descending Order:" + Arrays.toString(revArr));

	}
}
