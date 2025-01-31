package javaAssignments;

//Assignment 42:Create a StringBuffer object and initialize it with the string  ""Hello, World!"" And 
//Append the string " How are you?" to the StringBuilder object.Insert the string "Java" at index 7.
//Delete characters from index 2 to index 5.
//Reverse the entire string.
public class Assignment42_StringBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello, World!");
		
		sb.append(" How are you?");
		System.out.println(sb);
		
		sb.insert(7, "Java ");
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
