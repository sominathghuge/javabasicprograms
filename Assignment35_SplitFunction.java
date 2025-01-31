package javaAssignments;
import java.util.Arrays;

public class Assignment35_SplitFunction {

	static int countofWords;
	public static void main(String[] args) {
		
		//i)Write a program to split the string "Java is fun" into individual words.
		
		String input="Java is fun";
		String [] str=input.split(" ");
		System.out.println(Arrays.toString(str));
		
		
		//ii)Split the string "Java Python C++" using a comma.
		
		String input1="Java,Python,C++";
		String[]str1=input1.split(",");
		System.out.println(Arrays.toString(str1));
		
		
		//iii)Split the string "Java is fun to learn" into at most 3 parts.
		
		String input3= "Java is fun to learn";
		String [] str3=input3.split(" ", 3);
		System.out.println(Arrays.toString(str3));
		
		
		//iv)Write a program to split a sentence into words, count the words, and print them.

		String input4="Java is fun to learn";
		String [] str4=input4.split("");
		System.out.println(Arrays.toString(str4));
		
		//Count the word
	    int a=str4.length;
	    System.out.println("Number words count is-->"+a);	
		
		
		
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

