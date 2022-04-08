package collection;

import java.util.HashSet;



public class Hashset {

	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
          for(Integer i :hs)
          {
        	  System.out.println(i);
          }
		
		
		
	}

}
