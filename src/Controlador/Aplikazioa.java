package Controlador;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import Modelo.DB;

public class Aplikazioa {

	public static void main(String[] args) {

		String basedatos = "ethazi3";
		DB con1 = new DB(basedatos);
		con1.getConexion();
	System.out.println("Hola");
		Vista.Lehena ejecutar = new Vista.Lehena();
		ejecutar.setVisible(true);
	}
	
	

	

}
