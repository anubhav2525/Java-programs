import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class convertor extends JFrame implements ActionListener {
	JLabel l1, l2;
	JTextField t1, t2;
	JButton b1, b2, b3;

	public convertor() {
		Container c = this.getContentPane();
		c.setLayout(null);

		l1 = new JLabel("Enter the String");
		l1.setBounds(10, 20, 120, 20);
		t1 = new JTextField();
		t1.setBounds(140, 20, 100, 20);
		t1.setToolTipText("Input a value");
		l2 = new JLabel("Result");
		l2.setBounds(10, 50, 120, 20);
		t2 = new JTextField();
		t2.setBounds(140, 50, 100, 20);
		b1 = new JButton("Lower Case");
		b1.setBounds(100, 80, 120, 20);
		b1.addActionListener(this);
		b2 = new JButton("Upper Case");
		b2.setBounds(230, 80, 120, 20);
		b2.addActionListener(this);
		b3 = new JButton("Length");
		b3.setBounds(360, 80, 120, 20);
		b3.addActionListener(this);
		c.add(l1);
		c.add(l2);
		c.add(t1);
		c.add(t2);
		c.add(b1);
		c.add(b2);
		c.add(b3);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String str1 = t1.getText();
			String str2 = str1.toLowerCase();
			t2.setText(str2);
		} else if (e.getSource() == b2) {
			String str1 = t1.getText();
			String str2 = str1.toUpperCase();
			t2.setText(str2);
		} else if (e.getSource() == b3) {
			String str1 = t1.getText();
			int k = str1.length();
			t2.setText(String.valueOf(k));
		}

	}

	public static void main(String[] a) {
		convertor con = new convertor();
		con.setSize(1000, 500);
		con.setVisible(true);
		con.setDefaultCloseOperation(con.EXIT_ON_CLOSE);
	}
}
