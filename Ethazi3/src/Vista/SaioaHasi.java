package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.*;

public class SaioaHasi extends JFrame {
	
	private JTextField textField = new JTextField();
	private JTextField textField_1 = new JTextField();
	private JLabel lblK = new JLabel("DNI:");
	private JLabel lblPasahitza = new JLabel("Pasahitza:");
	private JButton btnAurrera = new JButton("Aurrera");
	private JButton btnAtzera = new JButton("Atzera");
	private JButton btnIrten = new JButton("IRTEN");
	
	
	/**
	 * Create the panel.
	 */
	public SaioaHasi() {
		getContentPane().setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		
		
		
		lblK.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblK.setBounds(139, 106, 108, 87);
		getContentPane().add(lblK);
		
		
		textField.setBounds(240, 127, 193, 43);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblPasahitza.setBounds(112, 246, 193, 103);
		getContentPane().add(lblPasahitza);
		
		
		textField_1.setBounds(292, 275, 186, 43);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		ActionListener alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.hirugarrenera();
				dispose();
			}
		};
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.setBounds(524, 386, 99, 33);
		getContentPane().add(btnAurrera);

		
		ActionListener alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.setBounds(0, 0, 89, 33);
		getContentPane().add(btnAtzera);
		
		
		ActionListener alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnIrten.addActionListener(alBIrten);
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.setBounds(524, 0, 99, 33);
		getContentPane().add(btnIrten);

	}
}
