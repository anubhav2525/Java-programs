import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class toolbar1 extends JFrame implements ActionListener
{
	String str;
	Container c;
	JToolBar tb;
	JRadioButton b1,b2;
	ButtonGroup bg;
	JLabel lb1;
	public toolbar1()
	{
		c=getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(Color.cyan);
		tb=new JToolBar();
		b1=new JRadioButton("Sum");
		b2=new JRadioButton("Product");
		bg=new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		tb.setBackground(Color.blue);
		tb.add(b1);
		tb.add(b2);
		lb1=new JLabel();
		lb1.setFont(new Font("SansSerif",Font.PLAIN,30));
		c.add("Center",lb1);
		c.add("North",tb);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			c.setBackground(Color.blue);
			int a,b,c1;
			a=Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
			b=Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
			JOptionPane.showMessageDialog(null,"Sum = "+(a+b));
		}
		if(ae.getSource()==b2)
		{
			int a,b;
			a=Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
			b=Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
			JOptionPane.showMessageDialog(null,"Product = "+(a*b));
		}
		
	}
	public static void main(String []a)
	{
		toolbar1 tbd=new toolbar1();
		tbd.setBounds(100,100,400,400);
		tbd.setVisible(true);
		tbd.setDefaultCloseOperation(tbd.EXIT_ON_CLOSE);
	}
}