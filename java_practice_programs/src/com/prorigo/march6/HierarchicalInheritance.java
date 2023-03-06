package com.prorigo.march6;

class BaseClass {
	int parentNum = 67;
}

class SubClass1 extends BaseClass {
	int childNum1 = 5;
}

class SubClass2 extends BaseClass {
	int childNum2 = 8;
}

class SubClass3 extends BaseClass {
	int childNum3 = 9;
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		SubClass1 childObj1 = new SubClass1();
		SubClass2 childObj2 = new SubClass2();
		SubClass3 childObj3 = new SubClass3();

		System.out.println("parentNum * childNum1 = " + childObj1.parentNum * childObj1.childNum1);
		System.out.println("parentNum * childNum2 = " + childObj2.parentNum * childObj2.childNum2);
		System.out.println("parentNum * childNum3 = " + childObj3.parentNum * childObj3.childNum3);

	}
}
