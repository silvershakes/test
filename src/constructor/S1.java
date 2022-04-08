package constructor;

public class S1 {
	
	public S1()           //this is constructor                                            3rd step
	{
		System.out.println("we are using zero contructor method");
	}
	
	
	
	public static void main(String[] args)                                   //2nd step
	{
		S1 S1 = new S1();          //object creation
		
		S1.test123();                        //calling 
		S1.test12456();                  //calling
		test12578();                     //calling 

	}

	public void test123()                  //non static                              1st step
	{
		System.out.println("well this is shit");
	}
	public void test12456()                         //non static
	{
		System.out.println("krupa krupa");
	}
	public static void test12578()                  //static
	{
		System.out.println("kruuuuuuuu");
	}
	
	
	
	
}
