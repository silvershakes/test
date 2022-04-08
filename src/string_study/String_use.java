package string_study;

public class String_use {

	public static void main(String[] args)
	{
		String m = "Velocity";           //without using new keyword
		String m1 = "Velocity";
		
		String n = new String("Velocity");
		String n1 = new String("Velocity");
		String n2 = new String("Velocity pune");
		
		System.out.println(m==m1);
		System.out.println(m==n1);                     // ==
		System.out.println(m.equals(n));
		System.out.println(m.equals(n2));                     //equals()
		System.out.println(m1.equals(n1));
		 
		System.out.println(m.toUpperCase());                 //upppercase
		System.out.println(m.toLowerCase());                    //lowercase
		System.out.println(m1.toLowerCase());                         //lowerrcase
		System.out.println(n2.toUpperCase());                     //upppercase
		
		System.out.println(m.length());
		System.out.println(m1.length());
		
		int a = m.length();                                       // length 
		System.out.println("value of a is "+m.length());
		
		System.out.println(m.equalsIgnoreCase(n2));              //ignore case
		System.out.println(m.equalsIgnoreCase(n1));
	}

}
