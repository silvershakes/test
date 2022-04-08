package non_static_method;

public class From_another_class {

	public static void main(String[] args) {
		example2 e2 = new example2();
		e2.test123();
		Example3 e3 = new Example3();
		e3.attitude();

		//from same class
		From_another_class f2 = new From_another_class();
f2.test123456();

	}
public void test123456() 
{
System.out.println("well adsmdjsdshdisahiu");	
}
}
