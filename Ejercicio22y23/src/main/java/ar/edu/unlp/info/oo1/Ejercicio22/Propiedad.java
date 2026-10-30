package ar.edu.unlp.info.oo1.Ejercicio22;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String direccion;
	private String nombreDescriptivo;
	private Double precio;
	private List <Reserva> reservas;
	public Propiedad (String direccion, String nombreDescriptivo, Double precio) { 
		this.direccion = direccion;
		this.nombreDescriptivo = nombreDescriptivo;
		this.precio = precio;
		this.reservas = new ArrayList <Reserva>();
	}
	public double getPrecio() { 
		return this.precio;
	}
	public double precioReservas(DateLapse periodo) { 
		double total= 0.0;
		for (Reserva reserva: this.reservas) { 
			if (reserva.getPeriodo().overlaps(periodo)) { 
				total+=reserva.calcularPrecio();
			}
		}
	}
	
	public void crearUnaReserva(DateLapse periodo, Usuario inquilino, Propiedad propiedad) { 
		if (this.estaDisponible(periodo)) { 
			Reserva nuevaReserva = new Reserva(periodo, this, inquilino);
			this.reservas.add(nuevaReserva);
		}
		return null;
	}
	public boolean(DateLapse periodo) { 
		for (Reserva reserva : this.reservas) { 
			if (reserva.getPeriodo().overlaps(periodo)) { 
				return false;
			}
			return true;
		}
	}
}
