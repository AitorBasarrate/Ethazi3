package Vista;

import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.Color;

public class Geltokiak extends JFrame {
	private JTextField txtLinea = new JTextField();
	private JLabel lblAukeratuDuzunLinea = new JLabel("Aukeratu duzun linea");
	private JLabel lblGeltokiakAukeratu = new JLabel("Geltokiak aukeratu");
	private JLabel lblHasiera = new JLabel("Hasiera");
	private JLabel lblHelmuga = new JLabel("Helmuga");
	private JLabel lblData = new JLabel("Data");
	private JButton btnAurrera = new JButton("Aurrera");
	private JButton btnIrten = new JButton("IRTEN");
	private JButton btnAtzera = new JButton("Atzera");
	private JComboBox comboBoxHasiera = new JComboBox();
	private final JComboBox comboBoxHelmuga = new JComboBox();
	private final JSpinner spinner = new JSpinner();
	/**
	 * @wbp.nonvisual location=91,269
	 */
	
	/**
	 * Create the panel.
	 */
	public Geltokiak() {
		
		setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		
		lblAukeratuDuzunLinea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAukeratuDuzunLinea.setBounds(155, 88, 245, 23);
		add(lblAukeratuDuzunLinea);
		txtLinea.setBackground(Color.WHITE);
		txtLinea.setEditable(false);
		
		
		txtLinea.setBounds(204, 137, 138, 46);
		add(txtLinea);
		txtLinea.setColumns(10);
		
		
		lblGeltokiakAukeratu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblGeltokiakAukeratu.setBounds(182, 234, 212, 20);
		add(lblGeltokiakAukeratu);
		
		
		lblHasiera.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHasiera.setBounds(64, 300, 111, 33);
		add(lblHasiera);
		
		
		lblHelmuga.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHelmuga.setBounds(232, 300, 118, 35);
		add(lblHelmuga);
		
		
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblData.setBounds(421, 307, 89, 23);
		add(lblData);
		comboBoxHasiera.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		
		comboBoxHasiera.setBounds(73, 346, 89, 20);
		add(comboBoxHasiera);
		comboBoxHelmuga.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboBoxHelmuga.setBounds(242, 346, 94, 20);
		
		add(comboBoxHelmuga);
		
		ActionListener alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				Frame.Geltokiak.setVisible(false);
//				Frame.Ordainketa.setVisible(true);
			}
		};
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setBounds(524, 386, 99, 33);
		add(btnAurrera);
		
		ActionListener alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				Frame.Geltokiak.setVisible(false);
				Frame.Lehena.setVisible(true);
			}
		};
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.addActionListener(alBIrten);
		btnIrten.setBounds(524, 0, 99, 33);
		add(btnIrten);
		
		ActionListener alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				Frame.Geltokiak.setVisible(false);
//				Frame.Lineak.setVisible(true);
			}
		};
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setBounds(0, 0, 89, 23);
		add(btnAtzera);
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		spinner.setModel(new SpinnerDateModel(new Date(1546297200000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(395, 341, 144, 23);
		
		add(spinner);

	}
}
