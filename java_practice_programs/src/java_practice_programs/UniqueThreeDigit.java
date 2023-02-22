package java_practice_programs;

public class UniqueThreeDigit 
{
 public static void main(String[] args)
 {
   int n=0;
   int count=0;
   for(int i=1;i<=4;i++)
   {
    for(int j=1;j<=4;j++)
    {
     for(int k=1;k<=4;k++)
     {
      if(k!=i && k!=j &&i!=j)
      {
       n++;
       System.out.println(i+""+j+""+k);
      }
      count++;
     }
    }
   }
   System.out.println("Total Three Digit Numbers are:"+ n+" "+count);
  }
}
