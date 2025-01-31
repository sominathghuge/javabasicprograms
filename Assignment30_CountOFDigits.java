package javaAssignments;

import java.util.Arrays;

public class Assignment30_CountOFDigits {
	
	static int countOfDigits=0;
	public static void main(String[] args) {
		
		//b)Number of numeric used?
		
		String str= " Hello! 123@ jAvA_";
		char c[]=str.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0; i<=str.length()-1; i++)
		{
			boolean b=Character.isDigit(c[i]);
			if(b==true)
			{
				countOfDigits++;
			}
		}
		
		System.out.println("The count of digits in a given string is--> "+countOfDigits);
		
        
		
		
		
		
		
		
		
	}
	

}
