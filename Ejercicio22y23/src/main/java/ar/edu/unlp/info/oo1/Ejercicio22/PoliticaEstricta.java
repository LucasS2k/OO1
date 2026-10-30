package ar.edu.unlp.info.oo1.Ejercicio22;

public class PoliticaEstricta implements PoliticaDeCancelacion{
	@Override 
	public double calcularMontoReembolso(LocalDate fechaCancelacion, Reserva reserva) { 
		return 0.0;
	}
}
