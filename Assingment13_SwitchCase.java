package javaAssignments;

import java.util.Scanner;

//Assignment 13: Write a program using switch statement to print the days of the week.

public class Assingment13_SwitchCase {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter days number");
		
		int day=sc.nextInt();
		
		switch(day) {
		case 1:
		{
			System.out.println("Day 1: Monday");
			break;
		}
		
		case 2:
		{
			System.out.println("Day 2: Tuesday");
			break;
		}
		
		case 3:
		{
			System.out.println("Day 3: Wednesday");
			break;
		}
		
		case 4:
		{
			System.out.println("Day 4: Thursday");
			break;
		}
		
		case 5:
		{
			System.out.println("Day 5: Friday");
			break;
		}
		
		case 6:
		{
			System.out.println("Day 6: Saturday");
			break;
		}
		
		case 7:
		{
			System.out.println("Day 7: Sunday");
			break;
		}
		
		default:
		{
			System.out.println("In one week have only 7 days.");
		}
	 }
		
		sc.close();
		
	}
	
}
