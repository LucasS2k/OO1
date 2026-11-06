package ar.edu.unlp.info.oo1.Ejercicio34;

import java.time.LocalDate;

public class Video extends Actividad{
	public Video(LocalDate fechaInicio, String direccionIP, int duracion) { 
		super(fechaInicio, direccionIP, duracion);
		
	}
	@Override
	public double getCosto() { 
		return this.getDuracion() * 10;
	}
}
