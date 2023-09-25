//Accept five number from user and find th greatest 

// import java.util.*;
// public class Array04hw {
//     public static void main(String []a)
//     {
//         int n[]=new int[5];
//         int i,g=0;
//         Scanner sc=new Scanner(System.in);
//         for(i=0;i<5;i++)
//         {
//             System.out.println("Enter a number");
//             n[i]=sc.nextInt();
//         }
//         for(i=0;i<5;i++)
//         {
//             if(i==0)
//             {
//                 g=n[i];
//             }
//             else if(n[i]>g)
//             {
//                 g=n[i];
//             }
//         }
//         System.out.println("Greatesst Number = "+g);
//     }
// }

//Accept five number from user and find th total count of even

// import java.util.*;
// class main{
//     public static void main(String []a)
//     {
//         int n[]=new int[5];
//         int i,g,even=0;
//         Scanner sc=new Scanner(System.in);
//         for(i=0;i<5;i++)
//         {
//             System.out.println("Enter a Number");
//             n[i]=sc.nextInt();
//         }
//         for(i=0;i<5;i++)
//         {
//             if(n[i]%2==0)
//             {
//                 even++;
//             }
//         }
//         System.out.println("Total Count of Even = "+even);
//     }
// }

//Accept five number from user and find sum of the even

// import java.util.*;
// class main
// {
//     public static void main(String []a)
//     {
//         int n[]=new int[5];
//         int i,sum=0;
//         Scanner sc=new Scanner(System.in);
//         for(i=0;i<5;i++)
//         {
//             System.out.println("Enter a Number");
//             n[i]=sc.nextInt();
//         }
//         for(i=0;i<5;i++)
//         {
//             if(n[i]%2==0)
//             {
//                 sum=sum+n[i];
//             }
//         }
//         System.out.println("Sum of Even = "+sum);
//     }
// }

//Accept five number from user and find the lowest number

// import java.util.*;
// class main
// {
//     public static void main(String []a)
//     {
//         int n[]=new int[5];
//         int i,low=0;
//         Scanner sc=new Scanner(System.in);
//         for(i=0;i<5;i++)
//         {
//             System.out.println("Enter a Number");
//             n[i]=sc.nextInt();
//         }
//         for(i=0;i<5;i++)
//         {
//             if(i==0)
//             {
//                 low=n[i];
//             }
//             else if(n[i]<low)
//             {
//                 low=n[i];
//             }
//         }
//         System.out.println("Lowest Number = "+low);
//     }
// }

//Accept five number from user and find the Factorial of each number

// import java.util.*;
// class main
// {
//     public static void main(String []a)
//     {
//         int n[]=new int[5];
//         int i,j,fac;
//         Scanner sc=new Scanner(System.in);
//         for(i=0;i<5;i++)
//         {
//             System.out.println("Enter a number");
//             n[i]=sc.nextInt();
//         }
//         for(i=0;i<5;i++)
//         {
//             fac=1;
//             for(j=1;j<=n[i];j++)
//             {
//                 fac=fac*j;
//             }
//         	   System.out.println("Factorial = "+fac);
// 		}
//     }
// }

//Accept a string from command line and find the length of each string

// class main
//  {
//     public static void main(String []a)
//     {
//         int i;
//         for(i=0;i<a.length;i++)
//         {
//            System.out.println("Length of "+a[i]+" is "+a[i].length());
//         }
//     }
// }

//Accept a strings from command line and convert all the strings into uppercase
// class main
//  {
//     public static void main(String []a)
//     {
//         int i;
//         for(i=0;i<a.length;i++)
//         {
//            System.out.println("Length of "+a[i]+" is "+a[i].toUpperCase());
//         }
//     }
// }

//Accept numbers from command line and find the sum of all numbers

// class main
// {
//     public static void main(String []a)
//     {
//         int i,s=0;
//         for(i=0;i<a.length;i++)
//         {
//             s=s+Integer.parseInt(a[i]);
//         }
//         System.out.println("Sum = "+s);
//     }
// }

// Accept numbers from command line and find the sum of even number
// Accept only two numbers from command line and find the greatest number



// Accept  numbers in 3x3 array and display the number
// import java.util.*;
// class mytest{
//     public static void main(String []a)
//     {
//         int [][]n=new int[3][3];
//         int r,c;
//         Scanner s=new Scanner(System.in);
//         for(r=0;r<3;r++)
//         {
//             for(c=0;c<3;c++)
//             {
//                 System.out.println("ENter a number = ");
//                 n[r][c]=s.nextInt();
//             }
//         }
//         for(r=0;r<3;r++)
//         {
//             for(c=0;c<3;c++)
//             {
//                 System.out.print(n[r][c]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Accept a number in 3x3 array adn find the row wise summation
// import java.util.*;
// class mytest{
//     public static void main(String []a)
//     {
//         int [][]n=new int[3][4];
//         int r,c,sum=0;
//         Scanner s=new Scanner(System.in);
//         for(r=0;r<3;r++)
//         {
//             sum=0;
//             for(c=0;c<3;c++)
//             {
//                 System.out.println("Enter a number = ");
//                 n[r][c]=s.nextInt();
//                 sum=sum+n[r][c];
//             }
//             n[r][c]=sum;
//         }
//         for(r=0;r<3;r++)
//         {
//             for(c=0;c<=3;c++)
//             {
//                 System.out.print(n[r][c]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//
// import java.util.*;
// class mytest{
//     public static void main(String []a)
//     {
//         int [][]n=new int[4][3];
//         int r,c,sum=0;
//         Scanner s=new Scanner(System.in);
//         for(r=0;r<3;r++)
//         {
//             for(c=0;c<3;c++)
//             {
//                 System.out.println("Enter a number = ");
//                 n[r][c]=s.nextInt();
//             }
//         }
//         for(c=0;c<3;c++)
//         {
//             sum=0;
//             for(r=0;r<3;r++)
//             {
//                 sum=sum+n[r][c];
//             }
//             n[r][c]=sum;
//         }
//         for(r=0;r<=3;r++)
//         {
//             for(c=0;c<3;c++)
//             {
//                 System.out.print(n[r][c]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Accept a numbers from command line and find their sum

// class main{
//     public static void main(String []a)
//     {
//         int s=0;
//         for(String k:a)
//         {
//             s=s+Integer.parseInt(k);
//         }
//         System.out.println("SUm = "+s);
//     }
// }

// Accept Strings from command line and convert into upper case 
 
class main
{
    public static void main(String []a)
    {
        String s;
        for(String k:a)
        {
            System.out.println(" Uppercase = "+k.toUpperCase());
        }
    }
}