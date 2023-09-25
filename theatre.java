class mythread implements Runnable
{
	String str;
	mythread(String str)
	{
		this.str=str;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(str +"="+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class theatre
{
	public static void main(String []a)
	{
		mythread ob1=new mythread("Cut");
		mythread ob2=new mythread("Show");
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.start();
		t2.start();
	}
}