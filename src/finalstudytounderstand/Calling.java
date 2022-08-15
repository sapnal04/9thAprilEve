package finalstudytounderstand;

public class Calling {

	public static void main(String[] args) {
		System.out.println("================");
		System.out.println("***************");
		
		tree();
		ForCalling.fire();
		
		Calling t=new Calling();
		t.hut();
		t.him();
		
		ForCalling j=new ForCalling();
		j.free();


	}
public static void tree()
{
	String empname="Sappi";
	int empID=1234;
	System.out.println("Employee name: "+empname);
	System.out.println("Employee ID: "+empID);
	}
public void him()
{int a=5;
System.out.println("number "+a);
	
}

public void hut()
{float temp= 34.8f;
System.out.println("My temp is "+temp);
	
}

}
