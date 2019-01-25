package Modelo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import Controlador.Autobusa;
import Controlador.Cliente;
import Controlador.Linea;

public class Kontsulta {
//	static String Col_1 = "";
//	static String Col_2 = "";
	



	public static ArrayList<Linea> getDatuakArr(ArrayList<Linea> Datuak) {

		return Datuak;
	}
	
	public static ArrayList<Cliente> getInicioSes(ArrayList<Cliente> inicioSes){
		return inicioSes;
	}

	public static void inicioSesion() {
		Connection conexion = null;
		Statement s = null;
		ArrayList <Cliente> inicioSes = new ArrayList<Cliente>();
		try {
			//Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
			s = (Statement) conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs
			ResultSet rs = ((java.sql.Statement) s).executeQuery("select * from cliente");
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
				
				Cliente c1 = new Cliente(dni_, nombre_, apellido_, sexo_, contraseña_, fecha_nac_);
				inicioSes.add(0, c1);
//				System.out.println(toString2(inicioSes.get(0)));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static String toString1(Linea Linea, String Cod_linea, String Nombre) {
		return "Kontsulta [LINEAREN KODEA: " + Cod_linea + " IZENA: " + Nombre
				+ "]";
	}
//	public static String toString2(Cliente Cliente) {
//		return "Kontsulta [NAN: " + "" + " IZENA: " + Controlador.Cliente.getNombre() + " ABIZENA: " +
//				Controlador.Cliente.getApellido() + " PASAHITZA: " + Controlador.Cliente.getSexo() + " SEXUA: " + Controlador.Cliente.getContraseña() + 
//				" JAIOTZE DATA: " + Controlador.Cliente.getFecha_nac() +" ]";
//	}
//	public static String toString3(Autobusa Autobusa) {
//		return "Kontsulta [AUTOBUSAREN KODEA: " + Controlador.Autobusa.getCod_bus() + " JESARLEKUAK: " + Controlador.Autobusa.getN_plazas() + " KONTSUMOA KMko: " +
//				Controlador.Autobusa.getConsumo_km() + " KOLOREA: " + Controlador.Autobusa.getColor() + " SEXUA: " + Controlador.Cliente.getContraseña() + " ]";
//	}
//	public static String toString4(Cliente Cliente) {
//		return "Kontsulta [DNI: " + Controlador.Cliente.getDni() + " Nombre: " + Controlador.Cliente.getNombre() + " Apellido: " +
//				Controlador.Cliente.getApellido() + " Contraseña: " + Controlador.Cliente.getSexo() + " Sexo: " + Controlador.Cliente.getContraseña() + 
//				" Fecha_nac: " + Controlador.Cliente.getFecha_nac() +" ]";
//	}
}
