package Modelo;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Controlador.Cliente;
import Controlador.Linea;
import Controlador.parada;

public class Kontsulta {
//	static String Col_1 = "";
//	static String Col_2 = "";
	



	public static ArrayList<Linea> getDatuakArr(ArrayList<Linea> Datuak) {

		return Datuak;
	}
	
	public static ArrayList<Cliente> getInicioSes(ArrayList<Cliente> inicioSes){
		return inicioSes;
	}
	public static void muestraLinea(String Cod_linea, String Nombre) {
		ArrayList<Linea> DatuakLinea = new ArrayList();
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
				String CodLinea_ = "";
				String Nombre_ = "";
				CodLinea_ = rs.getString("Cod_Linea");
				Nombre_ = rs.getString("Nombre");
				Linea LineaDat1 = new Linea(CodLinea_, Nombre_);
				DatuakLinea.add(0, LineaDat1);
				System.out.println(Modelo.Kontsulta.toString1(DatuakLinea.get(0), CodLinea_, Nombre_));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static void guardaCliente() {
		Connection conexion = null;
		Statement s = null;
		ArrayList <Cliente> inicioSes = new ArrayList<Cliente>();
		try {
			//Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
			s = (Statement) conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs
			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT * FROM CLIENTE");
			while (rs.next()) {
				String dni_;
				dni_ = rs.getString("DNI");
				String nombre_;
				nombre_ = rs.getString("Nombre");
				String apellido_;
				apellido_= rs.getString("Apellidos");
				String sexo_;
				sexo_ = rs.getString("Sexo");
				String contraseña_;
				contraseña_ = rs.getString("Contraseña");
				String fecha_nac_;
				fecha_nac_ = rs.getString("Fecha_nac");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static ArrayList lineaAukeratu(String linea) {
		Connection conexion = null;
		Statement s = null;
		Object nombre_ = null;
		ArrayList <parada> geltokiak = new ArrayList();
		
		try {
			//Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
			s = (Statement) conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs
			
			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT p.Nombre FROM linea l,parada p,linea_parada lp WHERE l.Cod_Linea = lp.Cod_Linea AND p.Cod_Parada = lp.Cod_Parada AND l.Cod_Linea LIKE '" + linea + "'");
			while (rs.next()) {
				parada Termibus_Bilbao = new parada(1, "Termibus-Bilbao", "Luis Briñas", 43.2614, -2.94974);
				parada Metro_Leioa = new parada(3, "Metro Leioa", "Otsobarrena", 43.3191, -2.99149);
				parada Metro_Berango = new parada(4, "Metro Berango", "Sabino Arana", 43.367, -2.99921);
				parada Metro_Larrabasterra = new parada (5, "Metro Larrabasterra", "BI-634", 43.3759, -2.99183);
				parada Ayuntamiento_Sopelana = new parada (6, "Ayuntamiento_Sopelana", "Sabino Arana", 43.3814, -2.98109);
				parada Asilo_Barrika = new parada (7, "Asilo_Barrika", "BI-634", 43.4055, -2.96369);
				parada Ayuntamiento_Plentzia = new parada (8, "Ayuntamiento Plentzia", "Erribera", 43.4045, -2.94967);
				parada Barakaldo_Sagrado_Corazón = new parada (9, "Barakaldo - Sagrado Corazón", "N-634", 43.2833, -2.99605);
				parada Ayuntamiento_Trapaga = new parada (10, "Ayuntamiento Trapaga", "Rufino Olaso", 43.3035, -3.03873);
				
				geltokiak.add(0, Termibus_Bilbao);
				geltokiak.add(1, Metro_Leioa);
				geltokiak.add(2, Metro_Berango);
				geltokiak.add(3, Metro_Larrabasterra);
				geltokiak.add(4, Ayuntamiento_Sopelana);
				geltokiak.add(5, Asilo_Barrika);
				geltokiak.add(6, Ayuntamiento_Plentzia);
				geltokiak.add(7, Barakaldo_Sagrado_Corazón);
				geltokiak.add(8, Ayuntamiento_Trapaga);
//Hemen sortzen dut arraylist bat, geltoki bakoitzagatik objektu bat sartzen dut arraylistean.
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return geltokiak;
	}
	
	public static void muestraParada() {
		Connection conexion = null;
		Statement s = null;
		try {
			//Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
			s = (Statement) conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs
			
			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT p.Nombre FROM parada p, linea l, linea_parada lp WHERE p.Cod_Parada = lp.Cod_Parada AND l.Cod_Linea = lp.Cod_Linea AND l.Cod_Linea LIKE 'L1'");
			while (rs.next()) {
//				String CodLinea_;
//				CodLinea_ = rs.getString("Cod_Linea");
				String nombre_;
				nombre_ = rs.getString("Nombre");
//				String calle_;
//				calle_= rs.getString("Calle");
				
				Kontsulta.toStringPar(nombre_);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String toString1(Linea Linea, String Cod_linea, String Nombre) {
		
		return "Kontsulta [LINEAREN KODEA: " + Cod_linea 
				+ " IZENA: " + Nombre + "]";
	}
	public static String toStringAuk(String Dni, String Nombre, String Calle) {
		String imprimaki =  "Kontsulta [Linea Kodea: " + Dni 
		+ " IZENA: " + Nombre 
		+ " KALEA: " + Calle + " ]";
		return imprimaki;
	}
	public static void toStringPar(String Nombre) {
		System.out.println("Kontsulta [Geltokiaren izena: " + Nombre);
	}
	public static String toString4(parada parada, String Cod_Parada, String Nombre, String Calle, String Latitud, String Longitud) {
		return "Kontsulta [NAN: " + Cod_Parada 
				+ " Izena: " + Nombre 
				+ " Kalea: " + Calle 
				+ " Latitudea: " + Latitud 
				+ " Longitudea: " + Longitud + " ]";
	}
}