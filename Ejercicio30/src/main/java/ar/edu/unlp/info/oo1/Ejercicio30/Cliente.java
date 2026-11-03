package ar.edu.unlp.info.oo1.Ejercicio30;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private String direccion;
	private List <Envio> envios;
	private String nombre;
	public Cliente(String nombre, String direccion) { 
		this.direccion = direccion;
		this.nombre = nombre;
		this.envios = new ArrayList<Envio>();
	}
	public void agregarEnvio(Envio envio) { 
		this.envios.add(envio);
	}
	protected double getDescuento() {
		return 1.0;
	}
	public double montoAPagar(LocalDate inicio, LocalDate fin) { 
		double subTotal = this.envios.stream().filter(envio-> envio.esEnPeriodo(inicio, fin)).mapToDouble(Envio::calcularCosto).sum();
		return subTotal * this.getDescuento();
	}
}
