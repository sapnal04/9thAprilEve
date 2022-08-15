package thisC;

public class SuperClass extends ThisClass{

	int a=20;
	int b=40;
	
	public static void main(String[] args) {
		
		SuperClass s=new SuperClass();
		s.apple();
		System.out.println("========");
		s.cheeku();
	}
	
	public void apple()
	{
		int a=50;
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(this.a);
		System.out.println(super.b);
	}

}
