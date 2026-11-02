package ar.edu.unlp.info.oo1.Ejercicio26;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unlp.info.oo1.Ejercicio25.Bag;
import ar.edu.unlp.info.oo1.Ejercicio25.BagCollec;

public class Carpeta {
	private String nombre;
	private List <Email> emails;
	public Carpeta (String nombre) { 
		this.nombre = nombre;
		this.emails = new ArrayList <Email>();
	}
	
	public String getNombre() { 
		return this.nombre;
	}
	public void agregarEmail(Email email){
		this.emails.add(email);
	}
	public void eliminarEmail(Email email) { 
		this.emails.remove(email);
	}
	
	public void mover(Email email, Carpeta destino) { 
		this.eliminarEmail(email);
		destino.agregarEmail(email);
	}
	
	public Email buscar(String texto){ 
		for (Email email: this.emails) { 
			if (email.contieneTexto(texto)) {
				return email;
			}
		}
		return null;
	}
	public Integer espacioOcupado () {
		int total = 0;
		for (Email email : this.emails) { 
			total+= email.tamano();
		}
		return total;
	}
	
	public int cantidadDeEmails() { 
		return this.emails.size();
	}
	public Bag<String> cantidadDeMailsPorCate(){ 
		Bag<String> categorias = new BagCollec<>();
		for (Email email : this.emails) { 
			categorias.add(email.getCategoria());
		}
		return categorias;
	}
	
	public String reporteEmails() { 
		Bag<LocalDate> fechasBag = new BagCollec<>();
		for (Email email : this.emails) { 
			fechasBag.add(email.getFecha());
		} 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		StringBuilder reporte = new StringBuilder();
		Set<LocalDate> fechasUnicas = new HashSet<>(fechasBag);
		
		for (LocalDate fecha : fechasUnicas) { 
			int cantidad = fechasBag.occurrencesOf(fecha);
			reporte.append(fecha.format(formatter)).append("-").append(cantidad).append("emails\n");
		}
		return reporte.toString();
	}}
