import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mytest extends JFrame implements ActionListener {
	JButton btn;
	JTextField t1, t2;
	int x, y;

	public mytest() {
		Container c = this.getContentPane();
		c.setLayout(null);
		t1 = new JTextField();
		t1.setBounds(10, 20, 40, 30);
		t2 = new JTextField();
		t2.setBounds(60, 20, 40, 30);
		btn = new JButton("Square");
		btn.setBounds(60, 55, 80, 50);
		btn.addActionListener(this);
		c.add(btn);
		c.add(t1);
		c.add(t2);
	}// End of constructor here

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btn) {
			x = Integer.parseInt(t1.getText());
			y = x * x;
			t2.setText(String.valueOf(y));
		}
	}
}// End of class

class test {
	public static void main(String[] a) {
		mytest t = new mytest();
		t.setVisible(true);
		t.setBounds(10, 20, 1000, 1000);
		t.setTitle("TextBox");
	}
}