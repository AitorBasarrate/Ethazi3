package Controlador;

import java.io.*;

public class FitxategiRW {
	File fitxategi = null;
	FileReader fr = null;
	BufferedReader br = null;
	
	{

	try
	{
		// Apertura del fichero y creacion de BufferedReader para poder
		// hacer una lectura comoda (disponer del metodo readLine()).
		fitxategi = new File("../Ethazi3/src/Controlador/ticket");
		fr = new FileReader(fitxategi);
		br = new BufferedReader(fr);

		// Lectura del fichero
		String linea;
		while ((linea = br.readLine()) != null)
			System.out.println(linea);
	}catch(
	Exception e)
	{
		e.printStackTrace();
	}finally
	{
		// En el finally cerramos el fichero, para asegurarnos
		// que se cierra tanto si todo va bien como si salta
		// una excepcion.
		try {
			if (null != fr) {
				fr.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}}
//http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java