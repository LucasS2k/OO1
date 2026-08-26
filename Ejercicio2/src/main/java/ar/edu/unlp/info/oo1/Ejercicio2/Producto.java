package ar.edu.unlp.info.oo1.Ejercicio2;

public class Producto{
	private String descripcion;
	private double peso;
	private double precioPorKilo;
	
	public Producto(String descripcion, double peso, double precioPorKilo) {
		this.descripcion = descripcion;
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
	}
	
	public String getDescripcion () {
		return this.descripcion;
	}
	
	void setDescripcion (String desc) {
		this.descripcion = desc;
	}
	
	public double getPeso () {
		return this.peso;
	}
	
	void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPrecioPorKilo () {
		return this.precioPorKilo;
	}
	
	public void setPrecioPorKilo (double precio) {
		this.precioPorKilo = precio;
	}
	
	public double getPrecio() {
		return this.peso * this.precioPorKilo;
	}
}