// Accept five numbers from user and find their sum

import javax.swing.*;
class ques05
{
	public static void main(String [] a)
	{
		int x,i,sum=0;
		System.out.println("Enter five numbers in the give below");
		for(i=1;i<=5;i++)
		{
			x=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			sum=sum+x;
		}
		System.out.println("Sum="+sum);
	}
}

//ques05.java
//javac ques05.java
//java ques