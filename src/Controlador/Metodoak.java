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

	public static boolean nanKomprobaketa(String DNI)  {

		ArrayList<Cliente> datosCliente = new ArrayList <Cliente> ();
		datosCliente = Modelo.Kontsulta.guardaCliente(); // array bueltatzen duen metodoa deitzen dut eta bere datuak datosClienten gordetzen ditut
		System.out.println("array");
		
		boolean konprobatu = false;
	
		for (Cliente c: datosCliente) { // for each array zeharkatzeko

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
	
	
	//DISTANTZIA KALKULATZEKO METODOA 
	
	public static double haversineMetodo() {
		
		   final int R = 6371; // Radious of the earth
		   double lat1 = 432614;
		   double lat2 = 43245;
		   double lon1 = -294974;
		   double lon2 =-298991;
		   
		
      Double latDistance = toRad(lat2-lat1);
      Double lonDistance = toRad(lon2-lon1);
  
      Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + 
                 Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) * 
                 Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
      
      Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
      
      Double distance = R * c;
 
      System.out.println("bi paraden arteko distantzia " + Math.round(distance)+ "m");

		return distance;
		
		
	}
	
	//RADIANA EGITEKO

	private static Double toRad(double value) {
		return value * Math.PI / 180;
	}
	
	
	
	
	//PREZIOA KALKULATZEKO METODOA
	
//	public static void prezioaKalk() {
//		
//		double distantzia = haversineMetodo(); //metodoaren balioa artzen du
//		double kontsumoa;  //artu behar dugu datu basetik
//		double erabilitakoLitroak; //bidaian erabili diren litroak
//		final double gasolinaPrezioa = 0.80; //beti berdina gasolinaren prezioa da
//		double kmPrezioa;// formulatik ateratzen da egindako km guztien prezioa
//		final double onura = 0.20; //beti berdina emprezak ezartzen duen onura
//		double empresaOnura;//formulatik ateratzen da empresaren onurarekin
//		double prezioGlobala; // autobus guztiak batera ordaindu behar duena
//		double pertsonaKantitate;//autobusean dauden pertsuna kant datubasetik ateratzen da
//		double prezioFinala;//pertsuna bakoitzak ordaindu behar duena
//		
//		//FORMULA
//		
//		erabilitakoLitroak = distantzia * kontsumoa;
//		kmPrezioa = erabilitakoLitroak * gasolinaPrezioa;
//		empresaOnura = kmPrezioa * onura;
//		prezioGlobala = kmPrezioa + empresaOnura;
//		prezioFinala = prezioGlobala  / pertsonaKantitate;
//		
//		
//		System.out.println("zure billetearen prezioa :"+ prezioFinala + " € koa da");
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}