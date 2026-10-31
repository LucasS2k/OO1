package ar.edu.unlp.info.oo1.Ejercicio24;

import java.util.List;

public class OrdenServicio extends Orden{
	private String descripcion;
	private Integer horas;
	private List <Tecnico> tecnicos;
	@Override public Double calcularCosto() { 
		Double costoTotal = super.calcularCosto();
		for (Tecnico tecnico : this.tecnicos) { 
			costoTotal += this.horas * tecnico.getPrecioHora();
		}
		return costoTotal;
	}
}
