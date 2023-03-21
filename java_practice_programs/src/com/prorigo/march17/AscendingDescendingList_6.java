package com.prorigo.march17;
import java.util.*;

public class AscendingDescendingList_6 {

	public static void main(String[] args) {
		String[] names = { "Asawari", "Vaishnavi", "yogini", "Sourav", "Hrishikesh", "Nandan", "Amar", "Shubham" };
		System.out.println("Given List:" + Arrays.toString(names));
		Arrays.sort(names);System.out.println("List in Ascending Order:" + Arrays.toString(names));
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println("List in Descending order:" + Arrays.toString(names));

	}

}
