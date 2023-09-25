import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class student extends JFrame implements ActionListener {
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2;
	JLabel l1, l2, l3, l4, l5;

	public student() {
		Container c = this.getContentPane();
		c.setLayout(null);
		l1 = new JLabel("Student ID");
		l1.setBounds(10, 20, 120, 30);
		t1 = new JTextField();
		t1.setBounds(140, 20, 100, 30);

		l2 = new JLabel("Name");
		l2.setBounds(10, 60, 120, 30);
		t2 = new JTextField();
		t2.setBounds(140, 50, 60, 30);

		l3 = new JLabel("Fee");
		l3.setBounds(10, 80, 120, 30);
		t3 = new JTextField();
		t3.setBounds(140, 80, 60, 30);

		l4 = new JLabel("Discount");
		l4.setBounds(10, 120, 120, 30);
		t4 = new JTextField();
		t4.setBounds(140, 120, 60, 30);

		l5 = new JLabel("New Fee");
		l5.setBounds(10, 160, 120, 30);
		t5 = new JTextField();
		t5.setBounds(140, 160, 60, 30);

		b1 = new JButton("Calculate");
		b1.addActionListener(this);
		b1.setBounds(100, 220, 100, 40);
		b2 = new JButton("Cancel");
		b2.addActionListener(this);
		b2.setBounds(220, 220, 100, 40);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(t1);
		c.add(t2);
		c.add(t3);
		c.add(t4);
		c.add(t5);
		c.add(b1);
		c.add(b2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String str1 = t1.getText();
			String str2 = t2.getText();
			int x = Integer.parseInt(t3.getText());
			int y = Integer.parseInt(t4.getText());
			int dis = (x - ((x * y) / 100));
			t5.setText(String.valueOf(dis));
		} else if (e.getSource() == b2) {
			System.exit(0);
		}

	}

	public static void main(String a[]) {
		student ob = new student();
		ob.setSize(1000, 500);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
	}
}
