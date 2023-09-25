//     1
//    121
//   12321
//  1234321

import javax.swing.*;
class ques18
{
	public static void main(String[] a)
	{
		int i,j,s,k;
		for(i=1;i<=4;i++)
		{
			for(s=4;s>i;s--)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(j);
			for(k=i-1;k>=1;k--)
				System.out.print(k);
			System.out.println();
		}
	}
}