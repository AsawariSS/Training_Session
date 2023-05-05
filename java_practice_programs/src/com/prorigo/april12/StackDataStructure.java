package com.prorigo.april12;

import java.util.*;

class Stack {
	private char[] items;
	private int top;

	public Stack(int capacity) {
		items = new char[capacity];
		top = -1;
	}

	public void push(char item) {
		if (top == items.length - 1) {
			throw new RuntimeException("Stack is full");
		}
		top++;
		items[top] = item;
	}

	public char pop() {
		if (top == -1) {
			throw new RuntimeException("Stack is empty");
		}
		char item = items[top];
		top--;
		return item;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}

public class StackDataStructure {
	public static String reverseString(String str) {
		Stack stack = new Stack(str.length());
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		StringBuilder reversedString = new StringBuilder();
		while (!stack.isEmpty()) {
			reversedString.append(stack.pop());
		}
		return reversedString.toString();
	}

	public static void main(String[] args) {

		String str = "Asawari";
		String reversedStr = reverseString(str);
		System.out.println(reversedStr);
	}

}
