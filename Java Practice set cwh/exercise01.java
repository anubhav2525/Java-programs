import java.util.Scanner;
public class exercise01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Coa,cpp,cf,daa,ot;
        System.out.println("Enter the matks for COA out off 100");
        Coa=sc.nextInt();
       for(Coa++;Coa>=0 && Coa<=100;){
            System.out.println("Enter again Invalid marks");
            Coa=sc.nextInt();
        }
        System.out.println("Enter the matks for CPP out off 100");
        cpp=sc.nextInt();
        System.out.println("Enter the matks for CF out off 100");
        cf=sc.nextInt();
        System.out.println("Enter the matks for DAA out off 100");
        daa=sc.nextInt();
        System.out.println("Enter the matks for OT out off 100");
        ot=sc.nextInt();
        float percentage=((Coa+cf+daa+cpp+ot)/5);
        System.out.println("Percentage = "+percentage);
    }
}
