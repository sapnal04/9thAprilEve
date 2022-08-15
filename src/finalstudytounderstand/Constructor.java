package finalstudytounderstand;

public class Constructor {
	
	int a;//1.variable declaration
	int b;
	public Constructor()
	{
		a=46; b=67;//3.variable assignment
	}
	

	public static void main(String[] args) {
		Constructor co=new Constructor();//4.call
		co.tree();

	}
public void tree()//2-non-static method create 
{
	int c=a+b;
	System.out.println("Sum is "+c);}
}
