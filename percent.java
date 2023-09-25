public class percent
{
import java.util.Scanner;

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Physics Marks Here");
        int b1=sc.nextInt();
        System.out.println("Enter Your Mathemetics Marks Here");
        int b2=sc.nextInt();
        System.out.println("Enter Your Chemistry Marks Here");
        int b3=sc.nextInt();
        System.out.println("Enter Your Hindi Marks Here");
        int b4=sc.nextInt();
        System.out.println("Enter Your English Marks Here");
        int b5=sc.nextInt();
        int b6=b1+b2+b3+b4+b5;
        float total=b6/5;
        System.out.println("Your Total Percentage is : "+total);
    }
}{
}
