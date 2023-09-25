import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class report extends JFrame {
	JLabel l1, l2, l3, l4;

	public report(int a, int r, int t, int s) {
		Container c = this.getContentPane();
		c.setLayout(null);
		l1 = new JLabel();
		l1.setBounds(10, 20, 120, 20);
		l1.setText("Amount:=" + a);
		l2 = new JLabel();
		l2.setBounds(10, 60, 120, 20);
		l2.setText("Rate:=" + r);
		l3 = new JLabel();
		l3.setBounds(10, 100, 120, 20);
		l3.setText("Time:=" + t);
		l4 = new JLabel();
		l4.setBounds(10, 140, 120, 20);
		l4.setText("Interest:=" + s);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);

	}

}