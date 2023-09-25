class mytest
{
	private int x,y;
	public void output()
	{
		System.out.println("Sum="+(x+y));
	}
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
}
class callme
{
	public static void main(String []a)
	{
		mytest ob=new mytest();
		ob.output();
		mytest b=new mytest(80,70);
		b.output();
	}
}