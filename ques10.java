// Accept five no. from user and find the sum of prime number
import javax.swing.*;
class ques10
{
	public static void main(String[] a)
	{
		int i,j,x,p,s=0;
		for(i=1;i<=5;i++)
		{
			x=Integer.parseInt(JOptionPane.showInputDialog("Enter a number="));
			p=0;
			for(j=1;j<=x;j++)
			{
				if(x%j==0)
					p++;
			}
			if(p==2)
				s=s+j;
		}
		System.out.println("Sum of prime numbers="+s);
	}
}			
