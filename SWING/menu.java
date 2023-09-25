import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame implements ActionListener {
	JMenuBar jmbr;
	JMenuItem mitemopen, mitemclose;
	JMenu mnufile;
	Container c;

	public menu() {
		jmbr = new JMenuBar();
		mnufile = new JMenu("File");
		jmbr.add(mnufile);
		mitemopen = new JMenuItem("Open");
		mitemclose = new JMenuItem("Close");
		mitemopen.addActionListener(this);
		mitemclose.addActionListener(this);
		mnufile.add(mitemopen);
		mnufile.add(mitemclose);
		c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add("North", jmbr);

	}

	public void actionPerformed(ActionEvent e) {
		if (mitemopen.isArmed()) {
			convertor con = new convertor();
			con.setSize(1000, 500);
			con.setVisible(true);
			con.setDefaultCloseOperation(con.EXIT_ON_CLOSE);

		}
		if (mitemclose.isArmed()) {
			System.exit(0);
		}
	}

	public static void main(String[] a) {
		menu menu1 = new menu();
		menu1.setBounds(10, 10, 1000, 1000);
		menu1.setVisible(true);
		menu1.setDefaultCloseOperation(menu1.EXIT_ON_CLOSE);
	}
}
