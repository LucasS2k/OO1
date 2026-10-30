package ar.edu.unlp.info.oo1.Ejercicio22;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaDeCancelacion{
	@Override 
	public double calcularMontoReembolso(LocalDate fechaCancelacion, Reserva reserva) { 
		if (fechaCancelacion.isBefore(reserva.getFechaInicio())) { 
			return reserva.calcularPrecio();
		}
		return 0.0;
	}
}
