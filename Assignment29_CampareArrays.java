package javaAssignments;

import java.util.Arrays;

// Assignment 29: Write a progrm for the given strings, to check if the both arrays are equal to each other. 
//here, String1: "kv no2 bangalore"
        // String2: "karnataka"
public class Assignment29_CampareArrays {
	
	public static void main(String[] args) {
		
		String []a= {"kv no2 bangalore"};
	    String[] b= {"karnataka"};
		
		boolean result=Arrays.equals(a, b);
		System.out.println(result);
		if(result==true)
		{
		  System.out.println("Both arrays are equals to each other..!");
		}
		else
		{
			System.out.println("Both arrays are not equals to each other..!");
		}
		
		
		
		
		
	}

}
