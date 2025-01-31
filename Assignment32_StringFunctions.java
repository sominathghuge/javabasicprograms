package javaAssignments;

// Assignment 32:
public class Assignment32_StringFunctions {
	
	public static void main(String[] args) {
		
		//a)find the output for the given string by using 'equals()' and 'equalsIgnoreCase()' String methods?
		
		String str1= "Java";
		String str2= "java";
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
		//b)Write a program that uses the 'contains()'method in the string class to check if the substrings: "Java" and "Python" are present in the string
		
		String str3="Python is program orientaed language";
		
		System.out.println(str3.contains("Java"));
	
		System.out.println(str3.contains("Python"));
		
		
		
		
		
		
		
		
	}

}
