package javaAssignments;

import java.util.Arrays;

public class Assignment30_CountOFSpaces {

	static int countOfSpaces=0;
	public static void main(String[] args) {
		
		String str=" Hello! 123@ jAvA_";
		char c[]=str.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0; i<=str.length()-1; i++)
		{
			boolean b=Character.isWhitespace(c[i]);
			if(b==true)
			{
				countOfSpaces++;
			}
		}
		
		System.out.println("The count of spaces in given string is--> "+countOfSpaces);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
