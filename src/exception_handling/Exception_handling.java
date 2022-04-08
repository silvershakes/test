package exception_handling;

public class Exception_handling {

	public static void main(String[] args)
	{
       int a = 10;
       int b = 0;
       
      
       
       
       try
       {
    	   int div=a/b;
    	   System.out.println(div);
     	} 
       catch (Exception e) 
       {
		System.out.println("we cant divide any number with zero");
    	}

       
       String name="pravin";
      
     try {
    	 char f = name.charAt(6);
	} catch (Exception e) {
		System.out.println("out of bound");
	}
       
      
       
       
       
	}

}
