/*
   1
  21
 321
4321
 class Loop
{
    public static void main(String [] args)
    {
        int i,j,s;
        for(i=1;i<=4;i++)
        {
            for(s=4;s>i;s--)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
*/

class loop
{
    public static void main(String[] agrs)
    {
        int i,j,s,k,m,n=4,sp,a;
        for(i=1;i<=4;i++)
        {
            for(s=4;s>i;s--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(k=i-1;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for(m=1;m<=4;m++)
        {
            for(sp=1;sp>=4;sp++)
            {
                System.out.print(" ");
            }
            for(a=4;a>n;n--)
            {
                System.out.print(" ");
            }
            for(n=4;n>=1;n--)
            {
                System.out.print(n);

            }
            System.out.println();
        }
//        n=4;
//        for(sp=1;sp>n;sp++)
//        {
//            System.out.print();
//        }
//        for(n=4;n>1;n--)
//        {
//            System.out.print(n);
//        }
//        System.out.println();
    }
}