package java_practice_programs;

class AdditionThread extends Thread {
	int num1, num2;

	AdditionThread(int num3, int num4) {
		num1 = num3;
		num2 = num4;
	}

	public void run() {
		System.out.println(num1 + num2);
	}

}

public class AddThread {

	public static void main(String[] args) {
		int num1 = 45, num2 = 20;
		AdditionThread t1 = new AdditionThread(num1, num2);
		t1.start();
		System.out.println(num1 - num2);

	}

}
