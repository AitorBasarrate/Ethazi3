package Controlador;

public class Autobusa {
	
	private static String Cod_bus;
	private static String N_plazas;
	private static String Consumo_km;
	private static String Color;
	
	public Autobusa(String Cod_bus, String N_plazas, String Consumo_km, String Color) {
		this.Cod_bus = Cod_bus;
		this.N_plazas = N_plazas;
		this.Consumo_km = Consumo_km;
		this.Color = Color;
	}

	public static String getCod_bus() {
		return Cod_bus;
	}

	public void setCod_bus(String cod_bus) {
		Cod_bus = cod_bus;
	}

	public static String getN_plazas() {
		return N_plazas;
	}

	public void setN_plazas(String n_plazas) {
		N_plazas = n_plazas;
	}

	public static String getConsumo_km() {
		return Consumo_km;
	}

	public void setConsumo_km(String consumo_km) {
		Consumo_km = consumo_km;
	}

	public static String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	
}
