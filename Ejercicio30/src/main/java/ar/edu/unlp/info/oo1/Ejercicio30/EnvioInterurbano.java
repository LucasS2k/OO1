package ar.edu.unlp.info.oo1.Ejercicio30;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{
	private double KM;
	public EnvioInterurbano(LocalDate despacho, String origen, String destino, double peso, double KM) { 
		super(despacho, origen, destino, peso);  
		this.KM = KM;
	}
	public double calcularCosto() { 
		double costo = 0;
		double gramos = this.peso * 1000;
		if(this.KM < 1000) { 
			costo = 20*gramos;
		} else if (this.KM < 500) { 
			costo = 25*gramos;
		} else costo = 30*gramos;
		return costo;
	}
}
