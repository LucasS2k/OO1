package ar.edu.unlp.info.oo1.Ejercicio17;

import java.util.ArrayList;
import java.util.List;

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
}
