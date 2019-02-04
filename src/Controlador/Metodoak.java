package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import Vista.Lehena;
import Vista.SaioaHasi;
import Controlador.Linea;

public class Metodoak {
	public static double kontTotala = 0;
	static final double BEZ = 0.21;
	protected static double totBezGabe;

	public static boolean nanKomprobaketa(String DNI) {

		
		int i=0;
		ArrayList<Cliente> datosCliente = new ArrayList<Cliente>();
		datosCliente = Modelo.Kontsulta.guardaCliente(); // array bueltatzen duen metodoa deitzen dut eta bere datuak
															// datosClienten gordetzen ditut
		boolean konprobatu = false;
		
		for (Cliente c : datosCliente) { // for each array zeharkatzeko

		if (konprobatu==false) {
			
			if (c.getDni().equals(DNI)) { // komparatzen dut sartzen duten DNI datu basean dagoenarekin
				System.out.println("Correcto");
				konprobatu=true;

			} else {
				System.out.println("falso");
			}
		}
		}
		
		System.out.println("Fin del metodo");// comprobar el metodo
		return konprobatu;
	}

//	public static void sartuOrdainketa(JList list) {
//		DefaultListModel ordaintzekoa = new DefaultListModel();
//		ordaintzekoa.addElement(Controlador.Aplikazioa.totBezGabe + "€");
//		list.setModel(ordaintzekoa);
//	}

	public static void bezKalkulatu() {
		kontTotala = (totBezGabe * BEZ) + totBezGabe;
	}

}