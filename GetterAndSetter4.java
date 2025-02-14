package encapsulation;

public class GetterAndSetter4 {
	
	private int date=30;
	
	public int getDate()
	{
		return date;
	}
	
	public void setDate(int date)
	{
		this.date=date;
	}
	

	public static void main(String[] args) {
		
		GetterAndSetter4  gs=new GetterAndSetter4();
		
		gs.setDate(29);
		
		System.out.println(gs.getDate());
		
		
	}

}
