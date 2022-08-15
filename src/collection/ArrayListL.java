package collection;

import java.util.ArrayList;

public class ArrayListL {

	public static void main(String[] args) {
		
	    ArrayList al=new ArrayList();
		al.add("Velocity");
		al.add("23");
		al.add("free");
		al.add("Sapna");
		al.add("12.45");
		al.add("true");
		al.add("null");
		al.add("D");
		al.add("Sapna");	
		al.add("null");
	
		System.out.println(al);
		System.out.println("=======");
		System.out.println(al.size());
		System.out.println("=======");
		System.out.println(al.get(7));
		System.out.println("=======");
		System.out.println(al.indexOf("null"));
		System.out.println("=======");
		System.out.println(al.lastIndexOf("null"));
		System.out.println("=======");
		System.out.println(al.remove("Sapna"));
		System.out.println(al.remove("h"));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.add("Tanvi"));
		System.out.println(al);
		al.add(3,"Kshitiz");
		System.out.println(al);
		//al.clear();
		//System.out.println(al);
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");
		}


		
	}

}
