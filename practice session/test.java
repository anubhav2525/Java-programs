			// Java Garbage Collection
import javax.swing.*;
public class test
{
	public void finalize()
	{
		System.out.println("Object is garbage collected");
	}
	public static void main(String []a)
	{
		test t=new test();
		test p=new test();
		p=null;
		t=null;
		System.gc();
	}
}