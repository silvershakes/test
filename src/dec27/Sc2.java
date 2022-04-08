package dec27;

public class Sc2 {
	int a;//variable declaration
	int b;//variable declaration
	int c;//variable declaration
	
	public Sc2()                 //1st constructor
	                            //runnign with 0 parameter
	{
		a=2000;//variable initilization
	    b=2000;//variable initilization
	    c=2000;//variable initilization
	 	
	}
	
	public Sc2(int num1)          //2nd constructor
	                           //running with 1 parameter
	{
		a=num1;
		System.out.println("running with 1 parameter");
	}

	public Sc2(int num1,int num2)
	{
		a=num1;
		b=num2;
		System.out.println("running with 2 parameter");
		
	}
	
	public Sc2(int num1,int num2,int num3)
	{
		a=num1;
		b=num2;
		c=num3;
	}
	
	
	
	public static void main(String[] args) {
		Sc2 s2 =new Sc2();//object creation
		s2.addition();
		Sc2 s21 = new Sc2(1000);
		s21.addition();
		Sc2 s22 = new Sc2(10000, 10000);
		s22.addition();
		Sc2 s23 = new Sc2(1000, 1000,1000);
				s23.addition();
		

	}

	public void addition()
	{
		int sum=a+b+c;
		System.out.println("addition is "+sum);
	}
	
}
