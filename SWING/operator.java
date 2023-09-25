import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class operator extends JFrame implements ActionListener {
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3, t4;
	JButton b1, b2;

	public operator() {
		Container c = this.getContentPane();
		c.setLayout(null);

		l1 = new JLabel("Enter First Number");
		l1.setBounds(10, 20, 150, 20);
		t1 = new JTextField();
		t1.setBounds(170, 20, 100, 20);
		l2 = new JLabel("Enter Second Number");
		l2.setBounds(10, 50, 150, 20);
		t2 = new JTextField();
		t2.setBounds(170, 50, 100, 20);
		l3 = new JLabel("Enter the operator(+,-,*,/)");
		l3.setBounds(10, 80, 150, 20);
		t3 = new JTextField();
		t3.setBounds(170, 80, 100, 20);
		l4 = new JLabel("Result");
		l4.setBounds(10, 110, 150, 20);
		t4 = new JTextField();
		t4.setBounds(170, 110, 100, 20);
		b1 = new JButton("Click Here");
		b1.addActionListener(this);
		b1.setBounds(120, 140, 100, 20);
		b2 = new JButton("Menu");
		b2.addActionListener(this);
		b2.setBounds(230, 140, 100, 20);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(t1);
		c.add(t2);
		c.add(t3);
		c.add(t4);
		c.add(b1);
		c.add(b2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int c;
			double d;
			long f;
			String str = t3.getText();
			if (str.equals("+")) {
				c = a + b;
				t4.setText(String.valueOf(c));
			} else if (str.equals("-")) {
				c = a - b;
				t4.setText(String.valueOf(c));
			} else if (str.equals("/")) {
				d = a / b;
				t4.setText(String.valueOf(d));
			} else if (str.equals("*")) {
				f = a * b;
				t4.setText(String.valueOf(f));
			}
		}
		if (e.getSource() == b2) {
			menuhw menu2 = new menuhw();
			menu2.setBounds(10, 10, 1000, 1000);
			menu2.setVisible(true);
			menu2.setDefaultCloseOperation(menu2.EXIT_ON_CLOSE);
		}
	}

	public static void main(String[] a) {
		operator ob1 = new operator();
		ob1.setSize(1000, 500);
		ob1.setVisible(true);
		ob1.setDefaultCloseOperation(ob1.EXIT_ON_CLOSE);
	}
}