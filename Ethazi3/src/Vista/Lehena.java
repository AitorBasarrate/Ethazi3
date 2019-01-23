package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Lehena extends JPanel {
	JButton btnFf = new JButton("SAIOA HASI");

	/**
	 * Create the panel.
	 */
	public Lehena() {
		setLayout(null);
		btnFf.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		
		btnFf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.Lehena.setVisible(false);
				Frame.SaioaHasi.setVisible(true);
			}
		});
		btnFf.setBounds(204, 214, 206, 84);
		add(btnFf);
		
		JLabel lblOngiEtorri = new JLabel("ONGI ETORRI");
		lblOngiEtorri.setHorizontalAlignment(SwingConstants.CENTER);
		lblOngiEtorri.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblOngiEtorri.setBounds(103, 34, 391, 195);
		add(lblOngiEtorri);

	}
}
