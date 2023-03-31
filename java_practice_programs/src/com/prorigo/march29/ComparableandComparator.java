package com.prorigo.march29;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableandComparator {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("asawari");
		names.add("yogini");
		names.add("vaishnavi");
		names.add("vaibhavi");

        Collections.sort(names);
        System.out.println("Sorted using Comparable: " + names);

        
        Collections.sort(names, new LengthCompare());
        System.out.println("Sorted using Comparator: " + names);
    }

	static class LengthCompare implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    }

}
