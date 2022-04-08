package non_static_method;

public class Sum1 {
	public void sum1() {
		 int a=123456789;
		 int b=987456321;
		 int sum1=a+b;
		 System.out.println("sum1 is "+sum1);
		 
	}

	public static void main(String[] args) {
		
Sum1 s1 = new Sum1();
s1.sum1();

sub();
sub1();
sub2();
	}

	
	
	
	
	public static void sub() 
	{
		int a=123456;
		int b=1254;
		int sub=a-b;
		System.out.println("sub is "+sub);
	}
	public static void sub1()
	{
		int a=123226;
		int b=54641;
		int sub1=a-b;
		System.out.println("sub1 is "+sub1);
	}
	public static void sub2() {
		int a=5461;
		int b=26654;
		int sub2=a-b;
		System.out.println("sub2 is "+sub2);
		
		
	}
	
	
}
