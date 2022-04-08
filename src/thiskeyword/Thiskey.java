package thiskeyword;

public class Thiskey {

	//it is used to call global variable from same/current class
	int a=100;  //globle 
	int b=23;   //globle
	
	public static void main(String[] args) 
	{
		Thiskey t = new Thiskey();
		t.test();

	}

	public void test() 
	{
		int c=50;    //local
		int sum= 100+c;
		System.out.println("sum is "+sum);
		
		int d=45;
		int sum1=c+d+this.a;
		System.out.println("gsum is "+sum1);
		
	}
	
	
	
	
	
	
}
