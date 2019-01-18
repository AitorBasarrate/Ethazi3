package Modelo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.w3c.dom.CDATASection;

public class DB {
	private String maquina = "localhost/ethazi3";
	private String usuario = "root";
	private String clave = "";
	private int puerto = 3306;
	private String servidor = "";
	private static Connection conexion = null;

	// CONSTRUCTOR
	// Recibe el nombre de la base de datos
	public DB(String baseDatos) {
		this.servidor = "jdbc:mysql://" + this.maquina + ":" + this.puerto + "/" + baseDatos;

		// Registrar el driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR AL REGISTRAR EL DRIVER");
			System.exit(0); // parar la ejecución
		}

		// Establecer la conexión con el servidor
		try {
			conexion = (Connection) DriverManager.getConnection("jdbc:mysql://" + this.maquina, this.usuario,
					this.clave);
		} catch (SQLException e) {
			System.err.println("ERROR AL CONECTAR CON EL SERVIDOR");
			System.exit(0); // parar la ejecución
		}
		System.out.println("Conectado a " + baseDatos);
	}

	// Devuelve el objeto Connection que se usará en la clase Controller
	public static Connection getConexion() {
		return conexion;
	}

	{
		// /* INTENTAR IMPRIMIR LOS DATOS DE LA BASE */
		//
		// try {
		// // Cargar el driver
		// Class.forName("com.mysql.jdbc.Driver");
		//
		// // Se obtiene una conexion con la base de datos.
		// // En este caso nos conectamos a la base de datos newdatabase
		// // con el usuario root y contra null
		// conexion = (Connection)
		// DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
		//
		// // Se crea un Statement, para realizar la consulta
		// Statement s = (Statement) ((java.sql.Connection) conexion).createStatement();
		//
		// // Se realiza la consulta. Los resultados se guardan en el ResultSet rs
		//
		// ResultSet rs = ((java.sql.Statement) s).executeQuery("select Id_alumno,
		// Nombre from alumnos");
		//
		// // Se recorre el ResultSet, mostrando por pantalla los resultados.
		// while (rs.next()) {
		// System.out.println(rs.getString("Id_alumno") + "\t\t " +
		// rs.getString("Nombre"));
		// }
		// } catch (SQLException e) {
		// System.out.println(e.getMessage());
		// } catch (ClassNotFoundException e) {
		// System.out.println(e.getMessage());
		// } finally { // Se cierra la conexion con la base de datos.
		// try {
		// if (conexion != null) {
		// ((ResultSet) conexion).close();
		// }
		// } catch (SQLException ex) {
		// System.out.println(ex.getMessage());
		// }
		// }
		// /* INTENTAR IMPRIMIR LOS DATOS DE LA BASE */
	}
}