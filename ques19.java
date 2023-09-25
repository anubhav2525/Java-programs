//    4
//   43
//  432
// 4321

import javax.swing.*;
class ques19
{
	public static void main(String[] a)
	{
		int i,j,s;
		for(i=4;i>=1;i--)
		{
			for(s=1;s<i;s++)
				System.out.print(" ");
			for(j=4;j>=i;j--)
				System.out.print(j);
			System.out.println();
		}
	}
}

