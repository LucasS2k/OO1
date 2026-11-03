package ar.edu.unlp.info.oo1.Ejercicio30;

public class PersonaFisica extends Cliente{
	private String DNI;
	public PersonaFisica(String nombre, String direccion, String DNI) { 
		super(nombre, direccion);
		this.DNI = DNI;
	}
	@Override
	protected double getDescuento() { 
		return 0.90;
	}
}
