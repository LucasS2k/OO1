package ar.edu.unlp.info.oo1.Ejercicio16;

public class Cilindro extends Pieza{
	private double radio;
	private double altura;
	public Cilindro(String material, String color, double radio, double altura) { 
		super(material, color);
		this.altura = altura;
		this.radio = radio;
	}
	
	@Override
	public double getVolumen() { 
		return ((Math.PI * (this.radio*this.radio)) * this.altura);
	}
	@Override
	public double getSuperficie() {
		return ((2 * Math.PI * this.radio * this.altura )+ (2 * Math.PI * this.radio * this.radio));
	}
}
