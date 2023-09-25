import java.io.*;
class mycall
{
	public static void main(String []a) throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		int x,y;
		System.out.println("Enter a number=");
		x=Integer.parseInt(b.readLine());
		y=x*x; 
		System.out.println("Square="+y);
	}
}