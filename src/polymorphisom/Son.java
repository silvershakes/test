package polymorphisom;

public class Son extends Father {

	public static void main(String[] args) {
		Father f= new Father();
		Son s = new Son();
		
		f.money();
		s.money();

	}
public void money()
{
System.out.println("sons money 12k ");	
}
}
