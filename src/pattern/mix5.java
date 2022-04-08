package pattern;

public class mix5 {

	public static void main(String[] args) {
//		*         *
//		**       **
//		***     ***
//		****   ****
//		***** *****
// 		****   ****
//		***     ***
//		**       **
//		*         *
		
		int star=1;
		int space=5;
		int star1=1;
		int space1=4;
		
		for(int i=1;i<=9;i++)
		{
			for(int g=1;g<=space;g++)
			{
				System.out.print(" ");
			}
			for(int h=1;h<=star;h++)
			{
				System.out.print("*");
			}
			for(int a=1;a<=space1;a++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=star1;b++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			
			
		}

	}

}
