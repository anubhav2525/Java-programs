// Accept five numbers from user and find the total count of even number

import javax.swing.*;
class ques07
{
	public static void main(String [] a)
	{
		int x,i,g=0;
		System.out.println("Enter five numbers in the give below");
		for(i=1;i<=5;i++)
		{
			x=Integer.parseInt(JOptionPane.showInputDialog("Enter a number="));
			if(x%2==0)
				g++;

		}
		System.out.println("Total Even number ="+g);
	}
}

//ques07.java
//javac ques07.java
//java ques07