package patterns2;

public class Desendingordertri {

	public static void main(String[] args) {
		
//              *****
//               ****
//                ***
//                 **
//                  *
		
		int star=5;
		int space=4;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		
		
		
		
		
		
		
	}

}
