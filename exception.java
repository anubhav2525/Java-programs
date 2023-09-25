class test
{
	public static void main(String []a)
	{
		int n[]={2,4};
		int m=4,k=0;
		try
		{
			k=m/k;
			k=n[1]/n[2];
		}
		catch(ArithmeticException e)
		{ 
			System.out.println("Divided by 0");
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("Out of bounds");
		}
		finally
		{
			System.out.println("Hello");
		}
	}
}
