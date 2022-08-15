package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorr {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(1); v.add(2);v.add(3); v.add(4);v.add(5);v.add(6);
		
		//for loop
		System.out.println("==for loop==");
		for(int i=0;i<=v.size()-1;i++)
		{System.out.print(v.get(i)+" ");}
		System.out.println();
		System.out.println("=======");
		
		//for each loop
		System.out.println("==for each loop==");
		for(Integer de:v)
		{System.out.print((de)+" ");}
		System.out.println();
		System.out.println("=======");
		
		//iterator
		System.out.println("==iterator==");
		Iterator<Integer> it = v.iterator();
		while(it.hasNext())
		{System.out.print(it.next()+" ");}
		System.out.println();
		System.out.println("=======");
		
		//list iterator
		System.out.println("==List iterator==");
		ListIterator<Integer> li = v.listIterator();	
		while(li.hasNext())
		{System.out.print(li.next()+" ");}
		System.out.println();
		System.out.println("=======");
		
		//enumrator
		System.out.println("==Enumrator==");
		Enumeration<Integer> en = v.elements();
		while(en.hasMoreElements())
		{System.out.print(en.nextElement()+" ");}
		System.out.println();
		System.out.println("=======");
		
	}

}
