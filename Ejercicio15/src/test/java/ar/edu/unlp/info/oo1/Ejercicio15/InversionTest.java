package ar.edu.unlp.info.oo1.Ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionTest {
	private Inversor inversor;
	private Accion accionEjemplo;
	private PlazoFijo plazo;
	@BeforeEach
	public void setUp() { 
		this.inversor = new Inversor ("primero"); 
	
		this.accionEjemplo = new Accion ("nombreAccion", 2,300.0);
		
		LocalDate diezDias = LocalDate.now().minusDays(10);
		
		this.plazo = new PlazoFijo (diezDias,10000, 0.01);
		
	}
	
	@Test
	//si no tiene inversiones se espera un 0 en valor actual
	public void testInversorSinInversiones() { 
		assertEquals(0, this.inversor.valorActual());
	}
	
	@Test
	// 2 acciones * 300 de valor = 600
	public void testValorActual() { 
		assertEquals(600,this.accionEjemplo.valorActual());
	}
	
	@Test
	//10000 + (10000 * 0.01 * 10) = 11000
	public void testValorPlazoFijo() { 
		assertEquals(11000, this.plazo.valorActual());
	}
	
	@Test
	public void testAgregarQuitarInversiones () { 
		this.inversor.agregarInversion(accionEjemplo);
		
		this.inversor.agregarInversion(plazo);
		
		assertEquals(11600, this.inversor.valorActual());
		
		this.inversor.quitarInversion(plazo);
		
		assertEquals(600, this.inversor.valorActual());
	}
	
}
