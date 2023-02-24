package java_practice_programs;

class student2 {
	String ss;
	String name;

	public student2(String ss) {
		name = ss;
	}

	public student2() {
		name = "unknown";
	}
}

public class Student1 {

	public static void main(String[] args) {
		student2 obj = new student2();
		obj.ss = "Asawari";
		// Student ss1 = new Student();
		System.out.println(obj.ss);
		System.out.println(obj.name);

	}

}
