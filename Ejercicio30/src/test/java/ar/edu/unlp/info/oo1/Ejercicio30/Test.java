package ar.edu.unlp.info.oo1.Ejercicio30;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;

class Test {
	private PersonaFisica personaFisica;
	private ClienteCorporativo clienteCorporativo;
	private LocalDate inicio;
	private LocalDate fin;
	@BeforeEach
	void setUp() { 
		inicio = LocalDate.of(2026, 12,1);
		fin = LocalDate.of(2026, 12, 10);
		personaFisica = new PersonaFisica("Juan Ejemplo", "calle test", "42424242");
		clienteCorporativo = new ClienteCorporativo ("Empresa", "direccion ejemplo", "22-222222-22");
	}
	@Test
	void testMontoFechasBorde(){ 
		Envio e1 = new EnvioLocal(LocalDate.of(2026, 12, 1), "La Plata", "La Plata", 200.0, false);
		Envio e2 = new EnvioLocal(LocalDate.of(2026, 12, 10), "La Plata", "La Plata", 200.0, true);
		Envio e3 = new EnvioLocal(LocalDate.of(2026, 12, 11), "La Plata", "La Plata", 200.0, true);
		Envio e4 = new EnvioLocal(LocalDate.of(2026, 11, 31), "La Plata", "La Plata", 200.0, true);
		personaFisica.agregarEnvio(e1);
		personaFisica.agregarEnvio(e2);
		personaFisica.agregarEnvio(e3);
		personaFisica.agregarEnvio(e4);
		assertEquals(2250.0, personaFisica.montoAPagar(inicio, fin));
	}
	@Test
	void testMontoAPagar() { 
		Envio e1 = new EnvioLocal(LocalDate.of(2026, 11, 31), "La Plata", "La Plata", 200.0, false);
		clienteCorporativo.agregarEnvio(e1);
		assertEquals(1000.0, clienteCorporativo.montoAPagar(inicio, fin));
	}
	@Test
	void testEnvioInterurbadoBorde() { 
		Envio interurbano = new EnvioInterurbano(LocalDate.of(2026,11,5),"La Plata", "Chascomus", 10.0, 100.0));
		assertEquals(250.0, clienteCorporativo.montoAPagar(inicio, fin));
	}
}
