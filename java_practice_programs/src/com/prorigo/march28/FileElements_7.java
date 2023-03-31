package com.prorigo.march28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileElements_7 {

	public static void main(String[] args) throws IOException {
		String fileName = "C:\\Users\\asawaris\\Desktop\\java.txt";
		BufferedReader reader = new BufferedReader(new FileReader(fileName));

		int lines = 0;
		int words = 0;
		int characters = 0;
		int paragraphs = 1;

		String line = reader.readLine();

		while (line != null) {
			if (line.trim().equals("")) {
				paragraphs++;
			} else {
				lines++;
				characters += line.length();
				String[] wordList = line.split("\\s+");
				words += wordList.length;
			}
			line = reader.readLine();
		}

		System.out.println("No of Lines in the file: " + lines);
		System.out.println("No of Words in the file: " + words);
		System.out.println("No of characters in the file: " + characters);
		System.out.println("No of Paragraphss in the file: " + paragraphs);

		reader.close();

	}

}
