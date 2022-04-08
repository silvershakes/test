package control_statement;

public class Switch4 {

	public static void main(String[] args) {
		// month
		//1=jan
		//2=feb
		//3=mar
		//4=apr
		//5=may
		//6=jun
		//7=jul
		//8=aug
		//9=sep
		//10=oct
		//11=nov
		//12=dec
		
		int value = 5;
		
		switch (value) 
		{
		case 1:System.out.println("running jan");
			
		break;
		
		case 2:System.out.println("running feb");
		
		break;
		
		case 3:System.out.println("running mar");

		break;
		
		case 4:System.out.println("running apr");

		break;

		case 5:System.out.println("running may");

		break;

		case 6:System.out.println("running jun");
		
		break;

		case 7:System.out.println("running jul");
		
		break;

		case 8:System.out.println("running aug");

		break;

		case 9:System.out.println("running sep");
		
		break;

		case 10:System.out.println("running oct");

		break;

		case 11:System.out.println("running nov");
		
		break;

		case 12:System.out.println("running dec");

		break;

		default:System.out.println("enter values between 1 to 12 ");
			break;
		}
		

	}

}
