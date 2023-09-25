import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class k extends JFrame implements ActionListener {
	JLabel lb1, lb2, lb3;
	JButton btn1;

	public k(String e, String f, String g) {
		Container c = this.getContentPane();
		c.setLayout(null);
		lb1 = new JLabel();
		lb1.setBounds(20, 20, 200, 20);
		lb1.setText("Your ID is :-" + e);

		lb2 = new JLabel();
		lb2.setBounds(20, 50, 200, 20);
		lb2.setText("Your ID is :-" + f);

		lb3 = new JLabel();
		lb3.setBounds(20, 80, 200, 20);
		lb3.setText("Address is :-" + g);

		btn1 = new JButton("Exit");
		btn1.setBounds(100, 110, 100, 20);
		btn1.addActionListener(this);

		c.add(lb1);
		c.add(lb2);
		c.add(lb3);
		c.add(btn1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			System.exit(0);
		}
	}

}