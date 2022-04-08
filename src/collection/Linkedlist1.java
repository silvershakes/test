package collection;

import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args)
	{
            LinkedList<Object> ll = new LinkedList<Object>();
            
            ll.add(1234);
            ll.add(45678);
            ll.add(7896);
            
            for(Object o : ll)
            {
            	System.out.println(o);
     
            }
            System.out.println(ll);
            
            
            
	}

}
