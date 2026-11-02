package ar.edu.unlp.info.oo1.Ejercicio28;

public abstract class MaterialDigital extends Material implements Descargable{
	private String nombreArchivo;
	private Double tamanioEnMb;
	public MaterialDigital(String titulo, int anio, String nombreArchivo, Double tamanioEnMb) {
		super(titulo, anio);
		this.nombreArchivo = nombreArchivo;
		this.tamanioEnMb = tamanioEnMb;
	}
	@Override
	public double getTamanioEnMb() { 
		return this.tamanioEnMb;
	}
	@Override
	public String enlaceDeDescarga() { 
		return "https://biblioteca.example.org/descargas/" + this.getCarpeta() + this.nombreArchivo;
	}
	protected abstract String getCarpeta();
}
