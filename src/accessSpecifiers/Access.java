package accessSpecifiers;

public class Access {

	public static void main(String[] args) {
		Access a=new Access();
		a.apple();
		a.ball();
		a.cat();
		a.dog();
		
}
	public void apple()
	{System.out.println("apple");};
	
	private void ball()
	{System.out.println("ball");};
	
	void cat()
	{System.out.println("cat");}
	
	protected void dog()
	{System.out.println("dog");}

}
