package java_practice_programs;

interface shape {
	double pi = 3.14;

	public double area();
}

class Circle implements shape {
	int r = 10;

	public double area() {
		return (pi * r * r);

	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.area());

	}

}
