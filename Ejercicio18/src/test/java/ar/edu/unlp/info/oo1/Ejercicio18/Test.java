package ar.edu.unlp.info.oo1.Ejercicio18;
import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;

class DateTest {
	private DateLapse lapso;
	private LocalDate primerFecha;
	private LocalDate segundaFecha;
	
	@BeforeEach
	void setUp() { 
		primerFecha = LocalDate.of(1972, 12, 15);
		segundaFecha = LocalDate.of(2032,12,15);
		// lapso = new DateLapse(primerFecha, segundaFecha);
	}
	@Test void testSizeInDays() { 
		assertTrue(lapso.sizeInDays() > 0);
	}
	
	@Test void testincludes() { 
		LocalDate hoy = LocalDate.now();
		assertTrue(lapso.includesDate(hoy));
		assertTrue(lapso.includesDate(primerFecha));
		assertTrue(lapso.includesDate(segundaFecha));
		LocalDate fechaFuera = LocalDate.of(1970, 1, 1);
		assertFalse(lapso.includesDate(fechaFuera));
	}
	
}
