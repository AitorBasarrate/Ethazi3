package Controlador;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import Modelo.DB;
import Modelo.Kontsulta;
 


public class Aplikazioa {
	
	public static double kontTotala=0;
	static final double BEZ = 0.21;
	protected static double totBezGabe;
	
	public static void main(String[] args) {
		
		String basedatos = "ethazi3";
		DB con1 = new DB(basedatos);
		con1.getConexion();
		 
		Kontsulta.muestraDatos();
		
		Vista.Frame ejecutar= new Vista.Frame();
		ejecutar.setVisible(true);
	}
	
	public static void sartuOrdainketa(JList list) {
		DefaultListModel ordaintzekoa = new DefaultListModel();
		ordaintzekoa.addElement(Controlador.Aplikazioa.totBezGabe+"€");
		list.setModel(ordaintzekoa);
	}
	
	public static void bezKalkulatu() {
		kontTotala = (totBezGabe * BEZ) + totBezGabe;
	}
	
	public static String[] diruarenBueltak(String emaitza, String ordainketa) {//emaitza balioa main-etik hartu
		double DoubleTextDiruTot = Double.parseDouble(emaitza);
		double DoubleTextOrdainketa = Double.parseDouble(ordainketa);
		
		double[] array=new double[14];
		//Dena zentimoetan jarri
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
		String[] arrayBueltak=new String[10];
		double buelta;
		String bueltaString;
		int j=0;
		
		//double ordainketa;
		
		//System.out.println("Sartu dirua: ");
		//ordainketa = sc.nextDouble();
		
		do {
			if (DoubleTextOrdainketa<0) {
				System.out.println("Sartu zenbaki positibo bat:");
				
			}
		}while (DoubleTextOrdainketa<0);
		
		bueltak=DoubleTextOrdainketa-DoubleTextDiruTot;
		
		
		//Begiratu ea diru nahiko sartu duen edo bueltak eman behar diogun
		
		
		if (bueltak<0) {
			arrayBueltak[0]="";
			/*do {
			bueltak=-bueltak;
			System.out.println("Falta zaizkizu: "+bueltak+" euro");
			System.out.println("Sartu falta den dirua:");
			emaitza=bueltak;
		
			do {
				if (ordainketa<0) {
					System.out.println("Sartu zenbaki positibo bat:");
					
				}
			}while (ordainketa<0);
			bueltak=ordainketa-emaitza;
			}while (bueltak!=0 && bueltak < 0);//errepikatu 0 baino handiagoa edo berdina den zenbaki bat sartu harte*/
		}
		//galdetu bueltak dauden ala ez
		if(bueltak==0) {
			System.out.println("Ez daude bueltak");
			arrayBueltak[0]="0";
		}
		else
			System.out.println("Bueltak:");
		//Bueltak eman
		
		if (bueltak>0) {
		bueltak=bueltak*100;//bueltak zentimoetan jarri
		do {
			//begiratu noiz bueltak handiagoak diren, horrela bueltei zenbaki hurbilena pantailaratuko du
			for(int i=13;i>=0;i--) {
				
				if (bueltak>=array[i]) {
					bueltak=bueltak-array[i];//bueltei kendu pantailaratuko den balioa
					buelta = array[i]/100;
					bueltaString = Double.toString(buelta);
					arrayBueltak[j] = bueltaString;
					System.out.println(arrayBueltak[j]);
					j++;
					break;
				}
			}
		}while (bueltak!=0);//errepikatu prozesu hau bueltak 0 izan harte
		
		}
		
			
		return arrayBueltak;//main-era bidali buelten zerrenda
	}/*metodo bueltak*/
	
	public static String kenketa (String diruTot, String ordainketa) {
		
		double doubleDiruTot = Double.parseDouble(diruTot);
		double doubleOrdainketa = Double.parseDouble(ordainketa);
		double emaitza = doubleDiruTot-doubleOrdainketa;
		String stringEmaitza = Double.toString(emaitza);
		return stringEmaitza;
	}
	
	public static void bostSegundo() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}

