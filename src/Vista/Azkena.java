package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controlador.MetodoakVista;
import javax.swing.SwingConstants;

public class Azkena extends JFrame {

	JLabel lblBilleteaInprimitzenDago = new JLabel("BILLETEA INPRIMITZEN DAGO");
	JLabel lblEskerrikAskoZure = new JLabel("ESKERRIK ASKO ZURE EROSKETAGATIK");
	/**
	 *  @author TALDE4
	 * Create the panel.
	 */
	public Azkena() {
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		getContentPane().setLayout(null);
		
		
		lblBilleteaInprimitzenDago.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBilleteaInprimitzenDago.setHorizontalAlignment(SwingConstants.CENTER);
		lblBilleteaInprimitzenDago.setBounds(96, 92, 418, 99);
		getContentPane().add(lblBilleteaInprimitzenDago);
		
		
		lblEskerrikAskoZure.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEskerrikAskoZure.setHorizontalAlignment(SwingConstants.CENTER);
		lblEskerrikAskoZure.setBounds(33, 222, 540, 99);
		getContentPane().add(lblEskerrikAskoZure);
		
		
	}
}
