package ar.edu.unlp.info.oo1.Ejercicio15;

public class Accion implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	public Accion (String nombre, int cantidad, Double valorUnitario) { 
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}
	
	@Override
	public double valorActual() { 
		return this.cantidad * this.valorUnitario;
	}
}
