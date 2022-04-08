package collection;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) 
	{
                  Vector<Object> v=new Vector<Object> ();
                  
                  v.add(1235);
                  v.add(null);
                  v.add('a');
                  v.add("pravin");
                  
                  System.out.println(v);
                  
                  
                  for(Object o : v)
                  {
                	  System.out.println(o);
                	  
                  }
                  
                  System.out.println(v.indexOf('a'));
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
	}

}
