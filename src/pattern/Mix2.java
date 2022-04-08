package pattern;

public class Mix2 {

	public static void main(String[] args) {
//		*****
//		 ****
//		  ***
//		   **
//		    *
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		int star=5;
		int space=0;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
				{
				System.out.print(" ");
				}
		    for(int h=1;h<=star;h++)
		    {
		    	System.out.print("*");
		    }
		System.out.println();
		space++;
		star--;
	
		}
		
		int star1=2;
		int space1=3;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int h=1;h<=star1;h++)
			{
				System.out.print("*");
			}
			System.out.println();
			space1--;
			star1++;
		}

	}

}
