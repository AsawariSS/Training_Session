package java_practice_programs;

public class BaseTwoLogarithm {

	public static void main(String[] args) {
		int num = 6478;
		System.out.printf("Original Number: %d\n", num);
		int RightShift_count = 0;
		do {
			num >>= 1;
			RightShift_count++;
		} while (num != 0);
		RightShift_count--;
		System.out.printf("Result: %s\r\n", RightShift_count);
	}
}
