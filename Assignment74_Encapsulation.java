package javaAssignments;

//Assignment 74: Write a program to demonstrate the concept of Encapsulation.

//By giving indirect access by using getter and setter methods.
public class Assignment74_Encapsulation {

	private int OTP=4534;
	
	public int getOTP()
	{
		return OTP;
	}
	
	public void setOTP(int OTP)
	{
		this.OTP=OTP;
	}
	

	public static void main(String[] args) {
		
		Assignment74_Encapsulation  object=new Assignment74_Encapsulation();
		
		object.setOTP(6001);
		
		System.out.println(object.getOTP());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
