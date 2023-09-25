// Accept two number from user and find their sum

import javax.swing.*;
class ques01
{
	public static void main(String[] a)
	{
		int x,y,z;
		x=Integer.parseInt(JOptionPane.showInputDialog("Enter first number="));
		y=Integer.parseInt(JOptionPane.showInputDialog("Enter second number="));
		z=x+y;
		System.out.println(z);
	}
}




//javac ques01.java
//java ques01