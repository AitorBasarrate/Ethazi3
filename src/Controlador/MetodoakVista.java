package Controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;

import Modelo.Kontsulta;
import Vista.AteraBilletea;
import Vista.Azkena;
import Vista.Bigarrena;
import Vista.Erregistratu;
import Vista.Geltokiak;
import Vista.Lehena;
import Vista.Lineak;
import Vista.Ordainketa;
import Vista.SaioaHasi;

public class MetodoakVista {
/**
 * Bueltatzeko lehenengo pantailara
 */
	public static void bueltatuLehena() {
		Lehena lehena = new Lehena();
		lehena.setVisible(true);
		lehena.setBounds(550, 200, 642, 467);
	}
/**
 * Pasatzeko bigarren pantailara
 */
	public static void bigarrenera() {
		Bigarrena Bigarrena = new Bigarrena();
		Bigarrena.setVisible(true);
		Bigarrena.setBounds(550, 200, 642, 467);
	}
	
	public static void pasatuSaioHasiera() {
		SaioaHasi SaioaHasi = new SaioaHasi();
		SaioaHasi.setVisible(true);
		SaioaHasi.setBounds(550, 200, 642, 467);
	}
	
	public static void pasatuErregistrora() {
		Erregistratu Erregistratu = new Erregistratu();
		Erregistratu.setVisible(true);
		Erregistratu.setBounds(550, 200, 642, 467);
	}
/**
 * Pasatzeko hirugarren pantailara
 */
	public static void hirugarrenera() {
		Lineak lineak = new Lineak();
		lineak.setVisible(true);
		lineak.setBounds(550, 200, 642, 467);
	}
/**
 * Pasatzeko laugarren pantailara
 * @param geltoki
 * @param linea
 * @param codBush
 * @throws ParseException
 */
	public static void laugarrenera(ArrayList geltoki, String linea, int codBush) throws ParseException {
		Geltokiak geltokiak = new Geltokiak(geltoki, linea, codBush);
		geltokiak.setVisible(true);
		geltokiak.setBounds(550, 200, 642, 467);
	}
/**
 * Pasatzeko bostgarren pantailara
 * @param geltoki
 * @param linea
 * @param prezioFinala
 * @param codBush
 */
	public static void bostgarrenera(ArrayList geltoki, String linea, Double prezioFinala, int codBush) {
		Ordainketa ordainketa = new Ordainketa(geltoki, linea, prezioFinala,codBush);
		ordainketa.setVisible(true);
		ordainketa.setBounds(550, 200, 642, 467);

	}
/**
 * Pasatzeko seigarren pantailara
 */
	public static void seigarrenera() {
		AteraBilletea ateraBilletea = new AteraBilletea();
		ateraBilletea.setVisible(true);
		ateraBilletea.setBounds(550, 200, 642, 467);
	}
/**
 * Pasatzeko azkenengo pantailara
 */
	public static void azkenera() {
		Azkena azkena = new Azkena();
		azkena.setVisible(true);
		azkena.setBounds(550, 200, 642, 467);
	}
/**
 * Linea parametroa hartzen du vistatik eta linearen geltokiak itzultzen ditu
 * @param linea
 * @return gelt
 */
	public static ArrayList aukeratuLinea(String linea) {
		ArrayList gelt = new ArrayList();
		ArrayList busCode = new ArrayList();
		gelt = Kontsulta.lineaAukeratu(linea);

		return gelt;

	}
/**
 * Linea parametroa hartzen du eta bus kodea itzultzen du
 * @param linea
 * @return rndmNum
 */
	public static int bus_lortu(String linea) {
		int rndmNum = 0;
		
		if (linea.equals("L1")) {
			rndmNum = Metodoak.generaNumeroAleatorio(1001, 1003);
			System.out.println(rndmNum);

			
		}

		else if (linea.equals("L2")) {

			rndmNum = Metodoak.generaNumeroAleatorio(2001, 2001);

			
		}

		else if (linea.equals("L3")) {

			rndmNum = Metodoak.generaNumeroAleatorio(3001, 3002);
			System.out.println(rndmNum);

			
		}

		else if (linea.equals("L4")) {

			rndmNum = Metodoak.generaNumeroAleatorio(4001, 4002);
			System.out.println(rndmNum);
		}
		return rndmNum;
	}
/**
 * Fitxeroa irakurtzen du
 */
	public static void fitxeroIrak() {

		File fitxategi = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			fitxategi = new File("../Ethazi3/src/Controlador/txartela");
			fr = new FileReader(fitxategi);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
/**
 * Fitxeroa idazten du
 */
	public static void fitxeroIdat() {

		try (FileWriter fw = new FileWriter("txartela", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println("the text");
			// more code
			out.println("more text");
			// more code
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}
	}
/**
 * Linearen izena itzultzen du
 * @param linea
 * @return izena
 */
	public static String lineaIzenaAukeratu(String linea) {
		String izena = "";
		izena = Kontsulta.linearenIzena(linea);
		return izena;
	}



}