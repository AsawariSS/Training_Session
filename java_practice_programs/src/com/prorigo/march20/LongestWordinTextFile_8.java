package com.prorigo.march20;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWordinTextFile_8 {

	public static void main(String[] args) throws FileNotFoundException {
		new LongestWordinTextFile_8().longWord();

	}

	public String longWord() throws FileNotFoundException {
		String longestWord = "";
		String current;
		Scanner sc = new Scanner(new File("C:\\Users\\asawaris\\Desktop\\Sample.txt"));
		while (sc.hasNext()) {
			current = sc.next();
			if (current.length() > longestWord.length()) {
				longestWord = current;
			}
		}
		System.out.println("The Longest Word is" + " " + longestWord);
		return longestWord;
	}
}
