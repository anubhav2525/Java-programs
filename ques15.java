// 1
// 2 3
// 4 5 6
// 7 8 9 10

import javax.swing.*;
class ques15
{
	public static void main(String[] a)
	{
		int i, k=1;
		int j;
		for(i=1; i<=4; i++) 
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}

//ques15.java
// javac ques15.java
// java ques15