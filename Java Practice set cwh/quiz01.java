import java.util.Scanner;
public class quiz01{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Quiz 01");
        int a,b,c;
        System.out.println("Enter first number ");
        a=sc.nextInt();
        System.out.println("Enter second number ");
        b=sc.nextInt();
        System.out.println("Enter third number ");
        c=sc.nextInt();
        System.out.printf("The sum of %d %d %d is %d",a,b,c,(a+b+c));
    }
}