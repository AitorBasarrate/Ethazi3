package Controlador;


import Modelo.DB;
import Modelo.Kontsulta;

public class Aplikazioa {

	public static void main(String[] args) {
		System.out.println("Pito");
		String basedatos = "ethazi3";
		DB con1 = new DB(basedatos);
		con1.getConexion();
		
		System.out.println("Empieza el metodo.");// COMPROBACION PARA EL METODO.
		Kontsulta.guardaCliente();
		MetodoakVista.fitxeroIrak();
		
		
		Vista.Lehena ejecutar = new Vista.Lehena();
		ejecutar.setVisible(true);
	}
	
	

	

}
