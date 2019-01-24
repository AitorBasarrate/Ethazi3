package Controlador;

import java.util.*;


public class Cliente {
	
	private static String Dni;
	private static String Nombre;
	private static String Apellido;
	private static String fecha_nac;
	private static String Sexo;
	private static String Contrase�a;
	
	public Cliente (String Dni, String Nombre, String Apellido, String fecha_nac, String Sexo, String Contrase�a) {
		this.Apellido = Apellido;
		this.Contrase�a = Contrase�a;
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

	public static String getContrase�a() {
		return Contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
	}
}
