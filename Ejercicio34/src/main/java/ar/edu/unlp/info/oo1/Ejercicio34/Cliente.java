package ar.edu.unlp.info.oo1.Ejercicio34;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private LocalDate fechaAlta;
	private Plan plan;
	private List <Actividad> actividades;
	public Cliente (String nombre, LocalDate fechaAlta, Plan plan) { 
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
		this.plan = plan;
		this.actividades = new ArrayList<>();
	}
	public void cambiarPlan(Plan nuevoPlan) { 
		this.plan = nuevoPlan;
	}
	public void agregarActividad(Actividad actividad) { 
		this.actividades.add(actividad);
	}
	public boolean antiguedadMayorA(int anios, LocalDate fechaRef) { 
		return Period.between(this.fechaAlta, fechaRef).getYears() > anios;
	}
	public double montoActividades(LocalDate ini, LocalDate fin) { 
		return this.actividades.stream().filter(a -> a.esEnPeriodo(ini, fin)).mapToDouble(Actividad::getCosto).sum();
	}
	
	public double montoTotal(LocalDate ini, LocalDate fin) {
		return this.plan.getPrecioBase() + this.montoActividades(ini, fin) + this.plan.calcularPenalizacion(10, antiguedadMayorA(10, fin));
	}
}
