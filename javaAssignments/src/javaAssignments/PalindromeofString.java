package javaAssignments;
import java.util.*;   

public class PalindromeofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a, b = "";
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a string:");
	        a = s.nextLine();
	        int n = a.length();
	        for(int i = n - 1; i >= 0; i--)
	        {
	            b = b + a.charAt(i);
	        }
	        if(a.equalsIgnoreCase(b))
	        {
	            System.out.println(a+ " is a palindrome.");
	        }
	        else
	        {
	            System.out.println(a+ " is not a palindrome.");
	        }

	}

}
