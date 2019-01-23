package Controlador;

import java.util.ArrayList;

import Modelo.DB;
import Modelo.Kontsulta;
 


public class Aplikazioa {
	
	public static void main(String[] args) {
		
		String basedatos = "ethazi3";
		DB con1 = new DB(basedatos);
		con1.getConexion();
		 
		Kontsulta.muestraDatos();
		
		ArrayList <Datuak_Linea> Datuak = new ArrayList();
		
//		Linea l1 = new Linea("", "");
		
		
		
		
		

	}

}