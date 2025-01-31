package javaAssignments;
//Assignment 34: write a program for the below.The given String= "myJava"

public class Assignment34_MatchesFunction {
	
	public static void main(String[] args) {
		
		String str= "myJava";
		
		//i)check if the given string is consists of the exact 6 letters?
		boolean b= str.matches("......");
		System.out.println(b);
		
		
		//ii)check if the String starts with 'm' ?
		
		boolean b1= str.matches("m(.*)");
		System.out.println(b1);
		
		
		//iii)check if the String ends with 'y' ?
		
		boolean b2= str.matches("(.*)y");
		System.out.println(b2);
		
		//iv)check if the String ends with "Java" ?
		boolean b3=str.endsWith("Java");
		System.out.println(b3);
		
		
		//check if the String start with "My" ?
		
		boolean b4=str.startsWith("My");
		System.out.println(b4);
		
		
	}

}
