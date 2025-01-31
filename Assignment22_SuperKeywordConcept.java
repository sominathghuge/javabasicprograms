package javaAssignments;

//"Assignment 22: Use 'Super' Keyword in the previous methodoverriding program, to access the superclass method in overridden methods".
class East{
	 
	void student(int a)
	{
		System.out.println("In the 10th class total 80 students.");
	}
	
	void teacher()
	{
		System.out.println("Teacher giving assignments to students.");
	}
}

class West extends East{
	
	void student() 
	{
		super.student(0);
		System.out.println("All student doing assigments.");
	}
    
	void teacher()	
	{
		super.teacher();
		System.out.println("Theacher verifying thier assignment.");
	}

}
public class Assignment22_SuperKeywordConcept {

      public static void main(String[] args) {
		
    	  West s=new West();
          s.student();
          s.teacher();
    	  
	}
	
	
	}