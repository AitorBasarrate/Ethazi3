package Controlador;

import java.sql.ResultSet;
import java.util.ArrayList;

import Modelo.Kontsulta;

public class Linea {

	private static String Cod_Linea;
	private static String Nombre;

	public Linea(String Cod_Linea, String Nombre) {

	}

	public static void rellenar(ArrayList<String> LineaArray, String Cod_Linea, String Nombre) {
		for (int i = 0; i < LineaArray.size() - 1; i++) {
			Cod_Linea = LineaArray.get(0);
			Nombre = LineaArray.get(1);
		}
	}

	public static String getCod_Linea() {
		return Cod_Linea;
	}

	public static void setCod_Linea(String Cod_Linea) {
		Cod_Linea = Cod_Linea;
	}

	public static String getNombre() {
		return Nombre;
	}

	public static void setNombre(String Nombre) {
		Nombre = Nombre;
	}
}
