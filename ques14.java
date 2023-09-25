import javax.swing.*;
class ques14
{
	public static void main(String[] a)
	{
		int i,j,str;
		String str=JOptionPane.showInputDialog("Enter a string=");
		int l=str.length();
		for(i=0;i<l;i++)
		{
			for(s=0;s<i;s++)
			{
				System.out.print(" ");
			}
			for(j=i;j<l;j++)
			{
				char s1=s.charAt(j);
				System.out.print(s1);
			}
			System.out.println();
		}
 	}
}