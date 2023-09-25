import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test extends JFrame implements ActionListener
{
	private JButton b;
	public test()
	{
		Container c=this.getContentPane();
		c.setLayout(null);
		b=new JButton("Click on me");
		b.setBounds(40,40,100,50);
		b.addActionListener(this);
		c.add(b);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			JOptionPane.showMessageDialog(null,"Hello");
		}
	}
}
class call
{
	public static void main(String []a)
	{
		test t=new test();
		t.setBounds(10,10,700,800);
		t.setVisible(true);
		t.setTitle("My First Swing Program");
	}
}
		