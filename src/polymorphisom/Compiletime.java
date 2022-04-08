package polymorphisom;

public class Compiletime {

	public static void main(String[] args) {
		Compiletime c= new Compiletime();
		
c.test();
c.test(200, 356);
c.test(11.20f, 52.236f);
	}

	//overloading of methods 
	public void test()
	{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	public void test(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
     
	public void test(float a,float b)
	{
		float sum=a+b;
		System.out.println("sum is "+sum);
	}



}
