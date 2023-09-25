// class and object
import javax.swing.*;
class mybase
{
	private
			int x,y;
	public void input()
	{
		x=Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
		y=Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
	}
	public void output()
	{
		System.out.println("Sum="+(x+y));
	}
}

class callme
{
	public static void main(String []a)
	{
		mybase ob=new mybase();
		ob.input();
		ob.output();
	}
}