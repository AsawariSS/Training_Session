package com.prorigo.april4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class SplittingFiles {

	public static void main(String[] args) {

		String cert_Chain = "D:\\cert_chain.pem";
		separation(cert_Chain);
	}

	public static void separation(String cert_Chain) {
		try {

			if (!cert_Chain.endsWith(".pem")) {
				System.out.println("Error: " + cert_Chain + " is not a PEM file.");
				return;
			}
			BufferedReader br = new BufferedReader(new FileReader(cert_Chain));

			StringBuilder certChainData = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				certChainData.append(line).append("\n");
			}
			br.close();

			String[] certs = certChainData.toString().split("-----END CERTIFICATE-----\n");

			if (certs[certs.length - 1].isEmpty()) {
				String[] temp = new String[certs.length - 1];
				System.arraycopy(certs, 0, temp, 0, certs.length - 1);
				certs = temp;
			}

			String cert = certs[0] + "-----END CERTIFICATE-----\n";
			BufferedWriter certWriter = new BufferedWriter(new FileWriter("D:\\cert.pem"));
			certWriter.write(cert);
			certWriter.close();

			String chain = String.join("\n", Arrays.copyOfRange(certs, 1, certs.length))+ "--END CERTIFICATE--\n";
			BufferedWriter chainWriter = new BufferedWriter(new FileWriter("D:\\chain.pem"));
			chainWriter.write(chain);
			chainWriter.close();

			System.out.println("File is successfully Separated..!");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
