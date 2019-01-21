package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JPanel {
	JButton btnFf = new JButton("ff");

	/**
	 * Create the panel.
	 */
	public Ventana1() {
		setLayout(null);
		
		
		btnFf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnFf.setBounds(71, 151, 89, 23);
		add(btnFf);

	}

}
