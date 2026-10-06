package ar.edu.unlp.info.oo1.Ejercicio16;

public class Esfera extends Pieza{
	private double radio;
	public Esfera(String material, String color, double radio) { 
		super(material, color);
		this.radio = radio;
	}
	@Override
	public double getVolumen() { 
		return ((4.0 / 3.0) * Math.PI * this.radio * this.radio *this.radio);
	}
	
	@Override
	public double getSuperficie() { 
		return (4 * Math.PI * this.radio * this.radio);
	}
}
