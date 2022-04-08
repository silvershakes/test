package inheritance;

public class Hirarchical {

	public static void main(String[] args) {
		
		System.out.println("======================");
		Preeti pe = new Preeti();
		pe.money();
		pe.money2();
		pe.property();
		pe.access();
		System.out.println("========================");
		
		System.out.println("==================");
		Prajakta pr = new Prajakta();
		pr.money();
		pr.money2();
		pr.property();
		pr.activa();
		System.out.println("========================");
		
		System.out.println("=====================");
		Pravin pa = new Pravin();
		pa.money();
		pa.money2();
		pa.property();
		pa.baleno();
		System.out.println("========================");
		

	}

}
