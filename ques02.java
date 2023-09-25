//Accept two number from user and find the greatest number

import javax.swing.*;
class ques02
{
	public static void main(String[] a)
	{
		int b,c;
		b=Integer.parseInt(JOptionPane.showInputDialog("Enter first number="));
		c=Integer.parseInt(JOptionPane.showInputDialog("Enter second number="));
		if(b>c)
		{
			System.out.println("First number is greater ="+b);
		}
		else
		{
			System.out.println("Second number is greater ="+c);
		}
	}
}

//ques02.java
//javac ques02.java
//java ques02