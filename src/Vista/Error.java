package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Error extends JFrame {

	private JPanel contentPane;
	private JLabel lblEzDaExistitzen = new JLabel("EZ DA EXISTITZEN");

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Error() {
		setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		
		
		lblEzDaExistitzen.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEzDaExistitzen.setBounds(12, 37, 183, 37);
		getContentPane().add(lblEzDaExistitzen);
	}
}
