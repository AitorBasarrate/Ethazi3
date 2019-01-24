package Controlador;

import java.util.ArrayList;

public class Metodoak {

	private static String dNI;

	public static void nanKomprobaketa() {
		String DNI = " 15236985K";
		ArrayList<Cliente> inicioSes = new ArrayList();
		inicioSes = Modelo.Kontsulta.getInicioSes(inicioSes);
		
		for(int n = 0; n < inicioSes.size(); n++) {
			
			System.out.println(inicioSes.contains(DNI));
		}
	}
}
