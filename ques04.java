// Accept a number from user and find its factorial

import javax.swing.*;
class ques04
{
	public static void main(String[] a)
	{
		int i,f=1,x;
		x=Integer.parseInt(JOptionPane.showInputDialog("Enter a number="));
		for(i=x;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println("Factorial ="+f);
	}
}

// ques04.java
// javac ques04.java
//java ques04

