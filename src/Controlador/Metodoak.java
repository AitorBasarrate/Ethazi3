package Controlador;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import Modelo.Kontsulta;

public class Metodoak {
	
	public static double kontTotala = 0;
	static final double BEZ = 0.21;
	protected static double totBezGabe;

	public static boolean nanKomprobaketa(String DNI)  {

		ArrayList<Cliente> datosCliente = new ArrayList <Cliente> ();
		datosCliente = Modelo.Kontsulta.guardaCliente(); // array bueltatzen duen metodoa deitzen dut eta bere datuak datosClienten gordetzen ditut
		System.out.println("array");
		
		boolean konprobatu = false;
	
		for (Cliente c: datosCliente) { // for each array zeharkatzeko


			System.out.println("inicio"); // comprobar si entra en el metodo

		if (konprobatu==false) {

			
			if (c.getDni().equals(DNI)) { // komparatzen dut sartzen duten DNI datu basean dagoenarekin
				//System.out.println("Correcto");
				konprobatu=true;

			} else {
				//System.out.println("falso");
			}
		}
		}
		
		System.out.println("Fin del metodo");// comprobar el metodo
		return konprobatu;
	}
	
public static boolean pasahitzaKomprobaketa(String pasahitza) {

		int i=0;
		ArrayList<Cliente> datosCliente = new ArrayList<Cliente>();
		datosCliente = Modelo.Kontsulta.guardaCliente(); // array bueltatzen duen metodoa deitzen dut eta bere datuak
															// datosClienten gordetzen ditut
		boolean konprobatu = false;
		
		for (Cliente c : datosCliente) { // for each array zeharkatzeko

		if (konprobatu==false) {
			
			if (c.getContraseña().equals(pasahitza)) { // komparatzen dut sartzen duten DNI datu basean dagoenarekin
				System.out.println("Correcto");
				konprobatu=true;

			} else {
				System.out.println("falso");
			}
		}
		}
		
		System.out.println("Fin del metodo");// comprobar el metodo
		return konprobatu;
	}
	

	public static int generaNumeroAleatorio(int minimo,int maximo){
        
	       int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
	       return num;
	   }
	
//	public static double litroKilometroko(double distanzia) {
//		€ = distantzia * 
//		return distantzia * 2;
//	}



	public static void sartuOrdainketa(JList list) {
		DefaultListModel ordaintzekoa = new DefaultListModel();
		ordaintzekoa.addElement(totBezGabe + "€");
		list.setModel(ordaintzekoa);
	}

	public static void bezKalkulatu() {
		kontTotala = (totBezGabe * BEZ) + totBezGabe;
	}
	

	public static String[] diruarenBueltak(String emaitza, String ordainketa) {// emaitza balioa main-etik hartu
		double DoubleTextDiruTot = Double.parseDouble(emaitza);
		DoubleTextDiruTot = DoubleTextDiruTot*100;
		DoubleTextDiruTot = Math.round(DoubleTextDiruTot);
		
		double DoubleTextOrdainketa = Double.parseDouble(ordainketa);
		DoubleTextOrdainketa = DoubleTextOrdainketa*100;
		DoubleTextOrdainketa = Math.round(DoubleTextOrdainketa);
		

		double[] array = new double[14];
		// Dena zentimoetan jarri
		array[0] = 1;
		array[1] = 2;
		array[2] = 5;
		array[3] = 10;
		array[4] = 20;
		array[5] = 50;
		array[6] = 100;
		array[7] = 200;
		array[8] = 500;
		array[9] = 1000;
		array[10] = 2000;
		array[11] = 5000;
		array[12] = 10000;
		array[13] = 20000;
		double bueltak;
		String[] arrayBueltak = new String[10];
		double buelta;
		String bueltaString;
		int j = 0;
		

		// double ordainketa;

		// System.out.println("Sartu dirua: ");
		// ordainketa = sc.nextDouble();

		do {
			if (DoubleTextOrdainketa < 0) {
				System.out.println("Sartu zenbaki positibo bat:");

			}
		} while (DoubleTextOrdainketa < 0);

		bueltak = DoubleTextOrdainketa - DoubleTextDiruTot;
		bueltak = bueltak/100;

		// Begiratu ea diru nahiko sartu duen edo bueltak eman behar diogun

		if (bueltak < 0) {
			arrayBueltak[0] = "";
			/*
			 * do { bueltak=-bueltak;
			 * System.out.println("Falta zaizkizu: "+bueltak+" euro");
			 * System.out.println("Sartu falta den dirua:"); emaitza=bueltak;
			 * 
			 * do { if (ordainketa<0) { System.out.println("Sartu zenbaki positibo bat:");
			 * 
			 * } }while (ordainketa<0); bueltak=ordainketa-emaitza; }while (bueltak!=0 &&
			 * bueltak < 0);//errepikatu 0 baino handiagoa edo berdina den zenbaki bat sartu
			 * harte
			 */
		}
		// galdetu bueltak dauden ala ez
		if (bueltak == 0) {
			System.out.println("Ez daude bueltak");
			arrayBueltak[0] = "0";
		} else
			System.out.println("Bueltak:");
		// Bueltak eman

		if (bueltak > 0) {
			bueltak = bueltak * 100;// bueltak zentimoetan jarri
			do {
				// begiratu noiz bueltak handiagoak diren, horrela bueltei zenbaki hurbilena
				// pantailaratuko du
				for (int i = 13; i >= 0; i--) {

					if (bueltak >= array[i]) {
						bueltak = bueltak - array[i];// bueltei kendu pantailaratuko den balioa
						buelta = array[i] / 100;
						bueltaString = Double.toString(buelta);
						arrayBueltak[j] = bueltaString;
						System.out.println(arrayBueltak[j]);
						j++;
						break;
					}
				}
				if (bueltak<1)
					bueltak=0;
			} while (bueltak != 0);// errepikatu prozesu hau bueltak 0 izan harte

		}
		

		return arrayBueltak;// main-era bidali buelten zerrenda
	}/* metodo bueltak */

