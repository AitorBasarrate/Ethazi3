package Modelo;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Controlador.Autobusa;
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
	public static void lineaAukeratu() {
		Connection conexion = null;
		Statement s = null;
		ArrayList <Cliente> inicioSes = new ArrayList<Cliente>();
		try {
			//Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
			s = (Statement) conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs
			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT l.Cod_Linea, p.Nombre, Calle FROM linea l,parada p,linea_parada lp WHERE l.Cod_Linea = lp.Cod_Linea AND P.Cod_Parada = lp.Cod_Parada AND l.Nombre LIKE 'Termibus-Balmaseda'");
			while (rs.next()) {
				String CodLinea_;
				CodLinea_ = rs.getString("Cod_Linea");
				String nombre_;
				nombre_ = rs.getString("Nombre");
				String calle_;
				calle_= rs.getString("Calle");
				
//				Cliente c1 = new Cliente(CodLinea_, nombre_, apellido_, sexo_, contraseña_, fecha_nac_);
//				inicioSes.add(0, c1);
				System.out.println(Kontsulta.toStringAuk(CodLinea_, nombre_, calle_));
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
		String imprimaki =  "Kontsulta [NAN: " + Dni 
		+ " IZENA: " + Nombre 
		+ " KALEA: " + Calle + " ]";
		return imprimaki;
	}
	public static String toString3(Autobusa Autobusa, String Cod_Bus, String N_plazas, String Consumo_km, String Color) {
		return "Kontsulta [AUTOBUSAREN KODEA: " + Cod_Bus
		+ " JESARLEKUAK: " + N_plazas 
		+ " KONTSUMOA KMko: " + Consumo_km 
		+ " KOLOREA: " + Color;
	}
	public static String toString4(parada parada, String Cod_Parada, String Nombre, String Calle, String Latitud, String Longitud) {
		return "Kontsulta [NAN: " + Cod_Parada 
				+ " Izena: " + Nombre 
				+ " Kalea: " + Calle 
				+ " Latitudea: " + Latitud 
				+ " Longitudea: " + Longitud + " ]";
	}
}
