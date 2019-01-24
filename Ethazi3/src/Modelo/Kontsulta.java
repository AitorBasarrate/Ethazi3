package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;


import Controlador.Linea;

public class Kontsulta {
//	static String Col_1 = "";
//	static String Col_2 = "";
	static ArrayList<Linea> Datuak = new ArrayList();

	public static void muestraDatos() {

		Connection conexion = null;
		java.sql.Statement s = null;
		try {
			// Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");

			// Se obtiene una conexion con la base de datos.
			// En este caso nos conectamos a la base de datos ethazi3
			// con el usuario root y contra null
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");

			// Se crea un Statement, para realizar la consulta
			s = conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs

			ResultSet rs = ((java.sql.Statement) s).executeQuery("select * from linea");

			// Se recorre el ResultSet, mostrando por pantalla los resultados.
			while (rs.next()) {
				String CodLinea = "";
				String Nombre_ = "";
				CodLinea = rs.getString("Cod_Linea");
				Controlador.Linea.setCod_Linea(rs.getString("Cod_Linea"));
				Nombre_ = rs.getString("Nombre");
				Controlador.Linea.setNombre(rs.getString("Nombre"));
				Linea LineaDat1 = new Linea("L1", "kaka");
				Datuak.add(0, LineaDat1);
				System.out.println(toString(Datuak.get(0)));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static ArrayList<Linea> getDatuakArr(ArrayList<Linea> Datuak) {

		return Datuak;
	}

//	public static void inicioSesion() {
//		Connection conexion = null;
//		Statement s = null;
//		String DNI_C = "15236985K";
//
//		try {
//			// Cargar el driver
//			Class.forName("com.mysql.jdbc.Driver");
//			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
//			s = (Statement) conexion.createStatement();
//
//			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs
//			ResultSet rs = ((java.sql.Statement) s).executeQuery(" select * from cliente");
//
//			while (rs.next()) {
//
//				if (rs.getString("DNI") == DNI_C) {
//					System.out.println("es correcto");
//				} else {
//					System.out.println("incorrecto");
//				}
//
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

//	}

	public static String toString(Linea Linea) {
		return "Kontsulta [Cod_Linea: " + Controlador.Linea.getCod_Linea() + " Nombre: " + Controlador.Linea.getNombre()
				+ "]";
	}
}
