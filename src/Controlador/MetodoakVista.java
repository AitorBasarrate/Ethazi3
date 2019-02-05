package Controlador;

import java.util.ArrayList;

import Modelo.Kontsulta;
import Vista.AteraBilletea;
import Vista.Azkena;
import Vista.Geltokiak;
import Vista.Lehena;
import Vista.Lineak;
import Vista.Ordainketa;
import Vista.SaioaHasi;
import Vista.Error;

public class MetodoakVista {

	public static void bueltatuLehena() {
		Lehena lehena = new Lehena();
		lehena.setVisible(true);
		lehena.setBounds(300, 100, 642, 467);
	}

	public static void bigarrenera() {
		SaioaHasi saioaHasi = new SaioaHasi();
		saioaHasi.setVisible(true);
		saioaHasi.setBounds(300, 100, 642, 467);
	}

	public static void hirugarrenera() {
		Lineak lineak = new Lineak();
		lineak.setVisible(true);
		lineak.setBounds(300, 100, 642, 467);
	}

	public static void laugarrenera(ArrayList geltoki, String linea) {
		Geltokiak geltokiak = new Geltokiak(geltoki, linea);
		geltokiak.setVisible(true);
		geltokiak.setBounds(300, 100, 642, 467);
	}

	public static void bostgarrenera(ArrayList geltoki, String linea) {
		Ordainketa ordainketa = new Ordainketa(geltoki, linea);
		ordainketa.setVisible(true);
		ordainketa.setBounds(300, 100, 642, 467);
	}

	public static void seigarrenera() {
		AteraBilletea ateraBilletea = new AteraBilletea();
		ateraBilletea.setVisible(true);
		ateraBilletea.setBounds(300, 100, 642, 467);
	}

	public static void azkenera() {
		Azkena azkena = new Azkena();
		azkena.setVisible(true);
		azkena.setBounds(300, 100, 642, 467);
	}
	
	public static void errorea() {
		Error error = new Error();
		error.setVisible(true);
		error.setBounds(450, 200, 321, 233);
	}
	//Mi idea es llamar al metodo desde aqui, 
	//pero no tengo muy claro que vaya a funcionar, 
	//aunque creo que no van mal los tiros.
	public static ArrayList aukeratuLinea(String linea) {
		ArrayList gelt = new ArrayList();
		gelt = Kontsulta.lineaAukeratu(linea);
//		Geltokiak.getGelt(gelt, null);
		return gelt;
//			PantailaratuGeltokiak (gelt); 
	}
	
	public static String lineaIzenaAukeratu(String linea) {
		String izena="";
		izena=Kontsulta.lineaIzena(linea);
		return izena;
	}
	public static void getGelt() {
		
	}

//	public static void PantailaratuGeltokiak(ArrayList gelt) {
//		ArrayList Geltokiak = new ArrayList();
//		
//	}
}