package javaAssignments;
import java.util.Arrays;
//Assignment 30: find the below from the given string: " Hello! 123@ jAvA_" 

public class Assignment30_CountOFAlphabets {

	static int countOfAlphabets=0;
	public static void main(String[] args) {
		
		//a)Number of alphabets used?

		String str=" Hello! 123@ jAvA_";
		char[] c=str.toCharArray();
		System.out.println(Arrays.toString(c));
	
		for(int i=0; i<=str.length()-1; i++)
		{
			boolean b= Character.isAlphabetic(c[i]);
			if(b==true)
			{
				countOfAlphabets++;
			}
		}
		System.out.println("Number of Alphabets use in given string is--> "+countOfAlphabets);
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
