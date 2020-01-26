package programming;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class hhh {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hhh window = new hhh();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hhh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUserName.setBounds(24, 11, 120, 33);
		frame.getContentPane().add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(154, 20, 139, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setBackground(new Color(255, 255, 0));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(24, 55, 120, 24);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 51, 0));
		passwordField.setBounds(154, 57, 139, 20);
		frame.getContentPane().add(passwordField);
		
		table = new JTable();
		table.setBounds(88, 194, 1, 1);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Log  in");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(0, 102, 255));
		btnNewButton.setBounds(24, 117, 105, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Support");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(new Color(0, 102, 255));
		btnNewButton_1.setBounds(24, 167, 105, 39);
		frame.getContentPane().add(btnNewButton_1);
	}
}
