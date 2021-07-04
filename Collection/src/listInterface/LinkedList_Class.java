package listInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Class {

	public static void main(String[] args) {
		//Duplicate & multiple null values are allowed
		LinkedList l = new LinkedList();
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
		System.out.println(l.get(2));
		System.out.println(l.indexOf(65.5f));
		System.out.println(l.lastIndexOf(100));
		
		System.out.println("---print information using Iterator---");
		Iterator i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("---print information using List Iterator---");
		ListIterator j = l.listIterator();
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
	
		System.out.println("---print information using for loop---");
		for(int k=0; k<l.size(); k++ )
		{
			System.out.println(l.get(k));
		}
		

	}

}
