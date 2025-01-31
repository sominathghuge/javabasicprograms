package javaAssignments;

import java.util.Date;

//Assignment 37: Write a program to display the time in the format: "Wed, Nov 20";
public class Assignment37_DisplayTime {
	
	public static void main(String[] args) {
		
		Date d=new Date();
		
		System.out.println(d.getTime());
		
		String input=d.toString();
		System.out.println(input);
		
		
		String day=input.substring(0,3);
		System.out.println(day);
		
		String month_date=input.substring(4, 10);
		System.out.println(month_date);
		
		System.out.println(day.concat(", ")+month_date);
		
	
		String currentTime=input.substring(11, 19);
		System.out.println("Current Time is-->"+currentTime);
		
		
		
		
		
		
		
		
		
	}

}
