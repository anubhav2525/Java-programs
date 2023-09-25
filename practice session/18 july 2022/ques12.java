
//accept base and power from user and find the result to its base. 
import java.util.*;
public class ques12 {
    public static void main(String []a)
    {
        int i,j,n,po=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base Number");
        n=sc.nextInt();
        System.out.println("Enter the Power Number");
        j=sc.nextInt();
        for(i=0;i<=j-1;i++)
        {
            po=po*n;
        }
        System.out.println("Result = "+po);
    }
}
