import javax.swing.*;
class test7
{
	public static void main(String []a)
	{
		String str1=JOptionPane.showInputDialog("Enter a String");
		int k=str1.length();
		int j,i;
		for(i=0;i<k;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(str1.charAt(j));	
			}
			System.out.println();
		}
	}
}