package genralization;

public class Jio implements TRAI{

	@Override
	public void sms() {
		System.out.println("jio 100/day sms ");
		
	}

	@Override
	public void data() {
		System.out.println("jio 1gb/day");
		
	}

	@Override
	public void call() {
		System.out.println("jio unlimitied ");
		
	}
	void jiotv()
	{
		System.out.println("jio tv service");
	}
     
}
