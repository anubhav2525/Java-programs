import java.util.*;
public class Array02 {
    public static void main(String []a)
    {
        int n[]=new int[5];
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number");
            n[i]=sc.nextInt();

        }
        for(i=0;i<5;i++)
        {
            if(n[i]%2==0)
            {
                sum=sum+n[i];
            }
        }
        System.out.println("Sum = "+sum);
    }

}
