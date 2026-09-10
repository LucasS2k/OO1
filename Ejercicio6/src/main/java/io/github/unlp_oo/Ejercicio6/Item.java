package io.github.unlp_oo.Ejercicio6;

public class Item {
	private String detalle;
	private Integer cantidad;
	private double costoUnitario;
	
	public Item () {
		this.detalle = ""; 
		this.cantidad= 1;
		this.costoUnitario =0;
		
		
	}
	
	public Item (String detalle, Integer cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public double getCostoUnitario() {
		
		return this.costoUnitario;
	};
	
	public double costo() {
	return this.cantidad * this.costoUnitario;
	}
}
