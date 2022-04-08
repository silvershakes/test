package genralization;

public class Testrun {

	public static void main(String[] args) {
		System.out.println("========================");
		Jio j = new Jio();
		j.call();
		j.data();
		j.sms();
		j.jiotv();
		System.out.println("rate os per sim is "+TRAI.rate);
		System.out.println("========================");
		
		System.out.println("========================");
		Airtel a = new Airtel();
		a.airteltv();
		a.call();
		a.data();
		a.sms();
		System.out.println("rate os per sim is "+TRAI.rate);
		System.out.println("========================");
		
		System.out.println("========================");
		Idea i = new Idea();
		i.call();
		i.data();
		i.ideatv();
		i.sms();
		System.out.println("rate os per sim is "+TRAI.rate);
		System.out.println("========================");
	}

}
