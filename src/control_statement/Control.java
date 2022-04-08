package control_statement;

public class Control {

	public static void main(String[] args) {
		//marks is 40 to 60 then 2nd class
		         // 60 to 75 then 1st class
		          // above 75 then dist
		           //40< & >60     2nd class
		           //<=60 & >75     1st class
		           //<=75                 dist
		
		
		int marks = 10;
		if  (marks>40 & marks<60)
		{
			System.out.println("i am is 2nd class");
		}
		
		if (marks>=60 & marks<75)
		{
			System.out.println("i am in 1st class");
		}
		
		if (marks>=75)
		{
			System.out.println("i am in dist");
		}
		
		else 
		{
			System.out.println("i am fail");
		}

	}

}
