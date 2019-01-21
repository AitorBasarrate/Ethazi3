package Controlador;

import java.awt.EventQueue;
import java.awt.Frame;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.w3c.dom.CDATASection;

import com.mysql.jdbc.Connection;

import Modelo.DB;


public class Aplikazioa {

	public static void main(String[] args) {
		Vista.Frame ejecutar= new Vista.Frame();
		ejecutar.setVisible(true);
		
	}
}
	
		//String basedatos = "ethazi3";
		//DB con1 = new DB(basedatos);
		//con1.getConexion();
		
		
		  //CDATASection conexion = null;
//		  
//		  
//		  
//		  
//		  
//		  /* INTENTAR IMPRIMIR LOS DATOS DE LA BASE */
//
//		  try {
//	            // Cargar el driver
//	            Class.forName("com.mysql.jdbc.Driver");
//
//	            // Se obtiene una conexion con la base de datos.
//	            // En este caso nos conectamos a la base de datos newdatabase
//	            // con el usuario root y contra null
//	            conexion = (CDATASection) DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
//
//	            // Se crea un Statement, para realizar la consulta
//	            Statement s = (Statement) ((java.sql.Connection) conexion).createStatement();
//	            
//	            // Se realiza la consulta. Los resultados se guardan en el ResultSet rs
//	            
//	            ResultSet rs = ((java.sql.Statement) s).executeQuery("select Id_alumno, Nombre from alumnos");
//	            
//	            // Se recorre el ResultSet, mostrando por pantalla los resultados.
//	            while (rs.next()) {
//	                System.out.println(rs.getString("Id_alumno") + "\t\t " + rs.getString("Nombre"));
//	            }
//	        } catch (SQLException e) {
//	            System.out.println(e.getMessage());
//	        } catch (ClassNotFoundException e) {
//	            System.out.println(e.getMessage());
//	        } finally { // Se cierra la conexion con la base de datos.
//	            try {
//	                if (conexion != null) {
//	                    ((ResultSet) conexion).close();
//	                }
//	            } catch (SQLException ex) {
//	                System.out.println(ex.getMessage());
//	            }
//	        }
//		  /* INTENTAR IMPRIMIR LOS DATOS DE LA BASE */
	
	

