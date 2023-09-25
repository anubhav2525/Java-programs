import javax.swing.*;
class ques37
{
	public static void main(String []a)
	{
		private 
						int x,y;
		public void input(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		public void output()
		{
			System.out.println("Address of current object="+this);
			System.out.println("Sum = "+(x+y));
		}
}
class callme
{
	int m,n;
	m=Integer.parseInt(JOptionPane.showInputDialog("Enter first number="));
	n=Integer.parseInt(JOptionPane.showInputDialog("Enter second number="));
	ques37 ob1,ob2;
	ob1.input(m,n);
	ob1.output();
	System.out.println("Address of Object ob1="+ob1);
	ob2.input(++m,++n);
	ob2.output();
	System.out.println("Address of object ob2="+ob2);
}