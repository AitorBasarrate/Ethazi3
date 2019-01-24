package Controlador;

import java.util.*;


public class Cliente {
	
	private static String Dni;
	private static String Nombre;
	private static String Apellido;
	private static String fecha_nac;
	private static String Sexo;
	private static String Contraseña;
	
	public Cliente (String Dni, String Nombre, String Apellido, String fecha_nac, String Sexo, String Contraseña) {
		this.Apellido = Apellido;
		this.Contraseña = Contraseña;
		this.Dni = Dni;
		this.fecha_nac = fecha_nac;
		this.Nombre = Nombre;
		this.Sexo = Sexo;
	}

	public static String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public static String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public static String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public static String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public static String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public static String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
}
