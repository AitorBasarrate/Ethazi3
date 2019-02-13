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
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.Metodoak;
import Controlador.MetodoakVista;

public class Ordainketa extends JFrame {

	private JPanel contentPane;
	private JTextField textDiruTot = new JTextField(); 
	private JTextField textOrdainketa = new JTextField();
	private JButton btnIrten = new JButton("IRTEN\r\n");
	private JLabel lblErositakoa = new JLabel("DIRU TOTALA");
	private JLabel lblBueltak = new JLabel("BUELTAK");
	private JButton btnErosi = new JButton("EROSI");
	private JLabel lblDaramazun = new JLabel("DARAMAZUN DIRUA");
	private JLabel lblSartuDirua = new JLabel("SARTU DIRUA");
	private JList listBueltak = new JList();
	private DefaultListModel list = new DefaultListModel();
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");
	private JButton button0 = new JButton("0");
	private JButton buttonPunto = new JButton(".");
	private JButton btnEzabatu = new JButton("EZABATU");
	private JButton btnAurrera = new JButton("Aurrera");
	private String[] bueltak;
	private double DoubleTextDiruTot;
	private double DoubleTextOrdainketa;
	private String listMezua;
	private String kenketaMetodo;
	private String TextDiruTot;
	private JButton btnAtzera = new JButton("Atzera");
	private ActionListener alBAtzera;
	private ActionListener alBAurrera;
	private ActionListener alBErosi;
	private ActionListener ezabatu;
	private ActionListener alBPunto;
	private ActionListener alB0;
	private ActionListener alB1;
	private ActionListener alB2;
	private ActionListener alB3;
	private ActionListener alB4;
	private ActionListener alB5;
	private ActionListener alB6;
	private ActionListener alB7;
	private ActionListener alB8;
	private ActionListener alB9;
	
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @param codBush 
	 */

	public Ordainketa(ArrayList geltoki, String linea, Double prezioFinala, int codBush) {

		getContentPane().setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		
		
		btnIrten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		});
		btnIrten.setBounds(514, 0, 109, 30);
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(btnIrten);
		
		
		lblErositakoa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblErositakoa.setBounds(22, 45, 149, 30);
		getContentPane().add(lblErositakoa);
		
		
		textDiruTot.setBackground(Color.WHITE);
		textDiruTot.setEditable(false);
