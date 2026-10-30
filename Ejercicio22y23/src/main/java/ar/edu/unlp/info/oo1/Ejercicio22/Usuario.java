package ar.edu.unlp.info.oo1.Ejercicio22;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private Integer DNI;
	private List <Propiedad> propiedades;
	private List <Reserva> reservas;
	public Usuario(String nombre, Integer DNI, String direccion) { 
		this.nombre = nombre;
		this.DNI = DNI;
		this.direccion = direccion;
		this.propiedades = new ArrayList <Propiedad>();
		this.reservas = new ArrayList <Reserva>();
	}
	public double calcularIngresos(DateLapse periodo) { 
		double total = 0.0;
		for (Propiedad propiedad : this.propiedades) { 
			total+= propiedad.precioReservas(periodo);
		}
		return total * 0.75;
	}
	
	public void cancelarReserva(Reserva reserva) { 
		if (reserva != null && !reserva.estaEnCurso()) { 
			boolean cancelada = reserva.getPropiedad().cancelarReserva(reserva);
		}
		if (cancelada) { 
			this.reservas.remove(reserva)
			}return cancelada;
	}return false;
}
