import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class login extends JFrame implements ActionListener {
	JTextField t1, t2;
	JButton b1, b2;
	JLabel l1, l2;

	public login() {
		Container c = this.getContentPane();
		c.setLayout(null);
		l1 = new JLabel("Login ID");
		l1.setBounds(10, 20, 150, 20);
		t1 = new JTextField();
		t1.setBounds(170, 20, 150, 20);
		l2 = new JLabel("Login Password");
		l2.setBounds(10, 50, 150, 20);
		t2 = new JTextField();
		t2.setBounds(170, 50, 150, 20);
		b1 = new JButton("Login");
		b1.addActionListener(this);
		b1.setBounds(80, 90, 90, 20);
		b2 = new JButton("Cancel");
		b2.addActionListener(this);
		b2.setBounds(190, 90, 90, 20);
		c.add(l1);
		c.add(l2);
		c.add(t1);
		c.add(t2);
		c.add(b1);
		c.add(b2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String id = t1.getText();
			String pwd = t2.getText();
			if (id.equalsIgnoreCase("get")) {
				if (pwd.equalsIgnoreCase("project")) {
					JOptionPane.showMessageDialog(null, "You are logged");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong Password ");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Wrong ID ");
			}

		} else if (e.getSource() == b2) {
			System.exit(0);
		}
	}

	public static void main(String a[]) {
		login ob = new login();
		ob.setSize(1000, 500);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
	}
}
