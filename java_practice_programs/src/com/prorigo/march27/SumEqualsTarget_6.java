package com.prorigo.march27;

import java.util.HashSet;

public class SumEqualsTarget_6 {

	public static void main(String[] args) {
		int[] arr = { 5,7,8,1};
		int target = 9;
		boolean result = targetSum(arr, target);
		System.out.println(result);

	}

	public static boolean targetSum(int[] arr, int target) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int compmnt = target - arr[i];
			if (set.contains(compmnt)) {
				return true;
			}
			set.add(arr[i]);
		}
		return false;
	}
}
