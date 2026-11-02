package ar.edu.unlp.info.oo1.Ejercicio27;

import java.time.LocalDate;

public class Delivery extends FormaDeEntrega{ 
	private String direccion;
	private LocalDate fechaHora;
	private int minutosEstimados;
	 public Delivery(String direccion, LocalDate fechaHora, int minutosEstimados) { 
		 this.direccion = direccion;
		 this.fechaHora = fechaHora;
		 this.minutosEstimados = minutosEstimados;
	 }
	 @Override
	 public int calcularTiempoEstimado(LocalDate fechaInicio) { 
		 return this.minutosEstimados;
	 }  
	 }