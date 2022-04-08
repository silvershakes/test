package addition1;

public class Info1 {
	public void studentinfo() 
	{
		String name="pravin";
		int age=24;
		float weight=60.3f;
		char grade='b';
		System.out.println("student name is "+name );
		System.out.println("student age is "+age);
		System.out.println("student weight is "+weight);
		System.out.println("student grade is "+grade);
		
	}

	public static void main(String[] args) {
		
Info1 f1 = new Info1();
f1.studentinfo();
f1.studentinfo1("pravin", 24, 60.3f, 'b');
f1.studentinfo1("krupa", 22, 47, 'a');
f1.studentinfo1("apurva", 24, 60.2f, 'b');

	}

	public void studentinfo1(String name,int age,float weight,char grade) 
	{
		System.out.println("student name is "+name );
		System.out.println("student age is "+age);
		System.out.println("student weight is "+weight);
		System.out.println("student grade is "+grade);
	}
	
	
	
	
	
	
}
