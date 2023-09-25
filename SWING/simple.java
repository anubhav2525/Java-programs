import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class simple extends JFrame implements ActionListener {
	JTextField t1, t2, t3, t4;
	JButton b1, b2;
	JLabel l1, l2, l3, l4;

	public simple() {
		Container c = this.getContentPane();
		c.setLayout(null);
		l1 = new JLabel("Amount");
		l1.setBounds(10, 20, 100, 20);
		l2 = new JLabel("Rate");
		l2.setBounds(10, 50, 100, 20);
		l3 = new JLabel("Time");
		l3.setBounds(10, 80, 100, 20);
		l4 = new JLabel("Simple Interest");
		l4.setBounds(10, 110, 100, 20);
		t1 = new JTextField();
		t1.setBounds(120, 20, 60, 20);
		t2 = new JTextField();
		t2.setBounds(120, 50, 60, 20);
		t3 = new JTextField();
		t3.setBounds(120, 80, 60, 20);
		t4 = new JTextField();
		t4.setBounds(120, 110, 60, 20);

		b1 = new JButton("Interest");
		b1.addActionListener(this);
		b1.setBounds(80, 150, 120, 20);
		b2 = new JButton("Menu");
		b2.addActionListener(this);
		b2.setBounds(210, 150, 120, 20);
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
			int x = Integer.parseInt(t1.getText());
			int y = Integer.parseInt(t2.getText());
			int z = Integer.parseInt(t3.getText());
			int a = ((x * y * z) / 100);
			t4.setText(String.valueOf(a));
			report ob = new report(x, y, z, a);
			ob.setSize(1000, 500);
			ob.setVisible(true);
			ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
		}
		if (e.getSource() == b2) {
			menuhw menu2 = new menuhw();
			menu2.setBounds(10, 10, 1000, 1000);
			menu2.setVisible(true);
			menu2.setDefaultCloseOperation(menu2.EXIT_ON_CLOSE);
		}

	}

	public static void main(String a[]) {
		simple ob = new simple();
		ob.setSize(1000, 500);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
	}
}
