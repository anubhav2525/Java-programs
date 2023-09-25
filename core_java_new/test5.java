import javax.swing.*;
class test5
{
	public static void main(String []a)
	{
		String str1=JOptionPane.showInputDialog("Enter a String");
		int l=str1.length();
		int i;
		for(i=0;i<l;i++)
		{
			System.out.println(str1.charAt(i));
		}
	}
}
	