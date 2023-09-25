//     1
//    21
//   321
//  4321

//import javax.swing.*;
class ques17
{
	public static void main(String[] a)
	{
		int i,j,s;
		for(i=1;i<=4;i++)
		{
			for(s=4;s>i;s--)
				System.out.print(" ");
			for(j=i;j>=1;j--)
				System.out.print(j);
			System.out.println();
		}		
	}
}
