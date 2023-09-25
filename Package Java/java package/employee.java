package mypack;
import javax.swing.*;
public class employee 
{
	
	String ename, eid;
	public employee()
	{	
		eid=JOptionPane.showInputDialog("Enter Employee ID=");
		ename=JOptionPane.showInputDialog("Enter Employee Name=");
	}
	public void output()
	{
		System.out.println("Employee Id = "+eid);
		System.out.println("Employee Name = "+ename);
	}
}

 