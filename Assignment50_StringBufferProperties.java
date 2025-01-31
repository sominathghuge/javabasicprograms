package javaAssignments;

//Assignment 50: Write a program to demonstrate the following functions like append, insert, replace, delete, reverse, capacity, charAt, length, substring(int) & substring (start & end index) using StringBuffer concept.
public class Assignment50_StringBufferProperties {
	
	public static void main(String[] args) {
		
		
		StringBuffer sb=new StringBuffer("Automation");
		
		sb.append(" Testing");
		System.out.println(sb);
				
		sb.append(" Course");
		System.out.println(sb);
		
		sb.insert(10, " 48");
		System.out.println(sb);
		
		sb.replace(22, 28, "and");
		System.out.println(sb);
		
		sb.append(" API");
		System.out.println(sb);
		
		int a=sb.charAt(0);
		System.out.println(a);
		
		int b=sb.capacity();
		System.out.println(b);
		
		int c=sb.length();
		System.out.println(c);
		
		String d=sb.substring(23);
		System.out.println(d);
		
		String e=sb.substring(0, 12);
		System.out.println(e);
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		
		
	}

}
