package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaioaHasi extends JPanel {
	
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
		setLayout(null);
		
		
		lblK.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblK.setBounds(139, 106, 108, 87);
		add(lblK);
		
		
		textField.setBounds(240, 127, 193, 43);
		add(textField);
		textField.setColumns(10);
		
		
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblPasahitza.setBounds(112, 246, 193, 103);
		add(lblPasahitza);
		
		
		textField_1.setBounds(292, 275, 186, 43);
		add(textField_1);
		textField_1.setColumns(10);
		
		
		ActionListener alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.SaioaHasi.setVisible(false);
				Frame.Lineak.setVisible(true);
			}
		};
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.setBounds(524, 386, 99, 33);
		add(btnAurrera);
		
		
		
		ActionListener alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.SaioaHasi.setVisible(false);
				Frame.Lehena.setVisible(true);
			}
		};
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.setBounds(0, 0, 89, 23);
		add(btnAtzera);
		
		
		ActionListener alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.SaioaHasi.setVisible(false);
				Frame.Lehena.setVisible(true);
			}
		};
		btnIrten.addActionListener(alBIrten);
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.setBounds(524, 0, 99, 33);
		add(btnIrten);

	}
}