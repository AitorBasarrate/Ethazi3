package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Lineak extends JPanel {
	
	private JTextField textField = new JTextField();
	private JLabel lblLineak = new JLabel("LINEAK");
	private JList list = new JList();
	private JLabel lblBus = new JLabel("BUS");
	private JButton btnAurrera = new JButton("Aurrera");
	private JButton btnAtzera = new JButton("Atzera");
	private JButton btnIrten = new JButton("IRTEN");
	
	/**
	 * Create the panel.
	 */
	public Lineak() {
		setLayout(null);
		
		
		lblLineak.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblLineak.setBounds(58, 58, 132, 32);
		add(lblLineak);
		
		
		list.setBounds(42, 117, 193, 249);
		add(list);
		
		
		lblBus.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblBus.setBounds(386, 115, 86, 54);
		add(lblBus);
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		
		
		textField.setBounds(362, 181, 132, 54);
		add(textField);
		textField.setColumns(10);
		
		ActionListener alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.Lineak.setVisible(false);
				Frame.Geltokiak.setVisible(true);
			}
		};
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.setBounds(524, 387, 99, 32);
		add(btnAurrera);
		
		ActionListener alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.Lineak.setVisible(false);
				Frame.SaioaHasi.setVisible(true);
			}
		};
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.setBounds(0, 0, 89, 23);
		add(btnAtzera);
		
		ActionListener alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.Lineak.setVisible(false);
				Frame.Lehena.setVisible(true);
			}
		};
		btnIrten.addActionListener(alBIrten);
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.setBounds(524, 0, 99, 32);
		add(btnIrten);

	}
}