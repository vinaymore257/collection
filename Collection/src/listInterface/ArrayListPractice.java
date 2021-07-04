package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList(); //default capacity = 10
		a.add("abc");
		a.add (100);
		a.add('A');
		a.add(65.5f);
		
		System.out.println(a);
		
		a. add(100); //Duplicate values  
		a. add(null); 
		a. add(null); //multiple null values 
		
		System.out.println(a.isEmpty());       //Empty or not?
		System.out.println(a.size());          //getting size
		System.out.println(a.contains(100));   //Having value?
		System.out.println(a.get(3));		   //value@index
		System.out.println(a.indexOf('A'));    //Get index
		System.out.println(a.lastIndexOf(100)); //Get last index
		
		//Insert new information in array list
		a.add(4, 200);                   //Right shift operation
		System.out.println(a);
		
		//Remove information in array list
		a.remove(4);
		System.out.println(a);			//Left shift operation
		
		//update information
		a.set(5, 200);
		System.out.println(a);			//replace existing value
		
		System.out.println("---Print all data using Iterator Cursor---");
		Iterator i = a.iterator();
		
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		
		System.out.println("---Print all data using List Iterator Cursor---");
		ListIterator l = a.listIterator();
		
			while(l.hasNext())
			{
				System.out.println(l.next());
			}
		
			System.out.println("---Print all data using for loop---");
			for (int j=0; j<a.size(); j++)
			{
				System.out.println(a.get(j));
			}
		
		
	}

}
