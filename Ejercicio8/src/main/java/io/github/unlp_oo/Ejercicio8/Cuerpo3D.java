package io.github.unlp_oo.Ejercicio8;

public class Cuerpo3D {
	private double altura;
	private Figura2D caraBasal;
	public Cuerpo3D() { 
		
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Figura2D caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getAltura () {
		return this.altura;
	}
	
	public double getVolumen () { 
		return this.caraBasal.getArea() * this.altura;
	}
	
	public double getSuperficieExterior () { 
		return (2 * this.caraBasal.getArea()) + (this.caraBasal.getPerimetro()*this.altura);
	}

}
