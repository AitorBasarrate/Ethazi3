package Vista;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agurra extends JFrame {

	private JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JLabel lblOngiEtorri = new JLabel("ONGI ETORRI");
	JButton btnSaioaHasi = new JButton("SAIOA HASI");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agurra frame = new Agurra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Agurra() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p1);
		p1.setLayout(null);
		
		
		ActionListener alBSaioaHasi = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		};
		btnSaioaHasi.addActionListener(alBSaioaHasi);
		lblOngiEtorri.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblOngiEtorri.setBounds(110, 28, 226, 62);
		p1.add(lblOngiEtorri);
		
		
		btnSaioaHasi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSaioaHasi.setBounds(142, 119, 156, 48);
		p1.add(btnSaioaHasi);
	}
}
