package com.prorigo.march23;

import java.util.*;

public class SumofMultipleNumbers_1 {
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public int sum(int... nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SumofMultipleNumbers_1 calculator = new SumofMultipleNumbers_1();

		System.out.println("Enter two numbers:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int sum1 = calculator.sum(num1, num2);

		System.out.println("Enter multiple numbers (separated by spaces):");
		scanner.nextLine();
		String line = scanner.nextLine();
		String[] numbers = line.split(" ");
		int[] nums = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			nums[i] = Integer.parseInt(numbers[i]);
		}
		int sum2 = calculator.sum(nums);

		System.out.println("Sum of two numbers: " + sum1);

		System.out.println("Sum of multiple numbers: " + sum2);
	}
}
