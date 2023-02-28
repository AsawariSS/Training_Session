package java_practice_programs;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Sunday");
		hash_map.put(2, "Monday");
		hash_map.put(3, "Tuesday");
		hash_map.put(4, "Wenusday");
		hash_map.put(5, "Thursday");
		for (Map.Entry x : hash_map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

	}

}
