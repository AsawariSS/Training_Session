package javaAssignments;
import java.util.*;

public class FactorialWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, mul = 1;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any integer:");
	        n = s.nextInt();
	        for(int i = 1; i <= n; i++)
	        {
	            mul = mul * i;
	        }
	        System.out.println("Factorial of "+n+" :"+mul);

	}

}
