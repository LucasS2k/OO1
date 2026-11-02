package ar.edu.unlp.info.oo1.Ejercicio27;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
	private String email;
	protected FormaDeEntrega formaDeEntrega;
	protected List <Producto> productos;
	protected LocalDate fechaInicio;
	public Pedido(String email, FormaDeEntrega formaDeEntrega) { 
		this.email = email;
		this.formaDeEntrega = formaDeEntrega;
		this.productos = new ArrayList<>();
		this.fechaInicio = LocalDate.now();
	}
	public double calcularCosto() { 
		return this.productos.stream().mapToDouble(Producto::getPrecio).sum();
	}
}
