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


	public static void nanKomprobaketa() {
	
	String DNI = "15236985K"; //sartu behar duute gero eskuz
	

		ArrayList<Cliente> datosCliente = new ArrayList <Cliente> ();
		datosCliente = Modelo.Kontsulta.guardaCliente(); // array bueltatzen duen metodoa deitzen dut eta bere datuak datosClienten gordetzen ditut
		System.out.println("array");
		
		for (Cliente c : datosCliente) {   //for each array zeharkatzeko
			
			
			System.out.println("inicio"); //comprobar si entra en el metodo
		
				if(c.getDni().equals(DNI)) {   //komparatzen dut sartzen duten DNI datu basean dagoenarekin
					System.out.println("Correcto");
					
				}else {
					System.out.println("falso");
				}
		}	
		System.out.println("Fin del metodo");// comprobar el metodo 
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

	private static Double toRad(double value) {
		return value * Math.PI / 180;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
