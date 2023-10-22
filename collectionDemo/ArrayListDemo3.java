package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 
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

		ArrayList<String> tools=new ArrayList<String>();
		tools.add("Selenium");
		tools.add("Jenkins");
		tools.add("Appium");
		
		System.out.println("Is list empty?: "+tools.isEmpty());
		System.out.println("Total elements are: "+tools.size());
		
		System.out.println(tools);
		System.out.println("Iterator()");
		Iterator<String> ir=tools.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		System.out.println("******************************");
		
		ArrayList<Double> marks=new ArrayList<>();
		marks.add(67.78);
		marks.add(65.77);
		marks.add(90.77);
		
		System.out.println("Total Elements: "+marks.size());
		System.out.println(marks);
		System.out.println("Iterator()");
		
		Iterator<Double> m=marks.iterator();		
		while(m.hasNext())
		{
			System.out.println(m.next());
		}
		
		
		
		System.out.println("***************************");
		
		ArrayList<Object> empdata=new ArrayList<Object>();
		empdata.add("Pankaj");
		empdata.add('M');
		empdata.add(40);
		empdata.add(9897987999L);
		empdata.add("Pune");
		
		System.out.println(empdata);
		
		
		//List<Integer> list1=new ArrayList<>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
