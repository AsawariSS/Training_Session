package javaAssignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, a= 0, b = 1;
	    System.out.println("Fibonacci Series of up to"  + n + " numbers:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(a+ ", ");

	      // compute the next term
	      int c= a+ b;
	      a = b;
	      b=c;
	    }

	}	

}
