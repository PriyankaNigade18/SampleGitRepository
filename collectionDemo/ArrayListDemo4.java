package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {
	/*
	 * ArrayList is class implements List interface
	 * Underline data structure is Dynamic array
	 * It is an ordered collection
	 * duplicate elements allowed
	 * Frequent operation is data retrieval
	 * Internally 10 virtual segment it will create
	 * Method: 
	 * add(),get(),isEmpty(),contains(),remove(),clear()
	 * 
	 */
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		
		System.out.println("Iteration Using simple for loop");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("Iteration Using for each loop");
		
		for(Integer i:al)
		{
			System.out.println(i);
		}

		System.out.println("Iteration Using iterator()");

		/*
		 * iterator() is method in Iterable interface
		 * this method returns Iterator object
		 * In java Iterator is an Interface
		 * this interface contains two methods
		 * 1.hasNext(): Is element is available
		 * 2.next(): 1.get the current element
		 * 			 2.increment counter for list/element
		 * 
		 * 
		 */
		
		
		Iterator<Integer> ir=al.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
			

	}

}
