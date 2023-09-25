import javax.swing.*;
class test4
{
	public static void main(String [] a)
	{
		int i,j,k;
		String s=JOptionPane.showInputDialog("Enter a string");
		int l=s.length();
		for(i=0;i<l;i++)
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
		
		