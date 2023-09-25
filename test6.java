import javax.swing.*;
class test7
{
	public static void main(String []a)
	{
		int m=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		int n=m*m;
		JOptionPane.showMessageDialog(null,"Square "+n);
	}
}