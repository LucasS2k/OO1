package ar.edu.unlp.info.oo1.Ejercicio29;

public class CuentaDNI implements MedioDePago{
	private String sucursal;
	private String numero;
	private Double saldo;
	@Override
	public boolean autorizarPago(Double monto) { 
		return this.saldo >=monto;
	}
	@Override
	public void pagar(Double monto) { 
		if (this.autorizarPago(monto)) { 
			this.saldo -= monto;
		}
		
	}
}
