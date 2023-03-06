package java_practice_programs;

import java.util.*;

public class SearchTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> tree_map1 = new TreeMap<String, String>();

		tree_map1.put("L1", "c");
		tree_map1.put("L2", "C++");
		tree_map1.put("L3", "Java");
		tree_map1.put("L4", "Python");

		if (tree_map1.containsValue("javascript")) {
			System.out.println("The TreeMap contains value javascrript");
		} else {
			System.out.println("The TreeMap does not contain value javascrript");
		}
		if (tree_map1.containsValue("Java")) {
			System.out.println("The TreeMap contains value Java");
		} else {
			System.out.println("The TreeMap does not contain value Java");
		}
	}
}
