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
	            
	            ResultSet rs = ((java.sql.Statement) s).executeQuery("select * from linea l,linea_autobus la "
	            		+ " where  l.Cod_Linea = la.Cod_Linea  ");
	            
	            // Se recorre el ResultSet, mostrando por pantalla los resultados.
	            while (rs.next()) {
	                System.out.println(rs.getString("Cod_Linea") + "\t\t " + rs.getString("Nombre") + "\t\t"+ rs.getString("Cod_bus"));
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        } 
  
	      
	}
    
    
    public static void inicioSesion() {
        Connection conexion = null;
    	Statement s = null;
    	String DNI_C = "15236985K";
    	
    	try {
            // Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
        	s =  (Statement) conexion.createStatement();
            
            // Se realiza la consulta. Los resultados se guardan en el ResultSet rs
        	 ResultSet rs = ((java.sql.Statement) s).executeQuery(" select * from cliente");
    		
        	 
        	 while (rs.next()) {
        		 
        		 if(rs.getString("DNI")== DNI_C){
        			 System.out.println("es correcto");
        		 }else {
        			 System.out.println("incorrecto");
        		 }
	               
	            }
    	}catch (Exception e) {
            System.out.println(e.getMessage());
        } 

    	
    	
    	
		
    	
    }
}