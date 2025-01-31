package javaAssignments;

//Assignment 43:Create a StringBuilder object and initialize it with the string "Hello, World!" And Append the string " How are you?" to the StringBuilder object.
//Insert the string "Java" at index 7.
//Delete characters from index 2 to index 5.
//Reverse the entire string."
public class Assignment43_StringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello, World!");
		
		System.out.println(sb);
		
		
		sb.append(" How Are You?");
		System.out.println(sb);
		
		sb.insert(7, "Java ");
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		
		
		
	}

}
