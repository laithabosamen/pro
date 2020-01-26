package programming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JF {

	public static void main(String[] args) {
		JFrame frm = new JFrame("hi");
		frm.setSize(600, 400);
		frm.setLocationRelativeTo(null);
		JPanel pal = new JPanel();
		pal.add(new JLabel("N1"));
		pal.add(new JTextField(20));
		pal.add(new JLabel("N2"));
		pal.add(new JTextField(20));
		pal.add(new JButton("ADD"));

	}

}
