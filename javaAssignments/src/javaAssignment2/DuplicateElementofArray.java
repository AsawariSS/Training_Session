package javaAssignment2;
import java.util.*;

public class DuplicateElementofArray
{

	public static void main(String[] args)
	{
		int [] arr = new int [] {3,5,6,6,8,5,9,2,4,8};   
		System.out.println("Given Array is: "); 
		System.out.println(Arrays.toString(arr));
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < arr.length; i++) 
        {  
            for(int j = i + 1; j < arr.length; j++)
            {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  	

	}

}
