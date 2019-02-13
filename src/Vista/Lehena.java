package Vista;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controlador.MetodoakVista;

public class Lehena extends JFrame {
	
	private JButton btnSaioaHasi = new JButton("AURRERA");
	private JLabel lblOngiEtorri = new JLabel("ONGI ETORRI");
	private ActionListener alBSaioaHasi;

	/**
	 * Create the panel.
	 *  @author TALDE4
	 */
	public Lehena() {
		getContentPane().setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 200, 635, 455);
		
		btnSaioaHasi.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		
		alBSaioaHasi = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MetodoakVista.bigarrenera();
				
			}
		};
		btnSaioaHasi.addActionListener(alBSaioaHasi);
		btnSaioaHasi.setBounds(204, 214, 206, 84);
		getContentPane().add(btnSaioaHasi);
		
		
		lblOngiEtorri.setHorizontalAlignment(SwingConstants.CENTER);
		lblOngiEtorri.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblOngiEtorri.setBounds(103, 34, 391, 195);
		getContentPane().add(lblOngiEtorri);

	}

}
