package arrey_study;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {

		char grade[] = new char[8];
		
		grade[0]='c';     // a b c d e f g h i
		grade[1]='a';
		grade[2]='d';
		grade[3]='f';
		grade[4]='i';
		grade[5]='b';
		grade[6]='g';
		grade[7]='e';
		
		for(int i=0;i<=grade.length-1;i++)
		
			System.out.println(grade[i]);
		
		
		Arrays.sort(grade);
		
		System.out.println("==================");
		for(int i=0;i<=grade.length-1;i++)
		
			System.out.println(grade[i]);
		
		
		
		
		
		
		
		
		
		
	}

}
