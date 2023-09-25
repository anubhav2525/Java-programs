class base
{
	protected int x,y;
	public base(int x)
	{
		this.x=x;
	}
}
class child extends base
{
	private int m,n,s;
	public child(int m,int n)
	{
		super(m);
		this.y=n;
		
	}
	public void output()
	{
		System.out.println("Sum="+(x+y));
	}
}
class mychild extends child
{
	private int z;
	public mychild(int m,int n,int s)
	{
		super(m,n);
		this.z=s;
	}
	public void display()
	{
		System.out.println("Sum="+(x+y+z));
	}	
}
class call
{
	public static void main(String []a)
	{
		child c=new child(8,9);
		c.output();	
		mychild d=new mychild(10,20,30);
		d.display();
	}
}