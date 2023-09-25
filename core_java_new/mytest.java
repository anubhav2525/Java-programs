import java.util.*;
class mytest{
    public static void main(String []a)
    {
        int [][]n=new int[3][3];
        int r,c;
				Scanner s=new Scanner(System.in);
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.println("ENter a number = ");
                n[r][c]=s.nextInt();
            }
        }
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(n[r][c]+" ");
            }
            System.out.println();
        }
    }
}