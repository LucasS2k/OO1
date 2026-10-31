package ar.edu.unlp.info.oo1.Ejercicio24;

public class OrdenCompra extends Orden{
	private Double precioEnvio;
	
	@Override public Double calcularCosto(){ 
		Double costoProductos = super.calcularCosto();
		if (this.productos.size() >= 5) { 
			costoProductos *= 0.90; 
			}
		return costoProductos + this.precioEnvio;
}  
}
