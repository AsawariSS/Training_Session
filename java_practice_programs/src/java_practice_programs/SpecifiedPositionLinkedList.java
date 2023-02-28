package java_practice_programs;

import java.util.LinkedList;

public class SpecifiedPositionLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Asawari");
		list.add("Vaishnvai");
		list.add("Yogini");
		System.out.println("linked list:" + list);
		LinkedList<String> newlist = new LinkedList<String>();
		newlist.add("Ashu");
		newlist.add("Vaishu");
		
		list.addAll(2, newlist);
		System.out.println("LinkedList" + list);
		}

}
