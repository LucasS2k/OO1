package ar.edu.unlp.info.oo1.Ejercicio27;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RetiroEnSucursal extends FormaDeEntrega { 
	 private String dniAutorizado;
	 private LocalDate horarioEstimado;
	 public RetiroEnSucursal(String dniAutorizado, LocalDate horarioEstimado) { 
		 this.dniAutorizado = dniAutorizado;
		 this.horarioEstimado = horarioEstimado;
	 }
	 @Override
	 public int calcularTiempoEstimado(LocalDate fechaInicio) { 
		 return (int) ChronoUnit.MINUTES.between(fechaInicio, horarioEstimado);
	 }
}