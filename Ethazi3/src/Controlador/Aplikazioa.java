package Controlador;
import Modelo.Connect;
public class Aplikazioa {

	public static void main(String[] args) {
		String basedatos = "ethazi3";
		Connect con1 = new Connect(basedatos);
		con1.getConexion();
	}

}