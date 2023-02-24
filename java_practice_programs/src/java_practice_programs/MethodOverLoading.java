package java_practice_programs;

public class MethodOverLoading {
	public int sum(int num1, int num2) {
		return (num1 + num2);
	}

	public int sum(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}

	public double sum(double num1, double num2) {
		return (num1 + num2);
	}

	public static void main(String[] args) {

		MethodOverLoading MOL = new MethodOverLoading();
		System.out.println(MOL.sum(115, 332));
		System.out.println(MOL.sum(165, 765, 546));
		System.out.println(MOL.sum(54.77, 77.66));
	}

}
