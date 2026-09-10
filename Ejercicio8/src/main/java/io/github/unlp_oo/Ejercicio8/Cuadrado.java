package io.github.unlp_oo.Ejercicio8;

public class Cuadrado implements Figura2D {
	private double lado;
	private double perimetro;
	private double area;
	
	public Cuadrado() { 
		
	}
	public void setLado(double lado) { 
		this.lado = lado;
	}
	
	public double getLado () {
		return this.lado;
	}
	@Override
	public double getPerimetro() {
		return this.lado * 4;
	}
	@Override
	public double getArea() {
		return lado * lado;
	}
	
	
}
