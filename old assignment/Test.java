package programming;

import java.awt.BorderLayout;

import javax.swing.*;

public class Test {

	public static void main(String[] args) {
		JFrame frm = new JFrame("hi");
		frm.setSize(600, 400);
		frm.setLocationRelativeTo(null);
		JTextArea txt = new JTextArea();
		frm.add(txt);
		JPanel Pnl = new JPanel();
		Pnl.add(new JButton("1"));
		Pnl.add(new JButton("2"));
		frm.add(Pnl, BorderLayout.SOUTH);
		frm.setVisible(true);

	}

}
