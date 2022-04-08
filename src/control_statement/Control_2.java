package control_statement;

public class Control_2 {

	public static void main(String[] args) {
		// if marks are in between >40 and <60 ist class
		// if marks are in between >=60 and <75 2ns class
		// if marks are in between >=75 then dist

		int marks = 41;
		
		if  (marks>40 & marks<60)
		{
			System.out.println("i am is 2nd class");
		}
		
		else if (marks>=60 & marks<75)
		{
			System.out.println("i am in 1st class");
		}
		
		else if (marks>=75)
		{
			System.out.println("i am in dist");
		}
		
		else 
		{
			System.out.println("i am fail");
		}

		
	}

}
