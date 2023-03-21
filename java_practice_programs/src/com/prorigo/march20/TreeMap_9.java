package com.prorigo.march20;

import java.util.*;

public class TreeMap_9 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(10, "Red");
		tm.put(20, "Green");
		tm.put(40, "Black");
		tm.put(50, "White");
		tm.put(60, "Pink");
		System.out.println("Original TreeMap Content:" + tm);
		int key;Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key:");
		key = sc.nextInt();
		SortedMap<Integer, String> part = new TreeMap<>();
		for (Map.Entry<Integer, String> entry : tm.entrySet()) {
			if (entry.getKey() <= key) {
				part.put(entry.getKey(), entry.getValue());
				}
			}
		System.out.println("Checking Entry For" + " " + key + ":");
		System.out.println("Keys(s):" + part);
     
	}
}
