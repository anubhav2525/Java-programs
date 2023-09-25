import javax.swing.*;
class test2
{
	public static void main(String []a)
	{
		String s=JOptionPane.showInputDialog("Enter a string");
		String k=s.toLowerCase();
		System.out.println("Lower Case = "+k);
		k=s.toUpperCase();
		System.out.println("Upper Case = "+k);
	}
}
		