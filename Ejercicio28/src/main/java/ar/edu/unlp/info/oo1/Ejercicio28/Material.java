package ar.edu.unlp.info.oo1.Ejercicio28;

import java.time.LocalDate;
import java.time.Period;

public abstract class Material {
	private String titulo;
	private int fechaIncorporacion;
	public Material(String titulo, int anio) { 
		this.titulo = titulo;
		this.fechaIncorporacion = anio;
	}
	public int antiguedad() { 
		int periodo = (int) LocalDate.now().getYear() - fechaIncorporacion;
		return periodo;
	}
}
