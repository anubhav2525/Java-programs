import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class mytest1 extends JFrame implements ActionListener {
	JTextField t1;
	JButton b1, b2;

	public mytest1() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());

		t1 = new JTextField();
		t1.setColumns(20);
		b1 = new JButton("Square");
		b1.addActionListener(this);
		b2 = new JButton("Cube");
		b2.addActionListener(this);
		c.add(t1);
		c.add(b1);
		c.add(b2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int x = Integer.parseInt(t1.getText());
			int y = x * x;
			t1.setText(String.valueOf(y));
		}
		if (e.getSource() == b2) {
			int x = Integer.parseInt(t1.getText());
			int y = x * x * x;
			t1.setText(String.valueOf(y));
		}
	}

	public static void main(String a[]) {
		mytest1 ob = new mytest1();
		ob.setSize(1000, 500);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
	}
}