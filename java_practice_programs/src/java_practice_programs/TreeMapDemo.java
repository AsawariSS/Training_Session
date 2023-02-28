package java_practice_programs;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		// Put elements to the map
		tree_map.put(1, "Sunday");
		tree_map.put(2, "Monday");
		tree_map.put(3, "Tuesda");
		tree_map.put(4, "Wenusday");
		tree_map.put(5, "Thursday");

		for (Map.Entry<Integer, String> entry : tree_map.entrySet()) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
	}
}
