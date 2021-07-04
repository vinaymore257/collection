package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Class {

	public static void main(String[] args) {
		
		//Doesn't allow duplicate values
		//only single null value is allowed
		//maintained order of insertion
		//no default capacity
		//Data storage: Hybrid (linear+hashtable)
		//Best choice for removing duplicate values when order of insertion is mandatory
		
		LinkedHashSet l = new LinkedHashSet();
		l.add("abc");
		l.add(100);
		l.add('A');
		l.add(65.5f);
		l.add(100);
		l.add(null);
		l.add(null);
		System.out.println(l); //maintain order of insertion
		
		l.remove(null);
		System.out.println(l);
		
		System.out.println(l.isEmpty());
		System.out.println(l.contains(100));
		//System.out.println(l.get(2));
		//System.out.println(l.indexOf(65.5f));
		//System.out.println(l.lastIndexOf(100));
		
		System.out.println("---print information using Iterator---");
		Iterator i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		l.remove(65.5f);
		System.out.println(l);
	}

}
