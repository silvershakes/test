package dec27;

public class Sc4 {
	float a;
	float b;
	float c;
	
	public Sc4()
	{
		a=0.24f;
		b=0.35f;
		c=0.23f;
	}
	public Sc4(float num1)
	{
		a=num1;
		System.out.println("using 1 paramter");
	}

	public static void main(String[] args) {
		Sc4 s1 = new Sc4();
		s1.addition();
		Sc4 s12 = new Sc4(0.23f);
		s12.addition();

	}
public void addition()
{
	float sum=a+b+c;
	System.out.println("addtion is "+sum);
	
	}
}
