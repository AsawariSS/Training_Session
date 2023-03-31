package com.prorigo.march24;

import java.util.*;

public class PermutationsofString_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		List<String> permutations = printPermutations(str);
		System.out.println("All possible Permutations of " + str + ": " + permutations);

	}

	public static List<String> printPermutations(String str) {
		List<String> permutations = new ArrayList<>();
		if (str == null || str.length() == 0) {
			return permutations;
		}
		searchPermutations("", str, permutations);
		return permutations;
	}

	private static void searchPermutations(String pref, String suf, List<String> permutations) {
		if (suf.length() == 0) {
			permutations.add(pref);
			return;
		}
		for (int i = 0; i < suf.length(); i++) {
			char ch = suf.charAt(i);
			String newPrefix = pref + ch;
			String newSuffix = suf.substring(0, i) + suf.substring(i + 1);
			searchPermutations(newPrefix, newSuffix, permutations);
		}
	}
}
