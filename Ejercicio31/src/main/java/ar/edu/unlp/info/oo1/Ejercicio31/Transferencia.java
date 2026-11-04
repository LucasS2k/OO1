package ar.edu.unlp.info.oo1.Ejercicio31;

public class Transferencia implements MedioDePago{

	@Override
	public double calcularComision(Double monto) {
		return monto* 0.01;
	}
	
}
