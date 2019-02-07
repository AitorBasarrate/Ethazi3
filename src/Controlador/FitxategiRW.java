package Controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FitxategiRW {
	File ticket = new File ("../Ethazi3/src/Controlador/ticket");
	FileReader fr = new FileReader (ticket);
	BufferedReader br = new BufferedReader(fr);
	...
	String linea = br.readLine();
}
//http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java