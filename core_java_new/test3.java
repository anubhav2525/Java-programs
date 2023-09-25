import javax.swing.*;
class strcmp
{
    public static void main(String []a)
    {
        String str1=JOptionPane.showInputDialog("Enter first String");
        String str2=JOptionPane.showInputDialog("Enter Second String");
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
}