package javaAssignments;

//Assignment 21 Write a program that demonstrate 'MethodOverridding' for'login'functionality.
//Where as the three subclasses are: Admin,Teacher,Student. and 'User' is Superclass."

class User{                          //Superclass
	
	void login()
	{
		System.out.println("Login the application in User class(Superclass)");
	}
	void logout()
	{
		System.out.println("Logout the application in User class(Superclass)");
	}
}

class Admin extends User{               //Subclass
	
	void login()
	{
		super.login();
		System.out.println("Login the application in Admin class(Subclass)");
	}
	void logout()
	{
		super.logout();
        System.out.println("Logout the application in Admin class(Subclass)");
	}
}
class Teacher extends Admin{            //Subclass
	
	void login()
	{
		super.login();
		System.out.println("Login the application in Teacher class(Subclass)");
	}
	void logout()
	{
		super.logout();
		System.out.println("Logout the application in Teacher class(Subclass)");
	}
}
class Student extends Teacher{           //Subclass
	
	void login()
	{
		super.login();
		System.out.println("Login the application in Student class(Subclass)");
	}
	void logout()
	{
		super.logout();
		System.out.println("Logout the application in Student class(Subclass)");
	}
}

public class Assignment21_MethodOverridding {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.login();
		s.logout();
		
		
		
	}
}
