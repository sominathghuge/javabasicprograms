package encapsulation;

public class GetterSetter1 {

	private String password="Sominath";

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	
	public static void main(String[] args) {
		
		GetterSetter1  obj= new GetterSetter1();
		obj.setpassword("Testing@1234");
		
		System.out.println(obj.getpassword());
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
