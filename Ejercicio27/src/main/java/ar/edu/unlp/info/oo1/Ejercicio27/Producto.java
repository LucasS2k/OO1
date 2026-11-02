package ar.edu.unlp.info.oo1.Ejercicio27;

public abstract class Producto {
	private String nombre;
	private Double precio;
	private Double peso;
	public String getNombre() { 
		return this.nombre;
	}
	
	public Double getPrecio() { 
		return this.precio;
	}
	
	public double getPeso() { 
		return this.peso;
	}
}
