package java_practice_programs;
import java.util.*;

public class RemoveDuplicateString {
   static void removeDuplicate(char str[], int length)   
    {   
      int index = 0;   
      for (int i = 0; i < length; i++)   
      {   
        int j;   
        for (j = 0; j < i; j++)    
        {   
          if (str[i] == str[j])   
          {   
           break;   
          }   
        }     
        if (j == i)    
        {   
          str[index++] = str[i];   
        }   
       }   
      System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }    
    public static void main(String[] args)   
    {   
      String str1;  
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a string:");
      str1 = s.nextLine();
      char str[] = str1.toCharArray();  
      int len = str.length;   
      removeDuplicate(str, len);   
    }   
}  


