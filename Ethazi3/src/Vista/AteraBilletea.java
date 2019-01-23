package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AteraBilletea extends JPanel {
	
	private JLabel lblEskerrik = new JLabel("ESKERRIK");
	private JLabel lblAsko = new JLabel("ASKO");
	private JButton btnAteraBilletea = new JButton("Atera billetea");

	/**
	 * Create the panel.
	 */
	public AteraBilletea() {
		setLayout(null);
		
		
		lblEskerrik.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblEskerrik.setHorizontalAlignment(SwingConstants.CENTER);
		lblEskerrik.setBounds(192, 57, 208, 84);
		add(lblEskerrik);
		
		
		lblAsko.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblAsko.setBounds(241, 152, 134, 68);
		add(lblAsko);
		
		ActionListener alBBilletea = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.AteraBilletea.setVisible(false);
				Frame.Azkena.setVisible(true);
				
			}
		};
		btnAteraBilletea.addActionListener(alBBilletea);
		btnAteraBilletea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnAteraBilletea.setBounds(202, 269, 198, 39);
		add(btnAteraBilletea);

	}
}
