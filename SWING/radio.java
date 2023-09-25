import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radio extends JFrame implements ActionListener {
	JRadioButton r1, r2;
	ButtonGroup bg;

	public radio() {
		Container c = this.getContentPane();
		c.setLayout(null);

		r1 = new JRadioButton("Male");
		r1.setBounds(20, 20, 150, 20);
		r1.addActionListener(this);

		r2 = new JRadioButton("Female");
		r2.setBounds(180, 20, 150, 20);
		r2.addActionListener(this);

		c.add(r1);
		c.add(r2);

		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

	}

	public void actionPerformed(ActionEvent e) {
		String s = "";
		if (e.getSource() == r1)
			s = "Male";
		if (e.getSource() == r2)
			s = "Female";
		JOptionPane.showMessageDialog(null, "You selected= " + s);
	}

	public static void main(String[] a) {
		radio r = new radio();
		r.setSize(1000, 500);
		r.setVisible(true);
		r.setDefaultCloseOperation(r.EXIT_ON_CLOSE);
	}
}
