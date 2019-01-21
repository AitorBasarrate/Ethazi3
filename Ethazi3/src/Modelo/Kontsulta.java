package Modelo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Kontsulta {

	
	
    
    public static void muestraDatos(){
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
	          	s =  conexion.createStatement();
	            
	            // Se realiza la consulta. Los resultados se guardan en el ResultSet rs
	            
	            ResultSet rs = ((java.sql.Statement) s).executeQuery("select * from autobus");
	            
	            // Se recorre el ResultSet, mostrando por pantalla los resultados.
	            while (rs.next()) {
	                System.out.println(rs.getString("Cod_bus") + "\t\t " + rs.getString("N_plazas"));
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        } 
  
	      
	}
}
