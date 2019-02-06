package Controlador;

import java.util.concurrent.TimeUnit;

import Modelo.DB;

public class Aplikazioa {

	public static void main(String[] args) {
//		Vista v = new Vista();
//		Modelo m = new Modelo();
//		Controlador c = new Controlador(v, m);

		String basedatos = "ethazi3";
		DB con1 = new DB(basedatos);
		con1.getConexion();

		System.out.println("Empieza el metodo ");// COMPROBACION PARA EL METODO

		Metodoak.haversineMetodo();
		Metodoak.pasahitzaKomprobaketa();

//		Metodoak.muestraDatos(Cod_linea, Nombre);
//		Kontsulta.guardaCliente();

//		Kontsulta.muestraParada();

		Vista.Lehena ejecutar = new Vista.Lehena();
		ejecutar.setVisible(true);
	}

	

}
