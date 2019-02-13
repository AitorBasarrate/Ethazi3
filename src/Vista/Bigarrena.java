package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.MetodoakVista;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bigarrena extends JFrame {

	private JButton btnErregistratu = new JButton("ERREGISTRATU");
	private JButton btnSaioaHasi = new JButton("SAIOA HASI");
	private ActionListener alBErregistratu;
	private ActionListener alBSaioaHasi;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Bigarrena() {
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 200, 635, 455);
		getContentPane().setLayout(null);
		
		alBErregistratu = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MetodoakVista.pasatuErregistrora();
				dispose();
			}
		};
		btnErregistratu.addActionListener(alBErregistratu);
		btnErregistratu.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnErregistratu.setBounds(156, 59, 289, 101);
		getContentPane().add(btnErregistratu);
		
		
		alBSaioaHasi = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MetodoakVista.pasatuSaioHasiera();
				dispose();
			}
		};
		btnSaioaHasi.addActionListener(alBSaioaHasi);
		btnSaioaHasi.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnSaioaHasi.setBounds(156, 232, 289, 85);
		getContentPane().add(btnSaioaHasi);
	}
}
