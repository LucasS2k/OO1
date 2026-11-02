package ar.edu.unlp.info.oo1.Ejercicio29;

public interface MedioDePago {
	boolean autorizarPago(Double monto);
	void pagar(Double monto);
}
