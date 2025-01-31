package javaAssignments;

public class Employee_Assignment6 {
	
	//Assignment 6  : Create an employee class and demonstrate the constructor overloading types by providing the different paramaters like, employee name,employee_id,employee_company,designation,salary.

	 Employee_Assignment6(String a, String b, String c)
	{
		System.out.println("Employee name is: Sushant");
		System.out.println("Employee Company name is: TCS");
		System.out.println("Employee Designation is: QA eng");
	}
	Employee_Assignment6(int b)
	{
		System.out.println("Employee ID is: 225");
	}
	Employee_Assignment6(long salary)
	{
	    System.out.println("Employee salry is: 55425");	
	}
	
	public static void main(String[] args) {
		
//		Employee_Assignment6 ea1=new Employee_Assignment6("Sushant","TCS","QA eng");
//		Employee_Assignment6 ea2=new Employee_Assignment6(564);
//		Employee_Assignment6 ea5=new Employee_Assignment6(47878l);
		
		// Or
		
		new Employee_Assignment6("Sushant","TCS","QA eng");
		new Employee_Assignment6(564);
		new Employee_Assignment6(47878l);
		
		
		
		
		
		
	}
	
	
	
}
