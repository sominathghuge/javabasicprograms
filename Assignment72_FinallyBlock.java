package javaAssignments;

import java.util.InputMismatchException;

//Assignment 72:Write a program to demonstrate Finally block in exception handling.

public class Assignment72_FinallyBlock {
	
	public static void main(String[] args) {
		
		try 
		{
			int a=10/0;
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sorry you can't divide by 0");
		}
		
		finally 
		{
			System.out.println("The end of program..remove all resources");
		}
		
		

		
	}

}
