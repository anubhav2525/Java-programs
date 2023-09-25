/*Accept five numbers from user and find the greates number*/

import javax.swing.*;
class ques06
{
	public static void main(String [] a)
	{
		int x,i,g=0;
		System.out.println("Enter five numbers in the give below");
		for(i=1;i<=5;i++)
		{
			x=Integer.parseInt(JOptionPane.showInputDialog("Enter a number="));
			if(i==1)
				g=x;
			if(x>g)
				g=x;
		}
		System.out.println("Greater number ="+g);
	}
}

//ques06.java
//javac ques06.java
//java ques06