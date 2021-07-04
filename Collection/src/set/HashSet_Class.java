package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class HashSet_Class {
	//Set:
	//Duplicate values are not allowed
	//Only 1 null value is allowed except Tree set
	//Random order of insertion
	
	public static void main(String[] args) {
	//Duplicate values are not allowed
	//Allow only 1 null value
	//Storage Type: Hashtable
	//No default capacity
	//Order of Insertion: Random
	//Best choice: To remove duplicate values & insertion order is not mandatory
		
		HashSet l = new HashSet();
		l.add("abc");
		l.add(100);
		l.add('A');
		l.add(65.5f);
		l.add(100);
		l.add(null);
		l.add(null);
		System.out.println(l); //random order of insertion
		
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
		
		//We can remove duplicate values of arraylist
		
		ArrayList a = new ArrayList(); //default capacity = 10
		a.add("abc");
		a.add (100);
		a.add('A');
		a.add(65.5f);
		a. add(100); //Duplicate values  
		a. add(null); 
		a. add(null); //multiple null values 
		System.out.println(a);
	
		HashSet h = new HashSet(a);

		System.out.println(h); 

	}

}
