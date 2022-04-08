package control_statement;

public class Control_3 {

	public static void main(String[] args) {
		//if marks are in >40 to <60 then C grade
		//if marks are in >=60 to <75 then B grade
		//if marks are in >75 then A grade

		int marks = 60;
		
		if (marks>40 & marks<60)
		{
			System.out.println("you are passed and got 55 percentage with grade C ");
		}
		else if (marks>=60 & marks<75)
		{
			System.out.println("you are passed and got 69 percentage with grade B");
		}
		else if (marks>=75)
		{
			System.out.println("you are passed and got 88 percentage with grade A");
		}
		else
		{
			System.out.println("you are fail");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
