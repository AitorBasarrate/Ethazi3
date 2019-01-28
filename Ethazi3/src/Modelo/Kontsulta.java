package Modelo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import Controlador.Autobusa;
import Controlador.Cliente;
import Controlador.Linea;
import Controlador.Metodoak;

public class Kontsulta {
	static String Col_1 = "";
	static String Col_2 = "";

	public static ArrayList<Cliente> inicioSesion() {
		ArrayList<Cliente> inicioSes = new ArrayList<Cliente>();
		Connection conexion = null;
		Statement s = null;

		try {
			// Cargar el driver
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
				apellido_ = rs.getString("Apellidos");
				String sexo_;
				sexo_ = rs.getString("Sexo");
				String contraseña_;
				contraseña_ = rs.getString("Contraseña");
				String fecha_nac_;
				fecha_nac_ = rs.getString("Fecha_nac");

				Cliente c1 = new Cliente(dni_, nombre_, apellido_, sexo_, contraseña_, fecha_nac_);
				inicioSes.add(0, c1);

				System.out.println(toString2(inicioSes.get(0)));

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return inicioSes;
	}

	public static ArrayList<Linea> getDatuakArr(ArrayList<Linea> Datuak) {

		return Datuak;
	}

	public static ArrayList<Cliente> getInicioSes(ArrayList<Cliente> inicioSes) {
		return inicioSes;
	}

//
	public static String toString1(String Cod_Linea, String Nombre) {
		String imprimaki = "Kontsulta [LINEAREN KODEA: " + Cod_Linea + " IZENA: " + Nombre + "]";
		return imprimaki;
	}

	public static String toString2(Cliente Cliente, String DNI, String Nombre, String Apellidos, String Fecha_Nac,
			String Sexo, String contraseña) {
		String imprimaki = "Kontsulta [NAN: " + DNI + " IZENA: " + Nombre + " ABIZENA: " + Apellidos + " PASAHITZA: "
				+ Sexo + " SEXUA: " + contraseña + " JAIOTZE DATA: " + Fecha_Nac + " ]";
		return imprimaki;
	}

	public static String toString3(Autobusa Autobusa, String Cod_Bus, String N_plazas, String Consumo_km,
			String color) {
		String imprimaki = "Kontsulta [AUTOBUSAREN KODEA: " + Cod_Bus + " JESARLEKUAK: " + N_plazas
				+ " KONTSUMOA KMko: " + Consumo_km + " KOLOREA: " + color;
		return imprimaki;
	}
}
