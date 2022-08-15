package casting;

public class Sub extends Super {

	public static void main(String[] args) {
		Sub s=new Sub();
		s.fish();
		s.goat();
		System.out.println("======");
		
		Super su=new Sub();
		su.fish();
		su.goat();
		

	}
	public void fish()
	{System.out.println("Son fish");}
	
	public void goat()
	{System.out.println("Son goat");}

}
