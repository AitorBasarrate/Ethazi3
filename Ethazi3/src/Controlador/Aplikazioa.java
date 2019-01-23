package Controlador;

import java.util.ArrayList;

import Modelo.DB;
import Modelo.Kontsulta;
 


public class Aplikazioa {
	
	public static void main(String[] args) {
		ArrayList <String> LineaArray = new ArrayList();
		ArrayList<Datuak_Linea> Datuak = null;
//		LineaArray = Kontsulta.arrayRecoBeteta(Datuak);
		
//		Linea l1 = new Linea("", "");
		System.out.println(Modelo.Kontsulta.getDatuakArr(Datuak));
		
		
		
		
		String basedatos = "ethazi3";
		DB con1 = new DB(basedatos);
		con1.getConexion();
		
		Kontsulta.muestraDatos();
	}

}