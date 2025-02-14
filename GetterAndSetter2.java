package encapsulation;

public class GetterAndSetter2 {
	
	   private int Age=45;
	   
	   public int getAge()
	   {
		return Age;
		   
	   }
	   public void setAge(int Age)
	   {
		   this.Age=Age;
	   }
	   
	   private int Year= 2024;
	   
	   public int getYear()
	   {
		   return Year;
	   }
	   public void setYear(int Year)
	   {
		   this.Year=Year;
	   }

	   
	public static void main(String[] args) {
		
		GetterAndSetter2 gs=new GetterAndSetter2();
		
		gs.setAge(99);
		System.out.println(gs.getAge());
		
		
		gs.setYear(2099);
		System.out.println(gs.getYear());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
