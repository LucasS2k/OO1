package ar.edu.unlp.info.oo1.Ejercicio29;

import java.time.LocalDate;

public class Tarjeta implements MedioDePago{
	private String numero;
	private String titular;
	private LocalDate vencimiento;
	@Override
	public boolean autorizarPago(Double monto) { 
		return true;
	}
	@Override
	public void pagar(Double monto) { 
	}
}
