package Controlador;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import Vista.Lehena;
import Vista.SaioaHasi;

public class Metodoak {

//	private static String dNI;

	public static void nanKomprobaketa() {
//		String DNI = " 15236985K";
		ArrayList<Cliente> inicioSes = new ArrayList();
		inicioSes = Modelo.Kontsulta.getInicioSes(inicioSes);
		
		for(int n = 0; n < inicioSes.size(); n++) {
			if(inicioSes.contains(Controlador.Cliente.getDni())) {
				
			}
			
		}
	}
	
//	public static void sartuOrdainketa(JList list) {
//		DefaultListModel ordaintzekoa = new DefaultListModel();
//		ordaintzekoa.addElement(Controlador.Aplikazioa.totBezGabe + "€");
//		list.setModel(ordaintzekoa);
//	}

//	public static void bezKalkulatu() {
//		kontTotala = (totBezGabe * BEZ) + totBezGabe;
//	}
	
	
	
}
