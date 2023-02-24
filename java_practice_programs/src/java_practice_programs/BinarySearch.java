package java_practice_programs;

public class BinarySearch {
	static int binarySearch(int[] numbers, int temp) {
		int high_num = numbers.length - 1;
		int low_num = 0;
		while (high_num >= low_num) {
			int guess = (low_num + high_num) >>> 1;
			if (numbers[guess] > temp) {
				high_num = guess - 1;
			} else if (numbers[guess] < temp) {
				low_num = guess + 1;
			} else {
				return guess;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 6, 7, 8, 11 };
		int search_num = 8;
		int index = binarySearch(numbers, search_num);
		if (index == -1) {
			System.out.println(search_num + " is not in the array");
		} else {
			System.out.println(search_num + " is at index " + index);
		}

	}

}
