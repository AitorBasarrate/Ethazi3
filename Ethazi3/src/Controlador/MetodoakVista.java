package Controlador;

import Vista.AteraBilletea;
import Vista.Azkena;
import Vista.Geltokiak;
import Vista.Lehena;
import Vista.Lineak;
import Vista.Ordainketa;
import Vista.SaioaHasi;

public class MetodoakVista {
	
	public static void bueltatuLehena() {
		Lehena lehena = new Lehena();
		lehena.setVisible(true);
		lehena.setBounds(0, 0, 635, 455);
	}
	
	public static void bigarrenera() {
		SaioaHasi saioaHasi = new SaioaHasi();
		saioaHasi.setVisible(true);
		saioaHasi.setBounds(0, 0, 635, 455);
	}
	
	public static void hirugarrenera() {
		Lineak lineak = new Lineak();
		lineak.setVisible(true);
		lineak.setBounds(0, 0, 635, 455);
	}

	public static void laugarrenera() {
		Geltokiak geltokiak = new Geltokiak();
		geltokiak.setVisible(true);
		geltokiak.setBounds(0, 0, 635, 455);
	}

	public static void bostgarrenera() {
		Ordainketa ordainketa = new Ordainketa();
		ordainketa.setVisible(true);
		ordainketa.setBounds(0, 0, 635, 455);
	}
	
	public static void sehigarrenera() {
		AteraBilletea ateraBilletea = new AteraBilletea();
		ateraBilletea.setVisible(true);
		ateraBilletea.setBounds(0, 0, 635, 455);
	}
	
	public static void azkenera() {
		Azkena azkena = new Azkena();
		azkena.setVisible(true);
		azkena.setBounds(0, 0, 635, 455);
	}
}
