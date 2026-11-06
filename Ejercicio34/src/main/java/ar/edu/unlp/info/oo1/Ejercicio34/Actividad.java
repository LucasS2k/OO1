package ar.edu.unlp.info.oo1.Ejercicio34;

import java.time.LocalDate;

public abstract class Actividad {
	private LocalDate fechaInicio;
	private String direccionIP;
	private int duracion;
	public Actividad(LocalDate fechaInicio, String direccionIP, int duracion) { 
		this.fechaInicio = fechaInicio;
		this.direccionIP = direccionIP;
		this.duracion = duracion;
	}
	public abstract double getCosto();
	public int getDuracion() { 
		return this.duracion;
	}
	public LocalDate getInicio() { 
		return this.fechaInicio;
	}
	public boolean esEnPeriodo(LocalDate ini, LocalDate fin) { 
		return (!this.fechaInicio.isBefore(ini)) && (!this.fechaInicio.isAfter(fin));
	}
}
