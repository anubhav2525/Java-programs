class base
{
	public void output()
	{
		System.out.println("Hello from Base");
	}
}
class child extends base
{
	public void output()
	{
		System.out.println("Hello from Child");
	}
}
class call
{
	 public static void main(String []a)
	 {
			base b=new base();
			b.output();
			b=new child();
			b.output();
	}
}