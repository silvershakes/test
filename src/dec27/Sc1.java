package dec27;

public class Sc1 {
	int a;
	int b;
	int c;
	public Sc1()//construtor with zero parameter
	{
		a=1000;//veriable initialization
		b=1000;//veriable initialization
		c=1000;//veriable initialization
	}
	public Sc1(int num1)
	{
		a=num1;
		System.out.println("running with 1 parameter");
	}
	public Sc1(int num1,int num2)
	{
		a=num1;
		b=num2;
		
		System.out.println("running with 2 parameter");
	}
	
	public static void main(String[] args) {
		
		Sc1 s1 = new Sc1();
		s1.addition();
		Sc1 s12 = new Sc1(1000);
		s12.addition();
		Sc1 s13 = new Sc1(1000,5000);
		s13.addition();
		
	}
	
	public void addition()
	{
		int sum=a+b+c;
		System.out.println("addition is "+sum);
	}

}
