package java_practice_programs;

public class AreaPerimeterofCircle {
	static final double PI = Math.PI;

	static double Perimeter(double r) {
		return 2 * PI * r;
	}

	static double Area(double r) {
		return PI * r * r;
	}

	public static void main(String[] args) {
		double r = 3;
		System.out.println("Perimeter of the circle is :" + Perimeter(r));
		System.out.println("Area of Circle:" + Area(r));
	}
}
