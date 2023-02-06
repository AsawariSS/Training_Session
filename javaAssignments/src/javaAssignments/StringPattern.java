package javaAssignments;
import java.util.Scanner;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	      System.out.print("Enter a word: ");
	      String word = scan.nextLine();

	      for (int i=0; i<word.length(); i++) {
	        for (int j=0; j<=i; j++) {
	          System.out.print(word.charAt(j));
	        }
	        System.out.println(); 
	      }
	}

}
