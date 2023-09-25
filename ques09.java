//Accept five number from user and find total count of prime number
import javax.swing.*;
class ques09
{
	public static void main(String [] a)
	{
		int i,j,x,f,count=0;
		for(i=0;i<5;i++)
		{
			x=Integer.parseInt(JOptionPane.showInputDialog("Enter a number="));
			f=0;
			for(j=1;j<=x;j++)
			{
				if(x%j==0)
					f++;
			}
			if(f==2)
				count++;
		}
		System.out.println("Total prime number="+count);
	}
}

//ques09.java
//javac ques09.java
//java ques09