package javaAssignment2;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		 String str1="Asawari Sandeep Sarnobat ";    
         
	        
	        str1 = str1.replaceAll("\\s+", "");    
	            
	        System.out.println("String after removing all the white spaces : " + str1);    

	}

}
