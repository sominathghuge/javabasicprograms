package inheritance;

//Multilevel inheritance for Static methods (Minimum 3 classes)
class Truck{
	
	static void heavy()          //static method
	{
		System.out.println("-Truck so loading vehical, we can load up to 20 tonne.");
	}
}

class Car extends Truck{
	
	static void mediumHeavy()    //static method
	{
	
		System.out.println("-Car for only family member, 4 to 5 persons.");
	}
}

class Bike extends Car{
	
	void lowheavy()             //Non-static method
	{
		System.out.println("-Bike for 2 persons only");
	}
}
public class MultiLevel1 {
	
	public static void main(String[] args) {
		//for static methods
	   Car.heavy();
	   Car.mediumHeavy();
		
	   
	   //for Non-static methods
	   Bike b=new Bike();
	   
	  // b.heavy();
	 //  b.mediumHeavy();
	   b.lowheavy();
			   
	}

}
