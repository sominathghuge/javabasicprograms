package javaAssignments;

import java.util.Scanner;

public class Assigment11 {
	
	//Assignment 11: Demonstrate the Scanner class usage by taking user inputs of a student like ID,Name,College,Branch,phone_no and print the same"

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your student ID");
		int ID=sc.nextInt();
		System.out.println("This is your college ID: "+ID);
		
		System.out.println("=======================");
		
		System.out.println("Enter your Name");
		String name=sc.next();
		System.out.println("Student name is: "+name);
		
		System.out.println("=======================");
		
		System.out.println("Enter your collage name");
		String clgname=sc.next();
		System.out.println("Your collage name is: "+clgname);
		
		System.out.println("=======================");
		
		System.out.println("Enter your Branch name");
		String branch=sc.next();
		System.out.println("Your branch name is: "+branch);
		
		System.out.println("=======================");
		
		System.out.println("Enter your Phone Number");
		long phonNumber=sc.nextLong();
		System.out.println("Your phone number is: "+phonNumber);
		sc.close();
		
		
		
	}
	
	
}
