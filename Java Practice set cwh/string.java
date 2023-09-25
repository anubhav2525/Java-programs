import java.util.Scanner;
public class string {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Your Name Please !!");
        // String name=sc.nextLine();
        // System.out.println("Hello "+name+", have a good day.");
       
        // float a=7/4*9/2;
        // System.out.println(a);
      
        //  float a=(v*v-u*u)/295;

        System.out.println("Enter your website url");
        String name=sc.nextLine();
       // System.out.println(name.toLowerCase());
       //System.out.println(name.replace(" ","_"));
       if(name.endsWith(".com")){
        System.out.println("Commercial Site");
       }
       else if(name.endsWith(".org")){
        System.out.println("Organisation website");
       }
       else if(name.endsWith(".in")){
        System.out.println("Indian Site");
       }
       else{
        System.out.println("Other sites");
       }
    }
}
