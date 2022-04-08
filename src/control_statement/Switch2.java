package control_statement;

public class Switch2 {

	public static void main(String[] args) {
		//week days
		//1=sunday
		//2=monday
		//3=tuesday
		//4=wednesday
		//5=thurday
		//6=friday
		//7==saturday

		
		int day=8;
		
		switch (day) 
		{
		case 1: System.out.println("this is sunday");
			
		break;
		
		case 2: System.out.println("this is monday");
		
		break;
		
		case 3: System.out.println("this is tuesday");
		
		break;
		
		case 4: System.out.println("this is wednesday");
		
		break;
		
		case 5: System.out.println("tis is thursday");
		
		break;

		case 6: System.out.println("this is friday");
		
		break;

		case 7: System.out.println("this is saturday");
		
		break;

		default: System.out.println("enter values in between 1 to 7");
			break;
		}
	}

}
