package com.prorigo.march17;

import java.util.regex.*;

public class RegularExpression_7 {

	public static void main(String[] args) {
		String[] str = { "publiq", "pociq", "suq", "prq", "qqp", "prstq" };
		Pattern ptrn = Pattern.compile("p.*q");
		for (String str1 : str) {
			Matcher matcher = ptrn.matcher(str1);
			if (matcher.matches()) {
				System.out.println(str1);
			}
			/*
			 * else { System.out.println(str1 +" "+ "does not match the pattern"); }
			 */
		}
	}

}
