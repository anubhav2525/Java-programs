import java.util.*;
class factorial
{
    public static void main(String []a)
    {
        int n[]=new int[5];
        int i,j,fac;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number");
            n[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            fac=1;
            for(j=1;j<=n[i];j++)
            {
                fac=fac*j;
            }
        	   System.out.println("Factorial = "+fac);
		}
    }
}