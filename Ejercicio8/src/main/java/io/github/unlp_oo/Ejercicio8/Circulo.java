package io.github.unlp_oo.Ejercicio8;

public class Circulo implements Figura2D{
	private double diametro;
	private double radio;
	private double area;
	private double perimetro;
	public Circulo () {
	}
	public double getDiametro() { 
		return this.radio * 2;
	} 
	
	public void setDiametro (double radio) {
		this.diametro = this.radio * 2;
	}
	
	public double getRadio () { 
		return this.radio;
	}
	
	public void setRadio (double radio) {
		this.radio = radio;
	}
	@Override
	public double getPerimetro () { 
		return 2 * Math.PI * this.radio;
	}
	@Override
	public double getArea() { 
		return Math.PI * Math.pow(this.radio,2);
	}
}
