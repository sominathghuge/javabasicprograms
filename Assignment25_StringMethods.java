package javaAssignments;

//"Assignment 25: Write a java program on String functions for the following: Here, the String = "" I Love MySelf""
//a)Find the length of the given String.
//b)Convert the String to upper case and lower case.
//c)Remove all white spaces from String.
//d)Reverse the given string using loops."

public class Assignment25_StringMethods {

	public static void main(String[] args) {
		
		String a=" I Love MySelf";
		
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.trim());
	
		//Reverse String
		String reverse="";
		for(int i=a.length()-1; i>=0; i--)
		{
			char c= a.charAt(i);
			reverse=reverse+c;
		}
		
		System.out.println("The reverse string is: " +reverse);
		
		
		
	}
}
