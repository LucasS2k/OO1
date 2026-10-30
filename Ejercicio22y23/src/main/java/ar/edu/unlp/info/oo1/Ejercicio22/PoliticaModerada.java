package ar.edu.unlp.info.oo1.Ejercicio22;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements PoliticaDeCancelacion{

	@Override
	public double calcularMontoReembolso(LocalDate fechaCancelacion, Reserva reserva) {
		if (!fechaCancelacion.isBefore(reserva.getFechaInicio())) { 
			return 0.0;
		}
		long diasDeAnticipacion = ChronoUnit.DAYS.between(fechaCancelacion, reserva.getFechaInicio());
		if (diasDeAnticipacion >= 7) { 
			return reserva.calcularPrecio();
		} else if (diasDeAnticipacion >= 2) { 
			return reserva.calcularPrecio() / 2;
		}
		return 0.0;
	}
	
}
