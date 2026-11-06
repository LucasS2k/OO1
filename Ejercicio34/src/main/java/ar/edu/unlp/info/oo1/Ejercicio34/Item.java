package ar.edu.unlp.info.oo1.Ejercicio34;

public class Item {
	private String nombre;
	private int cantidad;
	private double precio;
	public Item(String nombre, int cantidad, double precio) { 
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public double getPrecio() { 
		return this.precio * this.cantidad;
	}
}