//				DefaultListModel ordaintzekoa = new DefaultListModel();
//				ordaintzekoa.addElement(Metodoak.kontTotala+"�");
//				listBueltak.setModel(ordaintzekoa);
		
		textDiruTot.setBounds(22, 69, 270, 38);
		getContentPane().add(textDiruTot);
		Metodoak.bezKalkulatu();
		TextDiruTot = Double.toString(Metodoak.kontTotala);
		textDiruTot.setColumns(10);
		textDiruTot.setText(Double.toString(prezioFinala));
		
		
		lblBueltak.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBueltak.setBounds(22, 118, 149, 21);
		getContentPane().add(lblBueltak);
		
		
		lblDaramazun.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDaramazun.setBounds(427, 41, 177, 38);
		getContentPane().add(lblDaramazun);
		
		
		textOrdainketa.setBackground(Color.WHITE);
		textOrdainketa.setEditable(false);
		textOrdainketa.setBounds(427, 69, 187, 38);
		getContentPane().add(textOrdainketa);
		textOrdainketa.setColumns(10);
		
		
		
		lblSartuDirua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSartuDirua.setBounds(427, 118, 111, 22);
		getContentPane().add(lblSartuDirua);
		
		
		alB1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=1;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		};
		button1.addActionListener(alB1);
		button1.setBounds(427, 142, 50, 51);
		getContentPane().add(button1);
		
		
		alB2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=2;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		};
		button2.addActionListener(alB2);
		button2.setBounds(489, 142, 49, 51);
		getContentPane().add(button2);
		
		
		alB3 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=3;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		};
		button3.addActionListener(alB3);
		button3.setBounds(548, 142, 50, 51);
		getContentPane().add(button3);
		
		
		alB4 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=4;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		};
		button4.addActionListener(alB4);
		button4.setBounds(427, 204, 50, 51);
		getContentPane().add(button4);
		
		
		alB5 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=5;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		};
		button5.addActionListener(alB5);
		button5.setBounds(488, 204, 50, 51);
		getContentPane().add(button5);
		
		
		alB6 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=6;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		};
		button6.addActionListener(alB6);
		button6.setBounds(548, 204, 50, 51);
		getContentPane().add(button6);
		
		
		alB7 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=7;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		};
		button7.addActionListener(alB7);
		button7.setBounds(427, 266, 50, 51);
		getContentPane().add(button7);
		
		
		alB8 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=8;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		};
		button8.addActionListener(alB8);
		button8.setBounds(489, 266, 50, 51);
		getContentPane().add(button8);
		
		
		alB9 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=9;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		};
		button9.addActionListener(alB9);
		button9.setBounds(548, 266, 50, 51);
		getContentPane().add(button9);
		
		
		alB0 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=0;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		};
		button0.addActionListener(alB0);
		button0.setBounds(489, 328, 120, 38);
		getContentPane().add(button0);
		
		alBPunto = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String punto=".";
				textOrdainketa.setText(textOrdainketa.getText() + punto);
				
			}
		};
		buttonPunto.addActionListener(alBPunto);
		buttonPunto.setBounds(427, 328, 50, 38);
		getContentPane().add(buttonPunto);
		
		ezabatu = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textOrdainketa.setText("");
				btnErosi.setEnabled(false);
			}
		};
		btnEzabatu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEzabatu.setBounds(427, 373, 91, 38);
		getContentPane().add(btnEzabatu);
		
		btnEzabatu.addActionListener(ezabatu);
		
		listBueltak.setModel(list);
		
		alBErosi = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.clear();
//				DoubleTextDiruTot = Double.parseDouble(textDiruTot.getText());
//				DoubleTextOrdainketa = Double.parseDouble(textOrdainketa.getText());
				bueltak = Controlador.Metodoak.diruarenBueltak(textDiruTot.getText(), textOrdainketa.getText());
				
			
			if (bueltak[0]=="0") {
				listMezua = "Ez daude bueltak";
				list.addElement(listMezua);
				lblErositakoa.setText("FALTA DEN DIRUA");
			}
			if (bueltak[0]=="") {
				kenketaMetodo = Controlador.Metodoak.kenketa(textDiruTot.getText(), textOrdainketa.getText());
				textOrdainketa.setText("");
				listMezua = "Dirua falta da";
				list.addElement(listMezua);
				textDiruTot.setText(kenketaMetodo);
				lblErositakoa.setText("FALTA DEN DIRUA");
				btnEzabatu.setEnabled(true);
				btnErosi.setEnabled(false);
				btnAurrera.setEnabled(false);
			}
			if (bueltak[0]!="") {
				textDiruTot.setText("0");
				for(int i=0;i<bueltak.length;i++) {
					list.addElement(bueltak[i]);
				}
				btnAurrera.setEnabled(true);
				btnErosi.setEnabled(false);
				btnEzabatu.setEnabled(false);
			}
			
				
			
			
			}
			
			};
		
		btnErosi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnErosi.addActionListener(alBErosi);		
		btnErosi.setBounds(329, 266, 91, 145);
		getContentPane().add(btnErosi);
		btnErosi.setEnabled(false);
		
		
		listBueltak.setBounds(22, 150, 270, 261);
		
		getContentPane().add(listBueltak);
		
		alBAurrera = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				MetodoakVista.seigarrenera();
				dispose();
			}
		};
		btnAurrera.setEnabled(false);
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setBounds(518, 373, 91, 38);
		getContentPane().add(btnAurrera);
		
		alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					MetodoakVista.laugarrenera(geltoki, linea, codBush);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				dispose();
			}
		};
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.setBounds(0, 0, 89, 30);
		getContentPane().add(btnAtzera);
		
		
		
	}
}
