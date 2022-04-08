package thiskeyword;

public class Superkey extends Thiskey {

	public static void main(String[] args) 
	{
		Superkey s = new Superkey();
		s.test1();

	}
public void test1()
{
int f=40;
int sum=f+super.a;
System.out.println("sum is "+sum);
}
}
