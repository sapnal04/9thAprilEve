package Loopss;

import accessSpecifiers.Access;

public class CheckAccess extends Access {

	public static void main(String[] args) {
		Access a=new Access();
		a.apple();
		
		CheckAccess c=new CheckAccess();
		c.apple();
		c.dog();

	}

}
