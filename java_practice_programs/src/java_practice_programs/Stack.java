package java_practice_programs;

public class Stack {
	private int arr[];
	private int top;
	private int capacity;

	Stack(int size) {

		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int ele) {
		if (isFull()) {
			System.out.println("Stack is full");

			System.exit(1);
		}
		System.out.println("Inserting " + ele);
		arr[++top] = ele;
	}

	public int pop() {

		if (isEmpty()) {
			System.out.println("STACK EMPTY");

			System.exit(1);
		}

		return arr[top--];
	}

	public int getSize() {
		return top + 1;
	}

	public Boolean isEmpty() {
		return top == -1;
	}

	public Boolean isFull() {
		return top == capacity - 1;
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {

		Stack stack = new Stack(5);

		stack.push(6);
		stack.push(4);
		stack.push(2);

		System.out.print("Stack: ");
		stack.printStack();

		stack.pop();
		System.out.println("\nAfter popping out");
		stack.printStack();

	}
}
