package swichCase;

import java.util.Scanner;

public class SwitchCase1 {
	
	public static void main(String[] args) {
		
		
		//Switch case(Without break) method by using scanner class.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your case no.");
		
		int input=sc.nextInt();
		
		switch(input)
		{
		case 1:
		{
			System.out.println("Im a engineer");
			
		}
		case 2:
		{
			System.out.println("Im a doctor");
			
		}
		case 3:
		{
			System.out.println("Im a lowyer");
			break;
		}
		
		default:
		{
			System.out.println("There are only 1,2,3 cases");
		}
	}
	
	  sc.close();
	
	
	
	
	
	
	}
}
