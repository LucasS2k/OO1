package ar.edu.unlp.info.oo1.Ejercicio30;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate despacho;
	private String origen;
	private String destino;
	protected Double peso;
	public Envio(LocalDate despacho, String origen, String destino, Double peso) { 
		this.despacho = despacho;
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
	}
	public abstract double calcularCosto();
	public LocalDate getFechaDespacho() { 
		return this.despacho;
	}
	public boolean esEnPeriodo(LocalDate inicio, LocalDate fin) {
		return(!this.despacho.isBefore(inicio)) && (!this.despacho.isAfter(fin));
	}
}
