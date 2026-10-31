package ar.edu.unlp.info.oo1.Ejercicio24;

import java.time.LocalDate;
import java.util.List;

public abstract class Orden {
	private LocalDate fecha;
	private String domicilio;
	protected List<Producto> productos;
	
	public Double calcularCosto() { 
		double costoTotal = 0.0;
		for(Producto producto : this.productos) { 
			costoTotal += producto.getCosto();
		}
		return costoTotal;
	}
}
