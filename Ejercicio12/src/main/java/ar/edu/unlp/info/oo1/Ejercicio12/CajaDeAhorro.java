package ar.edu.unlp.info.oo1.Ejercicio12;

public class CajaDeAhorro extends Cuenta{
	@Override 
	public void depositar (double monto) { 
		super.depositar(monto * 0.98);
	}
	@Override 
	protected boolean puedeExtraer (double monto) { 
		return this.getSaldo() >= (monto *1.02);
	}
	@Override
	protected void extraerSinControlar(double monto) { 
		super.extraerSinControlar(monto *1.02);
	}
}
