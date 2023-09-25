import javax.swing.*;
class strcmp
{
	public static void main(String [] a)
	{
		String str1=JOptionPane.showInputDialog("First String");
		String str2=JOptionPane.showInputDialog("second String");
		
		if(str1.equals(str2))
			JOptionPane.showMessageDialog(null,"Equals");
		else
			JOptionPane.showMessageDialog(null," Not Equals");
	}
}