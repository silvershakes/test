package pattern;

public class Equilataral_desending_reianggle {

	public static void main(String[] args) {
//        * * * * *
//         * * * *
//  	    * * *
//           * *
//            *
		
		
		int star=5;
		int space=0;
		
		
		for(int i=1;i<=5;i++)
		{
			for(int g=1;g<=space;g++)
			{
				System.out.print(" ");
			}
			for(int h=1;h<=star;h++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
