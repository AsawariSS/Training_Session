package java_practice_programs;

import java.util.*;

public class SecondLargestNumberArray {
	static int findSecondLargest(int arr1[], int number) {

		Arrays.sort(arr1);

		int second_largest = 0;
		for (int i = number - 2; i >= 0; i--) {

			if (arr1[i] != arr1[number - 1]) {
				second_largest = arr1[i];
				break;
			}
		}

		return second_largest;
	}

	public static void main(String[] args) {

		int arr[] = { 5, 6, 7, 1, 6, 7, 8, 9, 45, 3, 78 };
		int num = arr.length;

		int answer = findSecondLargest(arr, num);

		System.out.println("The second largest number is: " + answer);

	}

}
