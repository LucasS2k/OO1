package ar.edu.unlp.info.oo1.Ejercicio30;

public class ClienteCorporativo extends Cliente{
	private String CUIT;
	public ClienteCorporativo(String nombre, String direccion, String CUIT) { 
		super(nombre, direccion);
		this.CUIT = CUIT;
	}
}
