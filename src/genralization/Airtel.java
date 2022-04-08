package genralization;

public class Airtel implements TRAI{

	@Override
	public void sms() {
		System.out.println("airtel 100/day sms ");
		
	}

	@Override
	public void data() {
		System.out.println("airtel 1gb/day");
		
	}

	@Override
	public void call() {
		System.out.println("airtel unlimitied ");
		
	}
	void airteltv()
	{
		System.out.println("airtel tv service");
	}

}
