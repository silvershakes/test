package global_variable;

public class Global_variable {
	int a=20;      //nonstatic global variable
	static int b=30;   //static global variable
	

	public static void main(String[] args) {
		Global_variable gv = new Global_variable();
		System.out.println("global variable is "+gv.a);
		System.out.println("global variable is "+b);
		gv.test();
		gv.test();
		gv.test1();
       test2();

	}

	public void test()
	{
		int c=50;
		int sum=a+c;
		
		System.out.println("addition is "+sum);
	}
	public void test1()
	{
		int d=90;
		int sub=d-b;
		System.out.println("sunstraction is "+sub);
	}
	
	public static void  test2()
	{int a=20;
	int sum=a+b;
	System.out.println("addition is "+sum);
	
	
	}
	
	
}
