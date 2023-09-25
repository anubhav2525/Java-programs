import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class label extends JFrame implements ActionListener {
	JTextField t1, t2;
	JButton b1;
	JLabel l1, l2;

	public label() {
		Container c = this.getContentPane();
		c.setLayout(null);
		l1 = new JLabel("Enter a number");
		l1.setBounds(10, 20, 100, 20);
		l2 = new JLabel("Result");
		l2.setBounds(10, 50, 100, 20);
		t1 = new JTextField();
		t1.setBounds(120, 20, 100, 20);
		t2 = new JTextField();
		t2.setBounds(120, 50, 100, 20);
		b1 = new JButton("Square");
		b1.addActionListener(this);
		b1.setBounds(120, 80, 100, 20);
		c.add(l1);
		c.add(l2);
		c.add(t1);
		c.add(t2);
		c.add(b1);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int x = Integer.parseInt(t1.getText());
			int y = x * x;
			t2.setText(String.valueOf(y));
		}

	}

	public static void main(String a[]) {
		label ob = new label();
		ob.setSize(1000, 500);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
	}
}
