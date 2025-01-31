package javaAssignments;

import java.util.Arrays;

//Assignment 31:Write a program to check if the two given strings are Anagrams in JAVA?
//String 1 ="listen"
//String 2 ="silent" 
public class Assignment31_AnagramStringsProgram {
	
	public static void main(String[] args) {
		
		String a1 ="listen";
		String a2 ="silent";
		
		//convrting to tochar array
		char [] b1=a1.toCharArray();
		char [] b2=a2.toCharArray();
		
		//Sorting the array
		Arrays.sort(b1);
		Arrays.sort(b2);
		
		//Use toString array function
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		
		//comapare both array strings
		boolean result=Arrays.equals(b1, b2);
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are NOT anagram");
		}
		
		
		
	}

}
