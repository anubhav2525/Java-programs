import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menuhw extends JFrame implements ActionListener {
	JMenuBar jmbr;
	JMenuItem mitemproject1, mitemproject2, mitemexit;
	JMenu mnufile, mnuedit, mnuclose;
	Container c;

	public menuhw() {
		jmbr = new JMenuBar();
		mnufile = new JMenu("File");
		mnuedit = new JMenu("Edit");
		mnuclose = new JMenu("Close");
		jmbr.add(mnufile);
		jmbr.add(mnuedit);
		jmbr.add(mnuclose);
		mitemproject1 = new JMenuItem("Project 1");
		mitemproject2 = new JMenuItem("Project2");
		mitemexit = new JMenuItem("Exit");
		mitemproject1.addActionListener(this);
		mitemproject2.addActionListener(this);
		mitemexit.addActionListener(this);
		mnufile.add(mitemproject1);
		mnuedit.add(mitemproject2);
		mnuclose.add(mitemexit);
		c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add("North", jmbr);

	}

	public void actionPerformed(ActionEvent e) {
		if (mitemproject1.isArmed()) {
			simple ob = new simple();
			ob.setSize(1000, 500);
			ob.setVisible(true);
			ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
		}
		if (mitemproject2.isArmed()) {
			operator ob1 = new operator();
			ob1.setSize(1000, 500);
			ob1.setVisible(true);
			ob1.setDefaultCloseOperation(ob1.EXIT_ON_CLOSE);
		}

		if (mitemexit.isArmed()) {
			System.exit(0);
		}
	}

	public static void main(String[] a) {
		menuhw menu2 = new menuhw();
		menu2.setBounds(10, 10, 1000, 1000);
		menu2.setVisible(true);
		menu2.setDefaultCloseOperation(menu2.EXIT_ON_CLOSE);
	}
}
