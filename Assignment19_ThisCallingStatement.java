package javaAssignments;

//"Assignment 19 Write a program on 'this' statement to perform the constructor chaining in the Employee class;
//where Employee class have the parameters: employee name,employee_id,employee_company,designation,salary."
 
class Employee{
	
	Employee(String Employee_Name, String Employee_Company)
	{
		this(565);
		System.out.println("Emoloyee name is Manish Kumar Tiwari");
		System.out.println("The compnay name is TCS ");
	}
	Employee(int Employee_id)
	{
		this("SM");
		System.out.println("The Employee id of employee is 2564");
	}
	Employee(String Designation)
	{
		this(5756l);
		System.out.println("The Designation of Manish Kumar Tiwari is Manager");
	}
	Employee(long salary)
	{
		System.out.println("The Salary of employee is 560000");
	}
}
public class Assignment19_ThisCallingStatement {

	public static void main(String[] args) {
		
	//	Employee e=new Employee("Manish Tiwari", "TCS");
		
		//OR 
		
		new Employee("Manish Tiwari", "TCS");
	}
}
