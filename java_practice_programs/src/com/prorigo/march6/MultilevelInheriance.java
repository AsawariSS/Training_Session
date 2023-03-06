package com.prorigo.march6;

class GrandFather {
	public void house() {
		System.out.println("Hello I am Grandfather.");
	}
}

class father extends GrandFather {
	public void land() {
		System.out.println("Hi,I am father");
	}
}

class son extends father {
	public void car() {
		System.out.println("Hello I am Son");
	}
}

public class MultilevelInheriance {

	public static void main(String[] args) {

		son s1= new son();
		s1.car();
		s1.house();
		s1.land();
	}
}
