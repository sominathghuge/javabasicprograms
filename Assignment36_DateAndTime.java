package javaAssignments;

import java.util.Date;

//"Assignment 36: Write a program for the below scenarios using date class.

public class Assignment36_DateAndTime {
	
	public static void main(String[] args) {
		
		//i)To get Current Time 
		System.out.println("-----Current Time-----------");
		
		Date d=new Date();
		
		System.out.println(d.getTime());
		
		
		String input=d.toString();    // Convert epoch time to human readable format
		
		System.out.println(input);    //print day,date,month,time,year
		
		String current_time=input.substring(11, 19);
		System.out.println("Current Time-->"+current_time);
		
		
		//ii)To get future Time
		System.out.println("-----Past Time-----------");
		Date d1=new Date();
	
		Date d11=new Date((d1.getTime()-(1000*60*60*24*4)));
		
		String input1=d11.toString();
		
		System.out.println(input1);
		
		String past_time=input1.substring(11,19);
		System.out.println("Past time-->"+past_time);
		
		
		
		//iii)To get Past Time.
		System.out.println("-----Future Time-----------");
		Date d2=new Date();
	
		Date d22=new Date((d2.getTime()+(1000*60*60*24*4)));
		
		String input2=d22.toString();
		
		System.out.println(input2);
		
		String future_time=input2.substring(11,19);
		System.out.println("Past time-->"+future_time);
		
		
		
		
		
		
		
		
		
	}

}
