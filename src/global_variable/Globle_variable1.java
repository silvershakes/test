package global_variable;

public class Globle_variable1 {
	
	int a=130;//both are non static globle veriable
	int b=600;//both are non static globle veriable
	
	
	
	
	
	

	public static void main(String[] args) {
		Globle_variable1 g1 = new Globle_variable1();
		
          System.out.println("value of a is "+g1.a);
          System.out.println("value of b is "+g1.b);
          g1.test();
          int sum1=102+g1.a;
          System.out.println("sum is "+sum1);
          int sum2=602+g1.b;
          System.out.println("sum is "+sum2);
          int sub=g1.b-g1.a;
          System.out.println("sub is "+sub);
          
          

	}

	
	public void test()
	{
		int c=500;
		int sum=a+c;
		System.out.println("sum is "+sum);
	}
}
