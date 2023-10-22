package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo2 
{

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
			
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		System.out.println("Is list initially empty?: "+al.isEmpty());//true
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(40);
		
		System.out.println("Is list empty after adding elements?: "+al.isEmpty());//false

		System.out.println(al);
		System.out.println("Total Elements are: "+al.size());//5
		System.out.println("Is 50 available in list?: "+al.contains(50));//false
		System.out.println("Is 10 available in list?: "+al.contains(10));//true

		al.add(0, null);
		
		System.out.println(al);
		
		//to remove single element
		al.remove(0);
			
		System.out.println(al);
		
		//to remove all elements 
		al.removeAll(al);
		
		System.out.println(al);

//		al.clear();
//		
//		System.out.println(al);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
