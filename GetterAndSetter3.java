package encapsulation;

public class GetterAndSetter3 {
	
	private String string="Automation Testing";
	
	public String getString()                //Getter method
	{
		return string;
	}
	
	public void setString(String String)    //Setter Method
	{
		this.string=String;
	}

	
	
	public static void main(String[] args) {
		
		GetterAndSetter3  gs=new GetterAndSetter3();
		
		gs.setString("API Testing");
	
		System.out.println(gs.getString());

	}

}
