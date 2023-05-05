package com.prorigo.april18;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MovngFile {

	public static void main(String[] args) {
		String sourceFile = "D:\\Example1.txt\\";
		String destinationFile = "example\\Example_new.txt\\";
		String destinationDirectory = "C:\\example\\";

		try {

			Path sourcePath = Paths.get(sourceFile);

			Path destinationDirectoryPath = Paths.get(destinationDirectory);

			Path destinationPath = Paths.get(destinationDirectory, destinationFile);

			Files.move(sourcePath, destinationPath);

			System.out.println("File moved successfully to: " + destinationPath);

			File file = new File(sourceFile);
			if (file.exists()) {
				file.delete();
				System.out.println("Source file closed.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred while moving the file.");
			e.printStackTrace();
		}

	}

}
