package Controlador;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.w3c.dom.CDATASection;

import Modelo.DB;

public class Aplikazioa {

	public static void main(String[] args) {
		String basedatos = "ethazi3";
		DB con1 = new DB(basedatos);
		con1.getConexion();
		
		
		  CDATASection conexion = null;
	}
    

}