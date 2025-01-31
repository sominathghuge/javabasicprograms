package javaAssignments;

import java.util.Arrays;

//Assignment 71: Write a java code to print count of each character of a string without using build-in length function.
//String name = "Lionel Messi LM10";
public class Assignment71_CountOfAlphabet {
	
	static int countOfAlphabets=0;
	
	public static void main(String[] args) {
		
		String name = "Lionel Messi LM10";
		
		char [] c=name.toCharArray();
		
		System.out.println(Arrays.toString(c));
		
		for(int i=0; i<=name.length()-1; i++)
		{
			boolean a1= Character.isAlphabetic(c[i]);
			if(a1==true)
			{
				countOfAlphabets++;
			}
			
		}
		System.out.println("Number of counts in Alphabet is: "+countOfAlphabets);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
