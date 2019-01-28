package Controlador;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Metodoak {
	public static double kontTotala = 0;
	static final double BEZ = 0.21;
	protected static double totBezGabe;
	Linea LineaDat1 = new Linea("","");
//	private static String dNI;

	public static void nanKomprobaketa() {
//		String DNI = " 15236985K";
		ArrayList<Cliente> inicioSes = new ArrayList();
		inicioSes = Modelo.Kontsulta.getInicioSes(inicioSes);
		
		for(int n = 0; n < inicioSes.size(); n++) {
//			if(inicioSes.contains(Controlador.Cliente.getDni())) {
				
			}
			
		}
//	}
	
	public static void muestraDatos(String Cod_linea, String Nombre, Linea LineaDat1) {
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
				DatuakLinea.add(0, LineaDat1);
				System.out.println(Modelo.Kontsulta.toString1(LineaDat1.getCod_Linea(), LineaDat1.getNombre()));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	
//	public static void sartuOrdainketa(JList list) {
//		DefaultListModel ordaintzekoa = new DefaultListModel();
//		ordaintzekoa.addElement(Controlador.Aplikazioa.totBezGabe + "€");
//		list.setModel(ordaintzekoa);
//	}

//	public static void bezKalkulatu() {
//		kontTotala = (totBezGabe * BEZ) + totBezGabe;
//	}
	
public static void nanKomprobaketa(ArrayList <Cliente> inicioSes) {
		
		String DNI = " 15236985K";

		
		
		System.out.println("METODO COMPROBAR DNI");
		
			if(inicioSes.contains(DNI)) {
				System.out.println( " DNI INTRODUCIDO " + DNI +" CORRECTO");
			}else {
				System.out.println(" DNI INTRODUCIDO " + DNI +" Incorrecto");
			}
		
			
		
	}


public static ArrayList<Cliente> getInicioSes(ArrayList<Cliente> inicioSes){
	return inicioSes;
}
	
}
