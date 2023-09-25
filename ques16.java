//    1
//   121
//  12321
// 1234321
//    4321
//     321
//      21
//       1

import javax.swing.*;
class ques16
{
	public static void main(String[] a)
	{
		int i,j,k,s;
		for(i=1;i<=4;i++)
		{
			for(s=4;s>i;s--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		for(i=4;i>=1;i--)
		{
			for(s=7;s>i;s--)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}


// ques16.java
// javac ques16.java
// java ques16