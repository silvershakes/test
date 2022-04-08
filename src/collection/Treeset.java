package collection;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) 
	{
		TreeSet<Integer> in = new TreeSet<Integer>();
		
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		in.add(5);
		
		System.out.println("poll first "+in.pollFirst());
		
		System.out.println(in);
		
		in.pollLast();
		System.out.println(in);
		
		in.clear();
		System.out.println(in);
		
		in.retainAll(in);
		System.out.println(in);
	}

}
