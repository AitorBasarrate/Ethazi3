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

		
		Metodoak.nanKomprobaketa(null);
		int mini = 1001;
		int maxi = 1002;
		int rndm = Metodoak.generaNumeroAleatorio(mini, maxi);
		System.out.println(rndm);

		Metodoak.haversineMetodo();
		Metodoak.pasahitzaKomprobaketa();

//		Kontsulta.guardaCliente();

//		Kontsulta.muestraParada();

		Vista.Lehena ejecutar = new Vista.Lehena();
		ejecutar.setVisible(true);
	}

	

}
