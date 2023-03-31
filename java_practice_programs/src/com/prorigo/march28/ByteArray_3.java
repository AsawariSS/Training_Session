package com.prorigo.march28;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArray_3 {

	public static void main(String[] args) throws IOException {

		File inputFile = new File("C:\\Users\\asawaris\\Desktop\\java.txt");
		byte[] fileContent = new byte[(int) inputFile.length()];
		FileInputStream inputStream = new FileInputStream(inputFile);
		inputStream.read(fileContent);
		inputStream.close();
		System.out.println(new String(fileContent));

	}

}
