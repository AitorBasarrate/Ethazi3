package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controlador.Metodoak;
import Controlador.MetodoakVista;

public class SaioaHasi extends JFrame {
	
	private JTextField txtDNI = new JTextField();
	private JLabel lblDNI = new JLabel("DNI:");
	private JLabel lblPasahitza = new JLabel("Pasahitza:");
	private JButton btnAurrera = new JButton("Aurrera");
	private JButton btnAtzera = new JButton("Atzera");
	private JButton btnIrten = new JButton("IRTEN");
	private String DNI;
	private boolean DNIkonprobatu;
	private String pasahitzaEnkripatatuta;
	private boolean pasahitzaKonprobatu;
	private JPasswordField passwordField;
	private ActionListener alBAurrera;
	private ActionListener alBAtzera;
	private ActionListener alBIrten;
	
	
	
	/**
	 * Create the panel.
	 */
	public SaioaHasi() {
		getContentPane().setLayout(null);
		this.setSize(635,465);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		
		
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblDNI.setBounds(139, 106, 108, 87);
		getContentPane().add(lblDNI);
		
		
		txtDNI.setBounds(240, 127, 193, 43);
		getContentPane().add(txtDNI);
		txtDNI.setColumns(10);
		
		
		
		
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblPasahitza.setBounds(112, 246, 193, 103);
		getContentPane().add(lblPasahitza);
		
		
		
		alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pasahitzaEnkripatatuta = Metodoak.getMD5(passwordField.getText());
				pasahitzaKonprobatu = Metodoak.pasahitzaKomprobaketa(pasahitzaEnkripatatuta);				
				System.out.println(pasahitzaEnkripatatuta);
				DNI = txtDNI.getText();
				DNIkonprobatu = Metodoak.nanKomprobaketa(DNI);
			
			if(DNIkonprobatu==true && pasahitzaKonprobatu==true) {
					MetodoakVista.hirugarrenera();
					dispose();
			}else {
					JOptionPane.showMessageDialog(null, "Ez da existitzen\n Saiatu berriro");
			}
			}
			
		};
		btnAurrera.setEnabled(true);
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.setBounds(524, 386, 99, 33);
		getContentPane().add(btnAurrera);

		
		alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.setBounds(0, 0, 89, 33);
		getContentPane().add(btnAtzera);
		
		
		alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnIrten.addActionListener(alBIrten);
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.setBounds(524, 0, 99, 33);
		getContentPane().add(btnIrten);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(281, 274, 183, 43);
		getContentPane().add(passwordField);
		

	}
}
