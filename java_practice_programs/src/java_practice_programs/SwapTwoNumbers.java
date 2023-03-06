package java_practice_programs;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int x = 25;
		int y = 30;
		System.out.println("Befor Swaping:");
		System.out.println("x" + "=" + x);
		System.out.println("y" + "=" + y);
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swaping:");
		System.out.println("x" + "=" + x);
		System.out.println("y" + "=" + y);
	}
}
