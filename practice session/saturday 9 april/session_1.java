class mybase
{
	private int x,y;
	public void input()
	{
		x=40;
		y=50;
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
		mybase b=new mybase();
		b.input();
		b.output();
	}
}