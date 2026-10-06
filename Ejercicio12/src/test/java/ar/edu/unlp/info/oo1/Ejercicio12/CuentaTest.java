package ar.edu.unlp.info.oo1.Ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTest {

	private CajaDeAhorro cajaAhorroOrigen;
	private CajaDeAhorro cajaAhorroDestino;
	
	private CuentaCorriente cuentaCorrienteOrigen;
	private CuentaCorriente cuentaCorrienteDestino;
	
	@BeforeEach
	public void setUp() { 
		this.cajaAhorroOrigen = new CajaDeAhorro();
		this.cajaAhorroDestino = new CajaDeAhorro();
		
		this.cuentaCorrienteOrigen = new CuentaCorriente();
		this.cuentaCorrienteDestino = new CuentaCorriente();
	}

	@Test
	public void testCajaDeAhorroDepositar() {
		this.cajaAhorroOrigen.depositar(100);
		assertEquals(98, this.cajaAhorroOrigen.getSaldo());
	}
	
	@Test
	public void testCajaDeAhorroExtraer() {
		this.cajaAhorroOrigen.depositar(100);
		assertTrue(this.cajaAhorroOrigen.extraer(50));
		assertEquals(47, this.cajaAhorroOrigen.getSaldo());

		CajaDeAhorro caja100 = new CajaDeAhorro();
		caja100.depositar(100 / 0.98); 
		assertFalse(caja100.extraer(100));
		assertEquals(100, caja100.getSaldo());
	}

	@Test 
	public void testCajaDeAhorroTransferir() {
		this.cajaAhorroOrigen.depositar(100);
		assertEquals(98, this.cajaAhorroOrigen.getSaldo());

		assertFalse(this.cajaAhorroOrigen.transferirACuenta(98, this.cajaAhorroDestino));
		assertEquals(98, this.cajaAhorroOrigen.getSaldo());
		assertEquals(0, this.cajaAhorroDestino.getSaldo());

		assertTrue(this.cajaAhorroOrigen.transferirACuenta(50, this.cajaAhorroDestino));
		assertEquals(47, this.cajaAhorroOrigen.getSaldo());
		assertEquals(49, this.cajaAhorroDestino.getSaldo());
	}

	@Test
	public void testCuentaCorrienteDepositar() {
		this.cuentaCorrienteOrigen.depositar(100);
		assertEquals(100, this.cuentaCorrienteOrigen.getSaldo());
	}

	@Test
	public void testCuentaCorrienteExtraer() {
		this.cuentaCorrienteOrigen.setDescubierto(500);

	
		assertTrue(this.cuentaCorrienteOrigen.extraer(300));
		assertEquals(-300, this.cuentaCorrienteOrigen.getSaldo());

		
		CuentaCorriente cc2 = new CuentaCorriente();
		cc2.setDescubierto(500);

		
		assertFalse(cc2.extraer(600));
		assertEquals(0, cc2.getSaldo());
	}

	@Test
	public void testCuentaCorrienteTransferir() {
		this.cuentaCorrienteOrigen.setDescubierto(200);

		assertFalse(this.cuentaCorrienteOrigen.transferirACuenta(300, this.cuentaCorrienteDestino));
		assertEquals(0, this.cuentaCorrienteOrigen.getSaldo());
		assertEquals(0, this.cuentaCorrienteDestino.getSaldo());

		assertTrue(this.cuentaCorrienteOrigen.transferirACuenta(100, this.cuentaCorrienteDestino));
		assertEquals(-100, this.cuentaCorrienteOrigen.getSaldo());
		assertEquals(100, this.cuentaCorrienteDestino.getSaldo());
	}
}
