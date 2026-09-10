package ar.edu.unlp.info.oo1.Ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket{
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List <Producto> productos;
	
	public Ticket (double precioTotal,double pesoTotal,int cantidadDeProductos, List <Producto> productos) {
		this.fecha = LocalDate.now();
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		this.cantidadDeProductos = cantidadDeProductos;
		this.productos = new ArrayList<Producto>(productos);
		
	}
	
	public LocalDate getFecha () {
		return this.fecha;
	}
	
	public int getCantidadDeProductos () {
		return this.cantidadDeProductos;
	}
	
	public double getPesoTotal () {
		return this.pesoTotal;
	}
	
	public double getPrecioTotal () {
		return this.precioTotal;
	}
	
	public double impuesto () {
		return this.precioTotal*0.21;
	}
	
	public List <Producto> productos() {
	return this.productos;}
	
}