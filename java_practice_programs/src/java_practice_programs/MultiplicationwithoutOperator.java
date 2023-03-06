package java_practice_programs;

import java.util.Scanner;

public class MultiplicationwithoutOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, total = 0;
		System.out.print("Enter the first number: ");
		num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			total = total + num2;
		}
		System.out.println(" Multiplication of " + num1 + " and " + num2 + " is: " + total);
	}
}
