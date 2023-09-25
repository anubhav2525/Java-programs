interface inter
{
	public abstract void input();
	public abstract void output();
}
class test 
{
	public void display()
	{
		System.out.println("Hello from base class");
	}
}
class mytest extends test implements inter
{
	private int x,y;
	public void input()
	{
		x=50;
		y=60;
	}
	public void output()
	{
		System.out.println("Sum="+(x+y));
	}
}
class call
{
	public static void main(String []a)
	{
		mytest t=new mytest();
		t.display();
		t.input();
		t.output();
	}
}