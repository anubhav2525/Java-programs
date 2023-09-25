package mypack;
import mypack.employee;
import javax.swing.*;
public class emp_sal extends employee
{
	protected int bs;
	public emp_sal()
  {
	super();
	bs=Integer.parseInt(JOptionPane.showInputDialog("Enter Basic Salary = "));
  }
	public void display()
  {
     System.out.println("Your Basic Salary = "+bs);
  }
}
	