package java_practice_programs;
import java.util.Scanner;

public class TableofGivenNumber 
{
 public static void main(String[] args)
 {
  Scanner in = new  Scanner(System.in);
  System.out.println("Enter Number:");
  int n= in.nextInt();
  for(int i=0;i<10;i++)
  {
   System.out.println(n+"*"+(i+1)+"="+(n*(i+1)));
  }
 }
}
