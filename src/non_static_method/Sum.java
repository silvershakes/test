package non_static_method;

public class Sum {// for that 
	//int a=100;
	//int b=200;
	//sum=a+b;
	//syso("sum is "+sum)
	
	public void sum() {
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println("sum is "+sum);	
		
	}
	public void sum1 () 
	{ int a=500;
	int b=300;
	int sum1=a+b;
	System.out.println("sum1 is "+sum1);
		
	}
	public void sum2() 
	{ int a=10000;
	int b=5000000;
		int sum2=a+b;
		System.out.println("sum2 is "+sum2);
		
	}
	
	
	public static void main(String[] args) {
		Sum s3 = new Sum();
		s3.sum();
		s3.sum1();
		s3.sum2();
	}

}
