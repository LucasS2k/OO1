package ar.edu.unlp.info.oo1.Ejercicio30;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{
	private boolean envioRapido;
	public EnvioInternacional(LocalDate despacho, String origen, String destino, double peso, boolean envioRapido) { 
		super(despacho, origen, destino, peso);
		this.envioRapido = envioRapido;
	}
	@Override
	public double calcularCosto() {
		double costo = 5000;
		if (this.envioRapido) { 
			costo += 800;
		}
		double gramos = peso*1000;
		if (gramos <= 1000) {
		 costo += 10*gramos; 
		} else if (gramos > 1000) { 
			 costo += 12*gramos;
		}return costo;
	}
}
