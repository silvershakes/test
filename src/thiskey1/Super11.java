package thiskey1;

public class Super11 extends Thiskey111{

	
	//globle variable
	int a = 100;
	
	public static void main(String[] args) {
		
		Super11 s = new Super11();
		s.test0();
		s.test1();
	}

	public void test0()
	{
		int a = 500;
		int sum = a+this.a+super.b;
		System.out.println("sum is "+ sum);
	}
	
}
