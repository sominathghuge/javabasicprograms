package encapsulation;

public class GetterAndSetter {
	
	private String emailid="Sominathghuge1@gmail.com";
	
	public String getEmailId()
	{
		return emailid;
	}
	
	public void setEmailId(String emailid)
	{
		this.emailid=emailid;
	}
	

	public static void main(String[] args) {
		
		GetterAndSetter a=new GetterAndSetter();
		
		a.setEmailId("Sominathghgue111@gmail.com");
		System.out.println(a.getEmailId());
		
		
		
	}

}
