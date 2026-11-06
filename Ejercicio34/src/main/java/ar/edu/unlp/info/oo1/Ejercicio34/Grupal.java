package ar.edu.unlp.info.oo1.Ejercicio34;

public class Grupal extends Plan{
	public Grupal(int limiteIPs) { 
		super(limiteIPs);
		
	}
	@Override
	public double getPrecioBase() { 
		return this.getLimiteIPs() * 800.0;
	}
	@Override
	public double calcularPenalizacion(int cantidadIPs, boolean antiguedadSuficiente) { 
		if (antiguedadSuficiente) { 
			return 0.0;
		} 
		if (cantidadIPs > this.getLimiteIPs()) { 
			int ipsAdicionales = cantidadIPs - this.getLimiteIPs();
			return ipsAdicionales * 500.0;
		}
		return 0.0;
	}
}
