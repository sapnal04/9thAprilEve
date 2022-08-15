package methods;

public class BaseClass {

	public static void main(String[] args) {
		free();
		BaseClass bc=new BaseClass();
		bc.tree("sapna", 3, 59.09f);
		

	}
	
	public static void free()
	{System.out.println("I want to be free");}
	
	public void tree(String a,int b,float c)
	{System.out.println(a+" "+b+" "+c);}

}
