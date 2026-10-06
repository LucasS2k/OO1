package ar.edu.unlp.info.oo1.Ejercicio16;

public abstract class Pieza {
	private String material;
	private String color;
	public Pieza (String material, String color) { 
		this.material = material;
		this.color = color;
	}
	
	public abstract double getVolumen();
	public abstract double getSuperficie();
	public String getColor() { 
		return this.color;
	}
	public String getMaterial() { 
		return this.material;
	}
	public double volumenDeMaterial (String buscado) { 
		if (this.material.equalsIgnoreCase(buscado)) {
			return this.getVolumen(); 
			}
		return 0;	
	}
}
