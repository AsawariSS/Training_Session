package com.prorigo.march8;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class MajorityofNumbers {

	public static List<Integer> findElements(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int num1 = 0, num2 = 0;
        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == num1) {
                count1++;
            } else if (num == num2) {
                count2++;
            } else if (count1 == 0) {
                num1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                num2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == num1) {
                count1++;
            } else if (num == num2) {
                count2++;
            }
        }
        if (count1 > n / k) {
            result.add(num1);
        }
        if (count2 > n / k) {
            result.add(num2);
        }
        return result;
    }

	public static void main(String[] args) {

		int[] nums = {1,2,2,3,1,2,1,2,3,3,4,5};
        int k = 3;
        List<Integer> result = findElements(nums, k);
        System.out.println(result);
	}
}
