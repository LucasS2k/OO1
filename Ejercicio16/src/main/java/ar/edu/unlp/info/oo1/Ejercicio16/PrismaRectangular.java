package ar.edu.unlp.info.oo1.Ejercicio16;

public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public PrismaRectangular(String material, String color, double altura, double ladoMenor, double ladoMayor) { 
		super(material, color);
		this.altura = altura;
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}
	@Override
	public double getVolumen() { 
		return(this.ladoMayor * this.ladoMenor * this.altura);
	}
	
	@Override 
	public double getSuperficie() { 
		return 2 * ((this.ladoMayor * this.ladoMenor) + (this.ladoMayor * this.altura) + (this.ladoMenor * this.ladoMenor));
	}
}
