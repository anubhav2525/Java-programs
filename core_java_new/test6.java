import javax.swing.*;
class test6
{
	public static void main(String []a)
	{
		String str1=JOptionPane.showInputDialog("Enter a String");
		int k=str1.length();
		int j,i;
		for(i=0;i<k;i++)
		{
			for(j=i;j<k;j++)
			{
				System.out.print(str1.charAt(j));	
			}
			System.out.println();
		}
	}
}