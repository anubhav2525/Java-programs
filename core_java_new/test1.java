import javax.swing.*;
class test
{
    public static void main(String []a)
    {
        String s=JOptionPane.showInputDialog("Enter the String");
        int l=s.length();
        JOptionPane.showMessageDialog(null,"Length = "+l);
    }
}