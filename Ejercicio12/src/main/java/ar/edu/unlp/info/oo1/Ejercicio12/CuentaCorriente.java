package ar.edu.unlp.info.oo1.Ejercicio12;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	public CuentaCorriente() { 
		super();
		this.descubierto = 0;
	}
	public double getDescubierto () { 
		return this.descubierto;
	}
	
	public void setDescubierto (double descubierto) {
		this.descubierto = descubierto;
	}
	
	@Override
	protected boolean puedeExtraer (double monto){
		return (this.getSaldo()+ this.descubierto) >= monto;
	}

}
