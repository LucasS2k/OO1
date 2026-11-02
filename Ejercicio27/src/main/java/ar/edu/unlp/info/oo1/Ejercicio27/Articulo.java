package ar.edu.unlp.info.oo1.Ejercicio27;

public class Articulo extends Producto{
	private String categoria;
	private Double peso;
	private int stock;
	public String getCategoria() { 
		return this.categoria;
	}
	
	public double getPeso() { 
		return this.peso;
	}
	
	public int getStock(){ 
		return this.stock;
	}
}
