package Controlador;


import Modelo.DB;
import Modelo.Kontsulta;

public class Aplikazioa {
/**
 * @author talde4
 * @param args
 */
	public static void main(String[] args) {

		

		String basedatos = "ethazi3";
		DB con1 = new DB(basedatos);

		con1.getConexion();

	
		con1.getConexion();
		System.out.println("Empieza el metodo.");// COMPROBACION PARA EL METODO.
	

		Vista.Lehena ejecutar = new Vista.Lehena();
		ejecutar.setVisible(true);
	}
	
	

	

}
