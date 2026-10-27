package ar.edu.unlp.info.oo1.Ejercicio17;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;
class CarpetaTest { 
	private Carpeta carpetaVacia; 
	private Carpeta carpetaConMails; 
	private Email email1; 
	private Email email2; 
	private Email email3; 
	@BeforeEach void setUp() 
	{  
	carpetaVacia = new Carpeta("Vacía");
	carpetaConMails = new Carpeta("Trabajo"); 
	email1 = new Email("Reunión de equipo", "Repasamos los temas de la semana."); 
	email1.agregarAdjunto(new Archivo("doc.pdf"));  
	email2 = new Email("Soporte Técnico", "Ticket resuelto con éxito.");
	email3 = new Email("Facturación", "Adjuntamos el comprobante."); 
	carpetaConMails.agregarEmail(email1); carpetaConMails.agregarEmail(email2); 
	carpetaConMails.agregarEmail(email3); } 
	@Test void testEspacioOcupadoCarpetaVacia() { 
		assertEquals(0, carpetaVacia.espacioOcupado()); } 
	@Test void testEspacioOcupadoConEmails() { 
		assertEquals(138, carpetaConMails.espacioOcupado()); } 
	@Test void testBuscarEnCarpetaVacia() { 
		assertNull(carpetaVacia.buscar("Reunión")); } 
	@Test void testBuscarPrimerElemento() { 
		Email encontrado = carpetaConMails.buscar("Reunión"); 
		assertNotNull(encontrado); assertEquals(email1, encontrado); } 
	@Test void testBuscarUltimoElemento() { 
		Email encontrado = carpetaConMails.buscar("comprobante"); 
		assertNotNull(encontrado); assertEquals(email3, encontrado); } 
	@Test void testBuscarSinCoincidencias() {  
		assertNull(carpetaConMails.buscar("TextoInexistente")); } 
	@Test void testEliminarEmailYEspacioOcupado() { 
		carpetaConMails.eliminarEmail(email1); carpetaConMails.eliminarEmail(email2); 
		carpetaConMails.eliminarEmail(email3); 
		assertEquals(0, carpetaConMails.espacioOcupado()); 
		assertNull(carpetaConMails.buscar("Reunión")); } 
}
