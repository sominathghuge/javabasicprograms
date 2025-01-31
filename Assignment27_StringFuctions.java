package javaAssignments;
//Assignment 27:
public class Assignment27_StringFuctions {

	public static void main(String[] args) {
		
		//Q.1: Write a program to check if a given string is a palindrome.
		
		 String dr= "rotator";
		 String reverse="";
		 
		 for(int i=0; i<=dr.length()-1; i++)
		 {
			 char c=dr.charAt(i);
			 reverse=reverse+c;
		 }
		System.out.println(reverse);
		
		if(dr.equals(reverse))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is NOT a palindrome");
		}
		
		
		//Q.2: Check if two strings are equal
       
		String s1 = "Java";
        String s2 = "java";
		
        boolean b=s1.equals(s2);
        System.out.println("Both string are equals?-->"+b);
        
      
        //Q.3: dispaly the trimmed string from the original string "  A very Good Morning !  "
        
        String a= "  A very Good Morning !  ";
		System.out.println(a.trim());
		
				
		
	}
}
