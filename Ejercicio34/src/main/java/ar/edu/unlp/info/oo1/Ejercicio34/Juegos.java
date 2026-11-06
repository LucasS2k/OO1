package ar.edu.unlp.info.oo1.Ejercicio34;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Juegos extends Actividad{
	private List <Item> items;
	public Juegos(LocalDate fechaInicio, String direccionIP, int duracion) { 
		super(fechaInicio, direccionIP, duracion);
		this.items = new ArrayList<>();
	}
	@Override
	public double getCosto() { 
		if (super.getDuracion()> 360){
		return this.items.stream().mapToDouble(item -> item.getPrecio()).sum();
				} return 0.0;
	}
}
