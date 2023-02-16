package javaAssignment2;
import java.util.*;

public class RotateLeft 
{
	public static void main(String[] args) 
	{
		int [] arr = new int [] {1, 2, 3, 4, 5};  
        int d=2;
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++)
        {  
            System.out.print(arr[i] + " ");  
        }  
        
        for(int i = 0; i < d; i++)
        {  
            int j, f;  
             
            f = arr[0];  
            for(j = 0; j < arr.length-1; j++)
            {  
                  
                arr[j] = arr[j+1];  
            }  
              
            arr[j] = f;  
        }  
        System.out.println();  
         
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++)
        {  
            System.out.print(arr[i] + " ");  
        }  
	}
}
