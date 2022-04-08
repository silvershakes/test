package interface1;

public class Son implements Father,Mother{

	public static void main(String[] args) {
		Son s = new Son();
		s.love();
		s.money();
		s.nature();
		s.rules();
		s.test1();
		test2();
		Mother.test3();
		

	}

	@Override
	public void love() {
		Father.super.love();
		Mother.super.love();
		
	}

	@Override
	public void nature() {
		System.out.println("mothers nature");
		
	}

	@Override
	public void money() {
System.out.println("fathers money");		
	}

	@Override
	public void rules() {
System.out.println("fathers rules");		
	}
    
	public void test1()
    {
    	System.out.println("sons test");
    	
    }
    
    public static void  test2()
    {
    	System.out.println("sons static test");
    }
}
