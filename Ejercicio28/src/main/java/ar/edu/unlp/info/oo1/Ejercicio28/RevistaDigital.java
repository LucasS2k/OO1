package ar.edu.unlp.info.oo1.Ejercicio28;

public class RevistaDigital extends MaterialDigital{
	public RevistaDigital(String titulo, int anio, String nombreArchivo, double tamanioEnMb) { 
		super(titulo, anio, nombreArchivo, tamanioEnMb);
	}
	@Override
	public String getCarpeta() { 
		return "Revistas";
	}
}
