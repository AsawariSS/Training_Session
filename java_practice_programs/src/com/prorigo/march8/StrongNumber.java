package com.prorigo.march8;

import java.util.*;

public class StrongNumber {

	public static void main(String[] args) {

		int num, i;
		int fact_n, lastdig;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		num = sc.nextInt();
		int total = 0;
		int temp_n = num;
		while (num != 0) {
			i = 1;
			fact_n = 1;
			lastdig = num % 10;
			while (i <= lastdig) {
				fact_n = fact_n * i;
				i++;
			}
			total = total + fact_n;
			num = num / 10;
		}
		if (total == temp_n)
			System.out.println(temp_n + " is a strong number\n");
		else
			System.out.println(temp_n + " is not a strong number\n");
		System.out.println();
	}

}
