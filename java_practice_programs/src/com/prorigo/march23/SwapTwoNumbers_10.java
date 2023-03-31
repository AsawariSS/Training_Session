package com.prorigo.march23;

import java.util.Scanner;

public class SwapTwoNumbers_10 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		num2 = sc.nextInt();
		System.out.println("Before Swapping, num1=" + num1 + " " + "and num2=" + num2);
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("After Swapping, num1=" + num1 + " " + "and num2 =" + num2);

	}
}
