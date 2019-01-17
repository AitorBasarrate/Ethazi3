package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class SaioaHasi extends JPanel {
	
	JPanel p2 = new JPanel();
	JTextField txtGhfgfgh;

	/**
	 * Create the panel.
	 */
	public SaioaHasi() {
		setLayout(null);
		
		
		p2.setBounds(10, 11, 430, 278);
		add(p2);
		p2.setLayout(null);
		
		txtGhfgfgh = new JTextField();
		txtGhfgfgh.setText("ghfgfgh");
		txtGhfgfgh.setBounds(115, 75, 86, 20);
		p2.add(txtGhfgfgh);
		txtGhfgfgh.setColumns(10);
		
		JLabel lblFff = new JLabel("fff");
		lblFff.setBounds(136, 170, 46, 14);
		p2.add(lblFff);

	}

}
