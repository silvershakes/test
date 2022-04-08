package non_static_method;

public class ex1 {

	public static void main(String[] args) {
		 
//for non static method
		//class name  object name = new object name
		ex1 e1 = new ex1(); 
		//for calling non static method
		e1.test1();
		
		
	}

	public void test1()
	{
		System.out.println("well well well");
	}
}
