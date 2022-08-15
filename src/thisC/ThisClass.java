package thisC;

public class ThisClass {

	int a=100;
	int b=44;
	
	public static void main(String[] args) {
		
		
		ThisClass t=new ThisClass();
		t.cheeku();
	}
	public void cheeku()
	{
		int a=22;
		System.out.println(a);
		System.out.println(this.a);
	}

}
