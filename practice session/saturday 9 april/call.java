package p1;
import p1.mychild;
import p1.mybase;
public class call extends mychild implements mybase
{
	public void input()
	{
		m=60;
		n=90;
	}
	public void output()
	{
		System.out.println("Sum="+(m+n));
	}
}