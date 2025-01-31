package javaAssignments;

//Assignment 51: Write a program to demonstrate the following functions like append, insert, replace, delete, reverse, capacity, charAt, length, substring(int) & substring (start & end index) using StringBuilder concept.

public class Assignment51_StringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hii");
		
		sb.append(" Java");
		System.out.println(sb);
		
		sb.append(" I want to learn your concepts");
		System.out.println(sb);
		
		sb.insert(8, ",");
		System.out.println(sb);
		
		int a=sb.capacity();
		System.out.println(a);
		
		char b=sb.charAt(5);
		System.out.println(b);
		
		String c=sb.substring(5);
		System.out.println(c);
		
		String d=sb.substring(6, 15);
		System.out.println(d);
		
		int e=sb.length();
		System.out.println(e);
		
		sb.replace(10, 11, "");
		System.out.println(sb);
		
		
		sb.reverse();
		System.out.println(sb);
		
	}
	
	

}
