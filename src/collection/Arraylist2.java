package collection;

import java.util.ArrayList;

public class Arraylist2 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println("======================");
		System.out.println(al.size());
		System.out.println("======================");
		
//		for(Object o : al)
//		{
//			System.out.println(o);
//		}
		
		for(Integer i : al)
		{
			System.out.println(i);
		}

	}

}
