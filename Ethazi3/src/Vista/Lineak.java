package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JTextField;

import Controlador.MetodoakVista;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Lineak extends JFrame {
	
	private JTextField textField = new JTextField();
	private JLabel lblLineak = new JLabel("LINEAK");
	private JLabel lblBus = new JLabel("BUS");
	private JButton btnAurrera = new JButton("Aurrera");
	private JButton btnAtzera = new JButton("Atzera");
	private JButton btnIrten = new JButton("IRTEN");
	
	/**
	 * Create the panel.
	 */
	public Lineak() {
		getContentPane().setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		
		
		lblLineak.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblLineak.setBounds(58, 58, 132, 32);
		getContentPane().add(lblLineak);
		
		
		lblBus.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblBus.setBounds(386, 115, 86, 54);
		getContentPane().add(lblBus);
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		
		
		textField.setBounds(362, 181, 132, 54);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		ActionListener alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.laugarrenera();
				dispose();
			}
		};
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.setBounds(524, 387, 99, 32);
		getContentPane().add(btnAurrera);
		
		ActionListener alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bigarrenera();
				dispose();
			}
		};
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.setBounds(0, 0, 89, 32);
		getContentPane().add(btnAtzera);
		
		ActionListener alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnIrten.addActionListener(alBIrten);
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.setBounds(524, 0, 99, 32);
		getContentPane().add(btnIrten);
		
		JMenu mnLineak = new JMenu("Lineak");
		mnLineak.setBounds(39, 115, 123, 32);
		getContentPane().add(mnLineak);
		
		JMenuItem mntmLineak = new JMenuItem("Lineak");
		mntmLineak.setBounds(26, 245, 99, 24);
		getContentPane().add(mntmLineak);

	}
}
