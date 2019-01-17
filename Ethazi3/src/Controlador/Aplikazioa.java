package Controlador;

import Modelo.DB;

public class Aplikazioa {

	public static void main(String[] args) {
		String basedatos = "ethazi3";
		DB con1 = new DB(basedatos);
		con1.getConexion();
		
		System.out.println("me cago en tu vida!");
	}

}