package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private LocalDate fechaConstitucion;
	private double montoDepositado;
	private double porcentajeInteresDiario;
	public PlazoFijo(LocalDate fechaConstitucion, double montoDepositado, double porcentajeInteresDiario) { 
		this.fechaConstitucion = fechaConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeInteresDiario = porcentajeInteresDiario;
	}
	@Override 
	public double valorActual () { 
		long diasPasados = ChronoUnit.DAYS.between (this.fechaConstitucion, LocalDate.now());
		double interesesAcumulados = this.montoDepositado * (this.porcentajeInteresDiario * diasPasados);
		return this.montoDepositado + interesesAcumulados;
	}
}
