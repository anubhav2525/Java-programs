import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class product extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4;
	JRadioButton r1,r2;
	JButton b1,b2;
	ButtonGroup bg;
	double cost=0.0,ncost=0.0;
	public product()
	{
		Container c=this.getContentPane();
		c.setLayout(null);
	
		l1=new JLabel("Product ID");
		l1.setBounds(10,20,100,20);
		t1=new JTextField();
		t1.setBounds(120,20,100,20);
		l2=new JLabel("Product Name");
		l2.setBounds(10,50,100,20);
		t2=new JTextField();
		t2.setBounds(120,50,100,20);
		l3=new JLabel("Product Cost");
		l3.setBounds(10,80,100,20);
		t3=new JTextField();
		t3.setBounds(120,80,100,20);
		l4=new JLabel("Discount");
		l4.setBounds(10,110,100,20);
		r1=new JRadioButton("5%");
		r1.setBounds(120,110,50,20);
		r1.addActionListener(this);
		r2=new JRadioButton("10%");
		r2.setBounds(180,110,50,20);
		r2.addActionListener(this);
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		l5=new JLabel("Selling Cost");
		l5.setBounds(10,140,100,20);
		t4=new JTextField();
		t4.setBounds(120,140,100,20);
		c.add(l1);
		c.add(l2);
		c.add(l3);	
		c.add(l4);
		c.add(t1);	
		c.add(t2);
		c.add(t3);
		c.add(t4);
		c.add(l5);
		c.add(r1);
		c.add(r2);
		b1=new JButton("Calculate");
		b1.addActionListener(this);
		b1.setBounds(120,180,150,20);
		b2=new JButton("Exit");
		b2.addActionListener(this);
		b2.setBounds(280,180,100,20);
		c.add(b1);
		c.add(b2);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=t1.getText().toLowerCase();
		
		if(str.equals("p001"))
		{
			t2.setText("Lux");
			t3.setText("50");
			cost=50;
		}
		else if(str.equals("p002"))
		{
			t2.setText("Margo");
			t3.setText("60");
			cost=60;
		}
		if(e.getSource()==r1)
		{
			ncost=(cost-(cost*0.05));
			System.out.println(ncost);
		}
		else if(e.getSource()==r2)
		{
			ncost=(cost-(cost*0.10));
		}
		if(e.getSource()==b1)
		{
			t4.setText(String.valueOf(ncost));
		}
		if(e.getSource()==b2)
		{
			System.exit(0);
		}


	}
	
	public static void main(String []a)
	{
		product p=new product();
		p.setSize(1000,500);
		p.setVisible(true);
		p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
	}
}







