package ar.edu.unlp.info.oo1.Ejercicio34;

public class Individual extends Plan{
	private int minutosContratados;
	public Individual(int minutosContratados) { 
		super(1);
		this.minutosContratados = minutosContratados;
	}
	@Override
	public double getPrecioBase() { 
		return this.minutosContratados * 20.0;
	}
	@Override
	public double calcularPenalizacion(int cantIPs, boolean antiguedadSuficiente) { 
		if (cantIPs > 1) { 
			int IPsAdicionales = cantIPs -1;
			return IPsAdicionales * 300.0;
		}
		return 0.0;
	}
}
