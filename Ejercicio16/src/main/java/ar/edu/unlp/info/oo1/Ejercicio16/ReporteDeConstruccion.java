package ar.edu.unlp.info.oo1.Ejercicio16;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List <Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<>();
	}
	
	public void agregarPieza(Pieza pieza) { 
		this.piezas.add(pieza);
	}
	
	public void removerPieza(Pieza pieza) { 
		this.piezas.remove(pieza);
	}
	public double volumenDeMaterial(String material) {
	    return this.piezas.stream()
	            .mapToDouble(p -> p.volumenDeMaterial(material))
	            .sum();
	}
}
