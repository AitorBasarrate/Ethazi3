package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Controlador.Cliente;
import Controlador.Linea;

public class Kontsulta {
//	static String Col_1 = "";
//	static String Col_2 = "";
	static ArrayList<Linea> DatuakLinea = new ArrayList();

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
				Nombre_ = rs.getString("Nombre");
				Linea LineaDat1 = new Linea(CodLinea, Nombre_);
				DatuakLinea.add(0, LineaDat1);
				System.out.println(toString1(DatuakLinea.get(0)));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static ArrayList<Linea> getDatuakArr(ArrayList<Linea> Datuak) {

		return Datuak;
	}

	public static void inicioSesion() {
		Connection conexion = null;
		Statement s = null;
		String DNI_C = "15236985K";
		ArrayList <Cliente> inicioSes = new ArrayList<Cliente>();
		try {
			//Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
			s = (Statement) conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs
			ResultSet rsDNI = ((java.sql.Statement) s).executeQuery("select * from cliente");
			String dni = rsDNI.getString("DNI");
			while (rsDNI.next()) {
				String dni_ = rsDNI.getString(1);
				String nombre_ = rsDNI.getString(2);
				String apellido_ = rsDNI.getString(3);
				String sexo_ = rsDNI.getString(5);
				String contraseña_ = rsDNI.getString(6);
				String fecha_nac_ = rsDNI.getString("Fecha_nac");
				
				Cliente c1 = new Cliente(dni_, nombre_, apellido_, fecha_nac_, contraseña_, sexo_);
				inicioSes.add(0, c1);
				System.out.println(toString2(inicioSes.get(0)));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static String toString1(Linea Linea) {
		return "Kontsulta [Cod_Linea: " + Controlador.Linea.getCod_Linea() + " Nombre: " + Controlador.Linea.getNombre()
				+ "]";
	}
	public static String toString2(Cliente Cliente) {
		return "Kontsulta [DNI: " + Controlador.Cliente.getDni() + " Nombre: " + Controlador.Cliente.getNombre() + "Apellido: " +
				Controlador.Cliente.getApellido() + "Sexo: " + Controlador.Cliente.getSexo() + "Contraseña: " + Controlador.Cliente.getContraseña() + 
				"Fecha_nac: " + Controlador.Cliente.getFecha_nac() +"]";
	}
}
