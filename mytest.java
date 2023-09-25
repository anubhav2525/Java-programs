class test 
{
	public static void main(String [] a)
	{
		int i,n,s=0;
		for(i=0;i<a.length;i++)
      {
			n=Integer.parseInt(a[i]);
			s=s+n;
		}
		System.out.println("Sum="+s);
	}
}