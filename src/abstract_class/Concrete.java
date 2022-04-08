package abstract_class;

public class Concrete extends sample1 {

	public static void main(String[] args) {
		Concrete c = new Concrete();
		c.test1();
		c.test3();
		c.test4();
		c.test6();
		test2();

	}

	@Override
	public void test4() 
	{
		System.out.println("3266");
		
	}
public void test6()
    {
	System.out.println("56231");
    }
}
