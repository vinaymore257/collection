package set;

import java.util.Iterator;
import java.util.TreeSet;



public class TreeSet_Class {

	public static void main(String[] args) {
		//Doesn't allow duplicate values
		//Null value is not allowed
		//Order of insertion: Ascending
		//No default capacity
		//Data storage: Balance Tree
		//Storage Type:HashTable
		//Best choice for removing duplicate values when order of insertion is in ascending order.
		//only homogeneous data can be store
		
		TreeSet tr = new TreeSet();
		tr.add(100);
		tr.add(50);
		tr.add(150);
		tr.add(25);
		tr.add(50);
		//tr.add("abc"); - ClassCastException
		//tr.add(null); - Null pointer exception
		tr.add(200);
		
		System.out.println(tr);
		System.out.println(tr.contains(100));
		System.out.println(tr.first());
		System.out.println(tr.last());
		System.out.println(tr);
		tr.pollFirst();     //delete 1st value
		System.out.println(tr);
		tr.pollLast();		//delete last value
		System.out.println(tr);
		tr.remove(50);
		System.out.println(tr);
		
		System.out.println("---Print all information of TreeSet---");
		Iterator itr = tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all information of TreeSet in descending---");
		Iterator ditr = tr.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		
		
	}

}
