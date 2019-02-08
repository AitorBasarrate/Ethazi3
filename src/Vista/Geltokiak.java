package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import Controlador.Metodoak;
import Controlador.MetodoakVista;
import Controlador.parada;
import Modelo.Kontsulta;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

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
	private final JSpinner Data = new JSpinner();
	private String lineaIzena="";
	private double prezioFinala;
	private JRadioButton rdbtnJoanEtorri = new JRadioButton("JOAN ETORRI ?");
	private boolean joanEtorri = false;
	private int contagailu = 1;
	private ActionListener alBAtzera;
	private ActionListener alBIrten;
	private ActionListener alBAurrera;
	private JTextField textField;
	/**
	 * @wbp.nonvisual location=91,269
	 */

	/**
	 * Create the panel.
	 */

	
	
		


	public Geltokiak(ArrayList geltoki, String linea) {


		getContentPane().setLayout(null);
		this.setSize(478, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);

		lblAukeratuDuzunLinea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAukeratuDuzunLinea.setBounds(162, 46, 245, 23);
		getContentPane().add(lblAukeratuDuzunLinea);
		
		txtLinea.setHorizontalAlignment(SwingConstants.CENTER);
		txtLinea.setBackground(Color.WHITE);
		txtLinea.setEditable(false);
		lineaIzena = MetodoakVista.lineaIzenaAukeratu(linea);
		txtLinea.setText(lineaIzena);
		txtLinea.setBounds(212, 78, 138, 46);
		getContentPane().add(txtLinea);
		txtLinea.setColumns(10);

		lblGeltokiakAukeratu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblGeltokiakAukeratu.setBounds(162, 138, 260, 53);
		getContentPane().add(lblGeltokiakAukeratu);

		lblHasiera.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHasiera.setBounds(46, 202, 111, 33);
		getContentPane().add(lblHasiera);

		lblHelmuga.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHelmuga.setBounds(266, 204, 118, 35);
		getContentPane().add(lblHelmuga);

		lblData.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblData.setBounds(477, 207, 89, 23);
		getContentPane().add(lblData);

		
		
//		comboBoxHasiera.setFont(new Font("Tahoma", Font.PLAIN, 30));
//		comboBoxHasiera.setBounds(73, 346, 89, 20);
//		comboBoxHasiera.addItem(geltoki);
//		for (int n = 0; n < geltoki.size(); n++) {
//			System.out.println(geltoki.get(n));

		comboBoxHasiera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxHasiera.setBounds(12, 254, 184, 53);
		for (int n = 0; n < geltoki.size(); n++) {
			comboBoxHasiera.addItem(geltoki.get(n));

		}
		getContentPane().add(comboBoxHasiera);

		comboBoxHelmuga.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxHelmuga.setBounds(238, 252, 184, 53);
		for (int n = 0; n < geltoki.size(); n++) {
			comboBoxHelmuga.addItem(geltoki.get(n));
		}
		getContentPane().add(comboBoxHelmuga);

		alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				for (int n = 0; n < geltoki.size(); n++) {
					if (comboBoxHasiera.getSelectedItem().equals(geltoki.get(n))) {
						System.out.println("Pillado Hasiera");
					}
				}
				for (int n = 0; n < geltoki.size(); n++) {
					if (comboBoxHelmuga.getSelectedItem().equals(geltoki.get(n))) {
						System.out.println("Pillado Helmuga");
					}
				}
				Date data = (Date)Data.getModel().getValue();
				System.out.println(data);
				prezioFinala = Metodoak.prezioaKalk(linea, contagailu);
				
				
				MetodoakVista.bostgarrenera(geltoki, linea, prezioFinala);

				dispose();
			}
		};
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setBounds(524, 386, 99, 33);
		getContentPane().add(btnAurrera);

		alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.addActionListener(alBIrten);
		btnIrten.setBounds(524, 0, 99, 33);
		getContentPane().add(btnIrten);

		alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.hirugarrenera();
				dispose();
			}
		};
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setBounds(0, 0, 89, 33);
		getContentPane().add(btnAtzera);
		Data.setFont(new Font("Tahoma", Font.PLAIN, 20));

		Data.setModel(new SpinnerDateModel(new Date(1546297200000L), null, null, Calendar.DAY_OF_YEAR));
		Data.setBounds(461, 267, 144, 23);
		getContentPane().add(Data);
		
		rdbtnJoanEtorri.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnJoanEtorri.setBounds(95, 334, 312, 46);
		getContentPane().add(rdbtnJoanEtorri);
		if (rdbtnJoanEtorri.isSelected()) {
			joanEtorri = true;
			contagailu =MetodoakVista.joanEtorria(joanEtorri);
			
		}
		
		
	}
}
