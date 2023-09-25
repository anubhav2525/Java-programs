// 12345
// 23451
// 34512
// 45123
// 51234

import javax.swing.*;
class ques11
{
	public static void main(String[] a)
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			for(k=1;k<i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}


//ques11.java
//javac ques11.java
//java ques11