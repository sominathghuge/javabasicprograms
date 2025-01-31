package javaAssignments;
//Assignment 33: Write a program for the below.
//String input= "Hello! 123Bye 789"

public class Assignment33_StringReplaceMethod{

	public static void main(String[] args) {
		
		String input= "Hello! 123Bye 789";
		
		//i) Replace all numeric characters in a given string with an empty string ("").
		
		System.out.println(input.replaceAll("[0-9]", " "));
		
		//ii)Replace all capital letters in a given string with an empty string ("").
		
		System.out.println(input.replaceAll("[A-Z]", ""));
		
		//iii)Replace all lower letters in a given string with an empty string ("").
		
		System.out.println(input.replaceAll("[a-z]", ""));
		
		//iv)Replace the letter 'e' with 'y'
		
		System.out.println(input.replace('e', 'y'));
		
		
		
	}
}
