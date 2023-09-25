import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class season extends JFrame implements ActionListener {
	JTextField t1, t2;
	JButton b1;
	JLabel lb1, lb2;

	public season() {
		Container c = this.getContentPane();
		c.setLayout(null);

		lb1 = new JLabel("Enter the Month Number ");
		lb1.setBounds(20, 20, 150, 20);
		t1 = new JTextField();
		t1.setBounds(180, 20, 100, 20);
		c.add(lb1);
		c.add(t1);

		lb2 = new JLabel("Season");
		lb2.setBounds(20, 50, 150, 20);
		t2 = new JTextField();
		t2.setBounds(180, 50, 150, 20);
		c.add(lb2);
		c.add(t2);

		b1 = new JButton("Click Here");
		b1.setBounds(120, 90, 100, 20);
		b1.addActionListener(this);
		c.add(b1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int a = Integer.parseInt(t1.getText());
			switch (a) {
				case 1:
				case 2:
				case 11:
				case 12:
					t2.setText("Winter Season");
					break;

				case 3:
				case 4:
				case 5:
				case 6:
					t2.setText("Summer Season");
					break;

				case 7:
				case 8:
				case 9:
				case 10:
					t2.setText("Rainy Season");
					break;
			}
		}
	}

	public static void main(String[] a) {
		season s1 = new season();
		s1.setSize(1000, 500);
		s1.setVisible(true);
		s1.setDefaultCloseOperation(s1.EXIT_ON_CLOSE);
	}
}