import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class MyServer extends JFrame implements ActionListener {
	JButton b1;
	JTextField t1;
	JLabel lb1;

	public MyServer() {
		Container c = this.getContentPane();
		c.setLayout(null);

		lb1 = new JLabel("Enter a Number");
		lb1.setBounds(10, 10, 100, 20);
		t1 = new JTextField();
		t1.setBounds(110, 10, 200, 20);

		b1 = new JButton("Square");
		b1.setBounds(10, 80, 80, 100);
		b1.addActionListener(this);

		c.add(lb1);
		c.add(b1);
		c.add(t1);
	}// End of constructor

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int num = Integer.parseInt(t1.getText());
			try {
				Socket s = new Socket("localhost", 6666);
				DataOutputStream dout = new DataOutputStream(s.getOutputStream());
				String m = JOptionPane.showInputDialog("Enter first number=");
				dout.writeUTF(m);
				dout.flush();
				dout.close();
				s.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] a) {
		MyServer ms = new MyServer();
		ms.setVisible(true);
		ms.setBounds(10, 20, 1000, 1000);
		ms.setDefautCloseOption(ms.EXIT_ON_CLOSE());
	}
}
