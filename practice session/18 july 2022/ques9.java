// Fibonacci series
 //   0 1 1 2 3 5 8 13 21 34
public class ques9 {
    public static void main(String []a)
    {
        int e=0,b=1,c,i;
        System.out.print(e);
        System.out.print(" "+b);
        i=1;
        while(i<=8)
        {
            c=e+b;
            System.out.print(" "+c);
            e=b;
            b=c;
            i++;
        }
    }
}
