package com.prorigo.march10;

import java.util.*;

public class MovingNumbersinArray {
	public static int[] split_sorting_array(int[] nums) {
		if (nums == null) {
			throw new IllegalArgumentException("Null array......!");
		}
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i= 0; i < nums.length - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					swap(nums, i, i + 1);
					flag = true;
				}
			}
		}
		return nums;
	}

	private static void swap(int[] nums, int left, int right) {
		int temp = nums[right];
		nums[right] = nums[left];
		nums[left] = temp;
	}

	public static void main(String[] args) {
		int[] nums = { -2, 3, 4, -1, -3, 1, 2, -4, 0 };
		System.out.println("\nOriginal array: " + Arrays.toString(nums));
		int[] result = split_sorting_array(nums);
		System.out.println("\nResult: " + Arrays.toString(result));

	}
}
