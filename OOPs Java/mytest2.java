import javax.swing.*;
class mytest
{
	private
				int x,y;
	public mytest()
				{
					x=10;
					y=20;
				}
	public mytest(int x,int y)
				{
					this.x=x;
					this.y=y;
				}
	public mytest(mytest ob1,mytest ob2)
				{
					this.x=ob1.x+ob2.x;
					this.y=ob1.y+ob2.y;
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
		mytest ob1=new mytest();
		ob1.output();
		mytest ob2=new mytest(40,50);
		ob2.output();
		mytest ob3=new mytest(ob1,ob2);
		ob3.output();
	}
}




