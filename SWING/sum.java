import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sum extends JFrame implements ActionListener {
	JButton btn1;
	JTextField t1, t2, t3;
	JLabel l1, l2, l3;

	public sum() {
		Container c = this.getContentPane();
		c.setLayout(null);
		l1 = new JLabel("Enter first number");
		l1.setBounds(10, 20, 100, 20);
		t1 = new JTextField();
		t1.setBounds(120, 20, 100, 20);
		l2 = new JLabel("Enter second number");
		l2.setBounds(10, 50, 100, 20);
		t2 = new JTextField();
		t2.setBounds(120, 50, 100, 20);
		l3 = new JLabel("Result");
		l3.setBounds(10, 80, 100, 20);
		t3 = new JTextField();
		t3.setBounds(120, 80, 100, 20);
		btn1 = new JButton("Sum");
		btn1.setBounds(80, 110, 100, 20);
		btn1.addActionListener(this);
		c.add(l1);
		c.add(l2);
		c.add(l3);

		c.add(t1);
		c.add(t2);
		c.add(t3);
		c.add(btn1);
	}

public void actionPerformed(ActionEvent e)
{
	if (e.getSource() == btn1) {
		int x = Integer.parseInt(t1.getText());
		int y = Integer.parseInt(t2.getText());
		int res=x+y;
		t3.setText(String.valueOf(res));
	}
}

	public static void main(String[] a) {
		sum s = new sum();
		s.setSize(1000, 500);
		s.setVisible(true);
		s.setDefaultCloseOperation(s.EXIT_ON_CLOSE);
	}
}