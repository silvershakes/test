package collection;

import java.util.LinkedHashSet;

public class Linkedhashset2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> in =new LinkedHashSet<Integer>();
		
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		in.add(5);
		
		for(Integer i : in)
		{
			System.out.println(i);
		}
	}

}
