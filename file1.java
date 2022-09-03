package intro;

import java.util.*;

//	PROGRAM TO FIND COMBINATIONS OF 3 DIGIT NUMBERS

public class class0 {
	public static void main(String args[])	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers:  ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int num[] = {a,b,c};
		
		System.out.println("\nThe combination of numbers are :-\n");
		for(int i=0; i<3; i++)	{
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++)	{
					if(i==j || j==k || i==k)
						continue;
					else
						System.out.printf("%d %d %d\n",  num[i], num[j], num[k]);
				}
			}
		}
	}
}
// shivam singh made this CHANGE 1
// THIS IS CHANGE MADE IN BRANCH 1 BY SHIVAM
