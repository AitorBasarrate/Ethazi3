package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controlador.MetodoakVista;

public class AteraBilletea extends JFrame {
	
	private JLabel lblEskerrik = new JLabel("ESKERRIK");
	private JLabel lblAsko = new JLabel("ASKO");
	private JButton btnAteraBilletea = new JButton("Atera billetea");
	private ActionListener alBAzkena;

	/**
	 * Create the panel.
	 */
	public AteraBilletea(String DNI) {
		
		setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		
		
		lblEskerrik.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblEskerrik.setHorizontalAlignment(SwingConstants.CENTER);
		lblEskerrik.setBounds(192, 57, 208, 84);
		add(lblEskerrik);
		
		
		lblAsko.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblAsko.setBounds(241, 152, 134, 68);
		add(lblAsko);
		
		alBAzkena = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.azkenera(DNI);
				dispose();
			}
		};
		btnAteraBilletea.addActionListener(alBAzkena);
		btnAteraBilletea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnAteraBilletea.setBounds(202, 269, 198, 39);
		add(btnAteraBilletea);

	}
}
