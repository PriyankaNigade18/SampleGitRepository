package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {

	/*
	 * ArrayList is class implements List interface
	 * Underline data structure is Dynamic array
	 * 
	 */
	public static void main(String[] args)
	{
		/*
		 * Generic way
		 * Type safe and no type casting required
		 */
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(20);
		al.add(200);
		al.add(90);
		al.add(10);
		
		System.out.println(al);
		
		int num=al.get(2);
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * non generic
		 * 1.it is not type safe
		 * 2.type casting required
		 * 
		 */

		/*
		 * ArrayList is a raw type. 
		 * References to generic type ArrayList<E> should be 
	 			parameterized
		 */
//		ArrayList al=new ArrayList();
//		al.add(10);
//		al.add("Sarang");
//		al.add(78.89);
//		al.add('p');
//		
//		System.out.println(al);
//		int num=(int) al.get(0);
//		
//		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
