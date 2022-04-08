package non_static_method;

public class example2 {

	public static void main(String[] args) {
		// we need to create object
		//class name object name= keyword class name
		example2 e2 =new example2();
				//now we call non static member 
				e2.test123();

	}

	
	public void test123()
	{
		System.out.println("well ell well");
	}
}
