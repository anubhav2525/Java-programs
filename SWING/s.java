import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class s extends JFrame implements ActionListener {
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1;

	public s() {
		Container c = this.getContentPane();
		c.setLayout(null);
		l1 = new JLabel("Enter the ID");
		l1.setBounds(20, 30, 100, 20);
		t1 = new JTextField();
		t1.setBounds(130, 30, 100, 20);
		c.add(l1);
		c.add(t1);

		l2 = new JLabel("Name");
		l2.setBounds(20, 60, 100, 20);
		t2 = new JTextField();
		t2.setBounds(130, 60, 100, 20);
		c.add(l2);
		c.add(t2);

		l3 = new JLabel("Address");
		l3.setBounds(20, 90, 100, 20);
		t3 = new JTextField();
		t3.setBounds(130, 90, 100, 20);
		c.add(l3);
		c.add(t3);

		b1 = new JButton("Report");
		b1.addActionListener(this);
		b1.setBounds(80, 190, 100, 20);
		c.add(b1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String a = t1.getText();
			String b = t2.getText();
			String c = t3.getText();
			k ob1 = new k(a, b, c);
			ob1.setSize(1000, 500);
			ob1.setVisible(true);
			ob1.setDefaultCloseOperation(ob1.EXIT_ON_CLOSE);
		}
	}

	public static void main(String[] a) {
		s ob = new s();
		ob.setSize(1000, 500);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
	}
}
