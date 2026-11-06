package ar.edu.unlp.info.oo1.Ejercicio34;

public abstract class Plan {
	private int ips;
	public Plan(int limiteIPs) { 
		this.ips = limiteIPs;
	}
	public int getLimiteIPs() {
		return this.ips;
	}
	public abstract double getPrecioBase();
	public abstract double calcularPenalizacion(int cantIPs, boolean antiguedadSuficiente);
}
