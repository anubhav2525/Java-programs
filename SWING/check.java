import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class check extends JFrame implements ActionListener {
	JCheckBox c1, c2;

	public check() {
		Container c = this.getContentPane();
		c.setLayout(null);

		c1 = new JCheckBox("Apple");
		c1.setBounds(20, 20, 150, 20);
		c1.addActionListener(this);
		c.add(c1);

		c2 = new JCheckBox("Orange");
		c2.setBounds(180, 20, 150, 20);
		c2.addActionListener(this);
		c.add(c2);
	}

	public void actionPerformed(ActionEvent e) {
		String s = "";
		if (e.getSource() == c1)
			s = "Apple";
		if (e.getSource() == c2)
			s = "Orange";
		JOptionPane.showMessageDialog(null, "You selected= " + s);
	}

	public static void main(String[] a) {
		check c = new check();
		c.setSize(1000, 500);
		c.setVisible(true);
		c.setDefaultCloseOperation(c.EXIT_ON_CLOSE);
	}
}
