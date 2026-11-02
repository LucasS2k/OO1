package ar.edu.unlp.info.oo1.Ejercicio28;

public class LibroDigital extends MaterialDigital{
	public LibroDigital(String titulo, int anio, String nombreArchivo, double tamanioEnMb) { 
		super(titulo, anio, nombreArchivo, tamanioEnMb);
	}
	@Override
	public String getCarpeta() { 
		return "libros";
	}
}
