package Controlador;


import java.io.File;

import Modelo.DB;

public class Aplikazioa {

	public static void main(String[] args) {
		String basedatos = "ethazi3";
		DB con1 = new DB(basedatos);
		File txartela = new File("../Ethazi3/src/Controlador/txartela");

		con1.getConexion();
		System.out.println("Empieza el metodo ");// COMPROBACION PARA EL METODO.


		Vista.Lehena ejecutar = new Vista.Lehena(txartela);
		ejecutar.setVisible(true);
	}
	
	

	

}
