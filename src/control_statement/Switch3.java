package control_statement;

public class Switch3 {

	public static void main(String[] args) {
		// grades
		//c= percentage in between >40 to <60
        //b= percentage in between >60 to <75
		//c=percentage is above >75
		char grade = 2;
		
		switch (grade) 
		{
		case 1:System.out.println("percentage in between >40 to <60");
			
		break;
		
		case 2:System.out.println("percentage in between >60 to <75");

		break;

		case 3:System.out.println("percentage is above >75");
		
		break;

		default:System.out.println("enter alphabet in between a to c");
			break;
		}
		
		
		
		
		
		
	}

}
