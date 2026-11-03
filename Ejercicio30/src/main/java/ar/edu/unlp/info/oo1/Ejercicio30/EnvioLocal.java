package ar.edu.unlp.info.oo1.Ejercicio30;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
	private boolean entregaRapida;
	public EnvioLocal(LocalDate despacho, String origen, String destino, Double peso, boolean entregaRapida ) { 
		super(despacho, origen, destino, peso);
		this.entregaRapida = entregaRapida;
	}
	public double calcularCosto() { 
		Double costo = 1000.0;
		if (this.entregaRapida) { 
			costo +=500;
		}return costo;
	}
}
