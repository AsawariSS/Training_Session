package com.prorigo.march6;

import java.util.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ArrayListProgram {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		name.add("Raj");
		name.add("Ravi");
		name.add("Aditya");
		name.add("Vikram");
		name.add("Riya");

		Map<Character, List<String>> map = newList(name);
		// newList(names);
		System.out.println("Original List of Names:" + name);
		System.out.println("Divided Lists are:" + map);
	}

	public static Map<Character, List<String>> newList(List<String> name) {
		Map<Character, List<String>> map = new HashMap<>();
		// for(String name: map)
		for (String names : name) {
			char fchar = names.charAt(0);
			// if(map.containsValue(map))
			if (!map.containsKey(fchar)) {
				map.put(fchar, new ArrayList<>());
			}
			map.get(fchar).add(names);
		}

		return map;
	}
}
