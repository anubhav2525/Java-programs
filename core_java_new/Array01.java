import java.util.*;
class mytest
{
    public static void main(String []a)
    {
        int n[]=new int[5];
        int i;
        Scanner s=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("enter a number");
            n[i]=s.nextInt();
        }
        for(i=0;i<5;i++)
        {
            System.out.println(n[i]);
        }
    }
}