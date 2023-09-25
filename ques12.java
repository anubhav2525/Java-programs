//     1
//    01
//   101
//  0101
// 10101

import javax.swing.*;
class ques12
{
	public static void main(String[] a)
	{
		int i,j,s;
		for(i=1;i<=5;i++)
		{
			for(s=5;s>i;s--)
			{	
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				if(j%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}
}

//ques12.java
//javac ques12.java
// java ques12