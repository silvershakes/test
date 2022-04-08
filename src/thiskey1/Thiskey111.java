package thiskey1;

public class Thiskey111 {

	//globle variable
	int a =100;
	int b =200;
	int c =300;
	
	public static void main(String[] args) {
		Thiskey111 th = new Thiskey111();
		th.test1();

	}

	public void test1()
	{
		//local vaiable 
		int c =500;
		int sum = c+a;
		System.out.println("sum is "+sum);
		
		int sum1= this.c+c;
		System.out.println("sum1 is "+sum1);
		
		
	}
	
	
	
	
	
}
