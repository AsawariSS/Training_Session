package com.prorigo.march8;

import java.util.*;

public class ReversetheSentense {

	public static void main(String[] args) {
		String str = "I am good";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter String: ");
		str = in.nextLine();
		String rev = reverse(str);
		System.out.println("Reversed sentence: " + rev);
	}

	public static String reverse(String s) {
		int x = s.indexOf(" ");
		if (x == -1)
			return s;
		return reverse(s.substring(x + 1)) + " " + s.substring(0, x);
	}
}
