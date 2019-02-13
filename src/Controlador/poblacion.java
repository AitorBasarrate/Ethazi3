package Controlador;

public class poblacion {
	//ALDAGAIAK
	private int Cod_postal;
	private String Nombre;
	
	/**
	 * KONSTRUKTOREA
	 * @author TALDE4
	 * @param Cod_postal
	 * @param Nombre
	 */
	public poblacion (int Cod_postal, String Nombre) {
		this.Cod_postal = Cod_postal;
		this.Nombre = Nombre;
	}

	public int getCod_postal() {
		return Cod_postal;
	}

	public void setCod_postal(int cod_postal) {
		Cod_postal = cod_postal;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
