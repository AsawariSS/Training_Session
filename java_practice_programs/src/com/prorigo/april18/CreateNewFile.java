package com.prorigo.april18;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		String fileName ="D:\\Example1.txt\\";
		File file = new File(fileName);

		try {
			boolean isFileCreated = file.createNewFile();
			if (isFileCreated) {
				System.out.println("File created successfully.");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred while creating the file.");
			e.printStackTrace();
		}

	}

}
