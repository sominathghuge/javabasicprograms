package encapsulation;

public class GetterAndSetter5 {
	
	private String str="Pavan";
	
	public String getStr()
	{
	    return str;
	}
	public void setStr(String str)
	{
		this.str=str;	
	}
    
	public static void main(String[] args) {
		
		GetterAndSetter5 gs=new GetterAndSetter5();
		
		gs.setStr("Ravan");
		
		System.out.println(gs.getStr());
	
		
	}
}
