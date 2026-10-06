package ar.edu.unlp.info.oo1.Ejercicio16;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestReporte {
	private ReporteDeConstruccion reporte;
	private Cilindro cilindro;
	private Esfera esfera;
	private PrismaRectangular prismaR;
	@BeforeEach
	public void setUp() { 
		this.reporte = new ReporteDeConstruccion();
		this.cilindro = new Cilindro("Acero","Negro", 2, 7);
		
		this.esfera = new Esfera ("Hierro", "Rojo", 4);
		
		this.prismaR = new PrismaRectangular ("Aluminio", "Verde", 2,6,4);
		
		this.reporte.agregarPieza(cilindro);
		this.reporte.agregarPieza(esfera);
		this.reporte.agregarPieza(prismaR);
	}
	
	@Test
	public void testVolumenDeMaterial () { 
		assertEquals(87.96,this.reporte.volumenDeMaterial("Acero"),0.01);
	
		assertEquals(268.08,this.reporte.volumenDeMaterial("Hierro"), 0.01);
		
		assertEquals (48 ,this.reporte.volumenDeMaterial("Aluminio"),0.01);
	}

	
}
