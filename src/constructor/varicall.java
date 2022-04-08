package constructor;

public class varicall {
	int a=12345;//non static 
	int b=12369;//non static
	static int c=1258;//static
	

	public static void main(String[] args) {
		
		varicall va= new varicall();//object creation
		
		System.out.println("value of variable is "+va.a);
		System.out.println("value of variable is "+va.b);
		System.out.println("value of variable is "+c);
	}

}