	public static String kenketa(String diruTot, String ordainketa) {

		double doubleDiruTot = Double.parseDouble(diruTot);
		doubleDiruTot = doubleDiruTot*100;
		doubleDiruTot = Math.round(doubleDiruTot);
		
		double doubleOrdainketa = Double.parseDouble(ordainketa);
		doubleOrdainketa = doubleOrdainketa*100;
		doubleOrdainketa = Math.round(doubleOrdainketa);
		
		double emaitza = doubleDiruTot - doubleOrdainketa;
		emaitza = emaitza/100;
		String stringEmaitza = Double.toString(emaitza);
		
		return stringEmaitza;
	}

	public static void bostSegundo() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	
	//DISTANTZIA KALKULATZEKO METODOA 
	
	public static double haversineMetodo(String linea, String geltokiGordeHelmuga,  String geltokiGordeHasiera) {
		
		   final int R = 6371; // Radious of the earth
		   
		   String lati2 = Modelo.Kontsulta.paradaLatitud2lortu(linea,  geltokiGordeHelmuga);   //guarda la latitud
		   String lati1 = Modelo.Kontsulta.paradaLatitud2lortu(linea,  geltokiGordeHasiera);   //guarda la latitud
		   String longi1 = Modelo.Kontsulta.paradaLongitud1lortu(linea, geltokiGordeHasiera);//GUARDA LA LONGITUD
		   String longi2 = Modelo.Kontsulta.paradaLongitud2lortu(linea, geltokiGordeHelmuga); // GUARDA LA LOngitud
		   
		   double lat1 ;
		   lat1 = Double.valueOf(lati1);
		   System.out.println(lat1+ " comprobacion");
		   double lat2 ;
		   lat2 = Double.valueOf(lati2);
		   System.out.println(lat2 + " comprobacion");
		   double lon1 ;
		   lon1 = Double.valueOf(longi1);
		   System.out.println(lon1 + " comprobacion");
		   double lon2 ;
		   lon2 = Double.valueOf(longi2);
		   System.out.println(lon2 + " comprobacion");
		
      Double latDistance = toRad(lat2-lat1);
      Double lonDistance = toRad(lon2-lon1);
  
      Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + 
                 Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) * 
                 Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
      
      Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
      
      Double distance = R * c;
 
      System.out.println("bi paraden arteko distantzia " + Math.round(distance)+ "m");

		return distance;
		
		
	}
	
	//RADIANA EGITEKO

	private static Double toRad(double value) {
		return value * Math.PI / 180;
	}

	//PREZIOA KALKULATZEKO METODOA
	
		public static double prezioaKalk(String linea, int contagailu, ArrayList geltoki, String geltokiGordeHelmuga,  String geltokiGordeHasiera, int codBush) {

			double distantzia = haversineMetodo(linea,  geltokiGordeHelmuga,   geltokiGordeHasiera); //metodoaren balioa artzen du
	
			System.out.println(Math.round(distantzia) + " distantzia"); //borobildu distantzias
			
			double kontsumoa = Kontsulta.autobusa(codBush);  //hartu behar dugu datu basetik
			System.out.println(kontsumoa + " kontsumoa");
			final double gasolinaPrezioa = 0.80; 			//beti berdina gasolinaren prezioa da
			final double onura = 0.20; 						//beti berdina emprezak ezartzen duen onura
			double empresaOnura;							//formulatik ateratzen da empresaren onurarekin
			double pertsonaKantitate = Kontsulta.autobusPertsonaKantitatea(codBush);	//autobusean dauden pertsona kant datubasetik ateratzen da
			System.out.println(pertsonaKantitate + " pertsona kant");
			double prezioFinala;								//pertsona bakoitzak ordaindu behar duena
		
			
			
			//FORMULA
			
			double autobusgastua = gasolinaPrezioa * kontsumoa; 
				System.out.println(autobusgastua);
			double bidaiGastua = distantzia * autobusgastua;
				System.out.println(bidaiGastua);
			double irabaziak = bidaiGastua * onura;
			
			 empresaOnura =bidaiGastua + irabaziak;
				System.out.println(empresaOnura);
			 prezioFinala = empresaOnura / pertsonaKantitate;
			 	System.out.println(pertsonaKantitate);
			prezioFinala = (prezioFinala) * contagailu;	
				System.out.println("zure billetearen prezioa :"+ prezioFinala + " € koa da");
		
			return prezioFinala;
		}

	
	/*Metodo encriptar*/
	public static String getMD5(String input) {
		 try {
		 MessageDigest md = MessageDigest.getInstance("MD5");
		 byte[] messageDigest = md.digest(input.getBytes());
		 BigInteger number = new BigInteger(1, messageDigest);
		 String hashtext = number.toString(16);

		 while (hashtext.length() < 32) {
		 hashtext = "0" + hashtext;
		 }
		 
		 return hashtext;
		 }
		 catch (NoSuchAlgorithmException e) {
		 throw new RuntimeException(e);
		 }
		 }

}