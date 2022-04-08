package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) 
	{
	ArrayList<Object> al = new ArrayList<>();
	
	al.add("velocity");
	al.add(123.23);
	al.add(12);
	al.add('a');
	al.add(null);
	al.add('b');
	al.add(null);
	
	//System.out.println(al);
  
	al.add(4, "pravin");
	 //System.out.println(al.size());
	 
	 
	 for(Object o : al)
	 {
		 System.out.println(o);
	 }
	
	
	}

}
