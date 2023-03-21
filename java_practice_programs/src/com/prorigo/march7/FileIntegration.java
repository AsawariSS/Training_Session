package com.prorigo.march7;

import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileIntegration {

	public static void main(String[] args) {
		String folder1 = "D:\\Integration Demo\\Java";
		String folder2 = "D:\\Integration Demo";
		String integratedfolder = "D:\\Programming Languages";
		File destDir = new File(integratedfolder);
		if (!destDir.exists()) {
			destDir.mkdirs();

		}
		try {
			copyImageFromFolder(folder1, integratedfolder);
			copyImageFromFolder(folder2, integratedfolder);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Images From" + folder1 + "and" + folder2 + "have been integrated into" + integratedfolder);
	}

	private static void copyImageFromFolder(String sourceFolder, String integratedfolder) throws IOException {
		File source = new File(sourceFolder);
		File[] files = source.listFiles();
		if (files == null) {
			return;
		}
		for (File file : files) {
			if (file.isFile() && isImageFile(file)) {
				Path sourcePath = file.toPath();
				Path destPath = new File(integratedfolder + file.getName()).toPath();
				Files.copy(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
			}
		}
	}

	private static boolean isImageFile(File file) {
		String name = file.getName();
		int lastDotIndex = name.lastIndexOf(".");
		if (lastDotIndex > 0) {
			String extension = name.substring(lastDotIndex + 1);
			return extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("jpeg")|| extension.equalsIgnoreCase("png");

		}
		return false;
	}
}
