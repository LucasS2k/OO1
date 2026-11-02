package ar.edu.unlp.info.oo1.Ejercicio29;

public class Sube {
	public Double saldo;
	public void pagar(Double monto) { 
		if (this.saldo - monto > 0.0) { 
			this.saldo -= monto;
		}
	}
	public Double getSaldo() { 
		return this.saldo;
	}
	public boolean recargar(Double monto, MedioDePago medioDePago) { 
		if (medioDePago != null && medioDePago.autorizarPago(monto)) { 
			medioDePago.pagar(monto);
			this.saldo += monto;
			return true;
		} return false;
	}
}
