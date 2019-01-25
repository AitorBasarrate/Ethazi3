package Controlador;

import Vista.Lehena;
import Vista.SaioaHasi;

public class MetodoakVista {
	public static double kontTotala = 0;
	static final double BEZ = 0.21;
	protected static double totBezGabe;
	
	public static void LehenaBigarren(Lehena lehena, SaioaHasi saioaHasi ) {
		Lehena Lehena = new Lehena();
		Lehena.setVisible(false);
		saioaHasi.setVisible(true);
		//Lehena.setBounds(0, 0, 700, 500);
		//contentPane.add(Lehena);
		saioaHasi.setBounds(0, 0, 635, 455);
 
	}
	
	

}
