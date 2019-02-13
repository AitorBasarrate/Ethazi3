package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Metodoak;
import Controlador.MetodoakVista;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Erregistratu extends JFrame {
	private JTextField txtIzena = new JTextField();
	private JTextField txtAbizenak = new JTextField();
	private JTextField txtDNI = new JTextField();
	private final JSpinner Data = new JSpinner();
	private JPasswordField passwordField = new JPasswordField();
	private JPasswordField passwordField_1 = new JPasswordField();
	private JLabel lblIzena = new JLabel("Izena:");
	private JLabel lblAbizenak = new JLabel("Abizenak:");
	private JLabel lblDni = new JLabel("DNI:");
	private JRadioButton rdbtnGizona = new JRadioButton("Gizona");
	private JRadioButton rdbtnEmakumea = new JRadioButton("Emakumea");
	private JLabel lblSexua = new JLabel("Sexua?");
	private JLabel lblJaiotzedata = new JLabel("Jaiotze-Data:");
	private JLabel lblPasahitza = new JLabel("Pasahitza:");
	private JLabel lblNewLabel = new JLabel("Egiaztatu pasahitza:");
	private JButton btnAurrera = new JButton("Aurrera");
	private JButton btnIrten = new JButton("IRTEN");
	private ActionListener alBIrten;
	private ActionListener alBAurrera;
	private String sexua = "";
	private ActionListener alRdbtnGizona;
	private ActionListener alRdbtnEmakumea;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Erregistratu() {
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 200, 635, 455);
		getContentPane().setLayout(null);
		
		
		lblIzena.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblIzena.setBounds(32, 38, 75, 25);
		getContentPane().add(lblIzena);
		
		
		txtIzena.setBounds(116, 35, 123, 31);
		getContentPane().add(txtIzena);
		txtIzena.setColumns(10);
		
		
		lblAbizenak.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAbizenak.setBounds(271, 38, 107, 25);
		getContentPane().add(lblAbizenak);
		
		
		txtAbizenak.setBounds(380, 38, 142, 26);
		getContentPane().add(txtAbizenak);
		txtAbizenak.setColumns(10);
		
		
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDni.setBounds(32, 114, 81, 31);
		getContentPane().add(lblDni);
		
		
		txtDNI.setBounds(116, 116, 123, 29);
		getContentPane().add(txtDNI);
		txtDNI.setColumns(10);
		
		
		alRdbtnGizona = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnGizona.isSelected()) {
					rdbtnEmakumea.setSelected(false);
					btnAurrera.setEnabled(true);
				}
			}
		};
		rdbtnGizona.addActionListener(alRdbtnGizona);
		rdbtnGizona.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnGizona.setBounds(435, 103, 127, 25);
		getContentPane().add(rdbtnGizona);
		
		
		alRdbtnEmakumea = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnEmakumea.isSelected()) {
					rdbtnGizona.setSelected(false);
					btnAurrera.setEnabled(true);
				}
			}
		};
		rdbtnEmakumea.addActionListener(alRdbtnEmakumea);
		rdbtnEmakumea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnEmakumea.setBounds(435, 133, 127, 25);
		getContentPane().add(rdbtnEmakumea);
		
		
		if(!rdbtnGizona.isSelected() || !rdbtnEmakumea.isSelected()) {
			btnAurrera.setEnabled(false);
		}
		
		
		lblSexua.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSexua.setBounds(314, 109, 101, 41);
		getContentPane().add(lblSexua);
		
		
		lblJaiotzedata.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblJaiotzedata.setBounds(32, 196, 151, 41);
		getContentPane().add(lblJaiotzedata);
		
		
		Data.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Data.setModel(new SpinnerDateModel(new Date(1546297200000L), null, null, Calendar.DAY_OF_YEAR));
		Data.setBounds(195, 206, 142, 25);
		getContentPane().add(Data);
		
		
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPasahitza.setBounds(32, 276, 123, 25);
		getContentPane().add(lblPasahitza);
		
		
		passwordField.setBounds(155, 270, 182, 31);
		getContentPane().add(passwordField);
		
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(30, 342, 221, 31);
		getContentPane().add(lblNewLabel);
		
		
		passwordField_1.setBounds(263, 342, 182, 31);
		getContentPane().add(passwordField_1);
		
		
		alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MetodoakVista.hirugarrenera();
				dispose();
				if(rdbtnGizona.isSelected()) {
					sexua = "V";
				}
				else {
					sexua = "M";
				}
//				Date data = (Date)Data.getModel().getValue();
				
				Metodoak.insertatu(txtDNI.getText(), txtIzena.getText(), txtAbizenak.getText(), sexua, passwordField.getText());
				
			}
		};
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.setBounds(530, 388, 99, 31);
		getContentPane().add(btnAurrera);
		
		
		alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnIrten.addActionListener(alBIrten);
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.setBounds(530, 0, 99, 33);
		getContentPane().add(btnIrten);
	}
}
