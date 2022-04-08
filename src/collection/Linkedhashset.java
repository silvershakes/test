package collection;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) 
	{
		LinkedHashSet hl = new LinkedHashSet<>();
		
		hl.add("hsbch");
		hl.add(12351);
		hl.add('k');
		
		for(Object o : hl)
		{
			System.out.println(o);
		}

	}

}
