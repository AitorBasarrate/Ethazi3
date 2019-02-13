package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Controlador.MetodoakVista;

public class Lineak extends JFrame {

	private JTextField autobusaCod = new JTextField();
	private JLabel lblLineak = new JLabel("LINEAK");
	private JLabel lblBus = new JLabel("BUS");
	private JButton btnAurrera = new JButton("Aurrera");
	private JButton btnAtzera = new JButton("Atzera");
	private JButton btnIrten = new JButton("IRTEN");
	private JButton btnOnartu = new JButton("Onartu");
	private JRadioButton rdbtnL1 = new JRadioButton("L1 - Termibus/Plentzia");
	private JRadioButton rdbtnL2 = new JRadioButton("L2 - Termibus/Muskiz");
	private JRadioButton rdbtnL3 = new JRadioButton("L3 - Termibus/Balmaseda");
	private JRadioButton rdbtnL4 = new JRadioButton("L4 - Termibus/Durango");
	private String linea = "";
	ArrayList geltokia = new ArrayList();
	int codBush;
	private ActionListener aukeraOnartu;
	private ActionListener alRdbtn4;
	private ActionListener alRdbtn3;
	private ActionListener alRdbtn2;
	private ActionListener alRdbtn1;
	private ActionListener alBIrten;
	private ActionListener alBAtzera;
	private ActionListener alBAurrera;

	/**
	 * Create the panel.
	 */

	public Lineak() {

		getContentPane().setLayout(null);
		this.setSize(650, 466);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);

		lblLineak.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblLineak.setBounds(58, 58, 132, 32);
		getContentPane().add(lblLineak);
		DefaultListModel modelo = new DefaultListModel();
		modelo.addElement("L1");
		modelo.addElement("L2");
		modelo.addElement("L3");
		modelo.addElement("L4");

		lblBus.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblBus.setBounds(377, 45, 86, 54);
		getContentPane().add(lblBus);

		autobusaCod.setFont(new Font("Tahoma", Font.PLAIN, 25));
		autobusaCod.setBackground(Color.WHITE);
		autobusaCod.setEditable(false);
		
		
		autobusaCod.setBounds(352, 110, 132, 119);
		getContentPane().add(autobusaCod);
		autobusaCod.setColumns(10);
		
//		textField.setText(Kontsulta.lineaAukeratu());


		alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					MetodoakVista.laugarrenera(geltokia, linea, codBush);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				dispose();
			}
		};
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.setBounds(524, 387, 99, 32);
		getContentPane().add(btnAurrera);
		btnAurrera.setEnabled(false);


		alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnIrten.addActionListener(alBIrten);
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.setBounds(524, 0, 99, 32);
		getContentPane().add(btnIrten);

		rdbtnL1.setBounds(58, 113, 176, 23);
		getContentPane().add(rdbtnL1);
		alRdbtn1 = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnL1.isSelected()) {
					rdbtnL2.setSelected(false);
					rdbtnL3.setSelected(false);
					rdbtnL4.setSelected(false);
				}
//				linea = MetodoakVista.aukeratuLinea("L1");
			}
		};
		rdbtnL1.addActionListener(alRdbtn1);

		rdbtnL2.setBounds(58, 146, 156, 23);
		getContentPane().add(rdbtnL2);
		alRdbtn2 = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnL2.isSelected()) {
					rdbtnL1.setSelected(false);
					rdbtnL3.setSelected(false);
					rdbtnL4.setSelected(false);
				}
//				linea = MetodoakVista.aukeratuLinea("L2");
			}
		};
		rdbtnL2.addActionListener(alRdbtn2);

		rdbtnL3.setBounds(58, 181, 156, 23);
		getContentPane().add(rdbtnL3);
		alRdbtn3 = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnL3.isSelected()) {
					rdbtnL2.setSelected(false);
					rdbtnL1.setSelected(false);
					rdbtnL4.setSelected(false);
				}
//				linea = MetodoakVista.aukeratuLinea("L3");
			}
		};
		rdbtnL3.addActionListener(alRdbtn3);
		
		rdbtnL4.setBounds(58, 216, 156, 23);
		getContentPane().add(rdbtnL4);
		alRdbtn4 = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnL4.isSelected()) {
					rdbtnL1.setSelected(false);
					rdbtnL2.setSelected(false);
					rdbtnL3.setSelected(false);
				}
//				linea = MetodoakVista.aukeratuLinea("L4");
			}
		};
		rdbtnL4.addActionListener(alRdbtn4);
		
		btnOnartu.setBounds(68, 265, 89, 23);
		getContentPane().add(btnOnartu);
		aukeraOnartu = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (rdbtnL1.isSelected()) {
					linea="L1";
					codBush = MetodoakVista.bus_lortu(linea);
					geltokia = MetodoakVista.aukeratuLinea(linea);
//					MetodoakVista.getLinea(linea, codBush);
					autobusaCod.setText(Integer.toString(codBush));
					
				} else if (rdbtnL2.isSelected()) {
					linea="L2";
					codBush = MetodoakVista.bus_lortu(linea);
					geltokia = MetodoakVista.aukeratuLinea(linea);
					autobusaCod.setText(Integer.toString(codBush));
					
				} else if (rdbtnL3.isSelected()) {
					linea="L3";
					codBush = MetodoakVista.bus_lortu(linea);
					geltokia = MetodoakVista.aukeratuLinea(linea);
					autobusaCod.setText(Integer.toString(codBush));
					
				} else if (rdbtnL4.isSelected()) {
					linea="L4";
					codBush = MetodoakVista.bus_lortu(linea);
					geltokia = MetodoakVista.aukeratuLinea(linea);
					autobusaCod.setText(Integer.toString(codBush));
				}
				System.out.println(geltokia.get(0));
				btnAurrera.setEnabled(true);
			}
			
		};
		btnOnartu.addActionListener(aukeraOnartu);
		
	}
}