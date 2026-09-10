package io.github.unlp_oo.Ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	
	private List<Item> items = new ArrayList<>();
	
	public Presupuesto () {
		this.fecha = LocalDate.now();
		this.cliente = "";
		this.items = new ArrayList<>();
	}
	
	public Presupuesto(String cliente) { 
		this.fecha = LocalDate.now();
		this.cliente = cliente;
	}
	
	public void agregarItem(Item item ) { 
		this.items.add(item);
	}
	public double calcularTotal(){
		double total = 0;
		for (Item item : this.items) {
		total += item.costo();
	}
	return total;}
	
	public LocalDate getFecha () { 
		return this.fecha;
	}
	
	public String getCliente () { 
		return this.cliente;
	}
	
	
	
}
