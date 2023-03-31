package com.prorigo.march27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class NumberofVowelsRE_2 {

	public static void main(String[] args) {

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		str = sc.nextLine();
		int count = cntVowels(str);
		System.out.println("Number of vowels in '" + str + "' is " + count);
	}

	public static int cntVowels(String str) {

		Pattern pattern = Pattern.compile("[aeiouAEIOU]");
		Matcher matcher = pattern.matcher(str);

		int count = 0;
		while (matcher.find()) {
			count++;
		}

		return count;
	}
}
