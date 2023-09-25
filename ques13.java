import javax.swing.*;
class ques13
{
	public static void main(String[] a)
	{
		int i,j,x;
		String s=JOptionPane.showInputDialog("Enter a string=");
		int l=s.length();
		x=l;
		for(i=0;i<=x;i++)
		{
			for(j=0;j<=i;j++)
			{
				char s1=s.charAt(j);
				System.out.print(s1);
			}
			System.out.println();
		}
 	}
}