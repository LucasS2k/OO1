package ar.edu.unlp.info.oo1.Ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List <Archivo> adjuntos;
	public String getTitulo() { 
		return this.titulo;
	}
	public Email(String titulo, String cuerpo) { 
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	public void agregarAdjunto(Archivo archivo) { 
		this.adjuntos.add(archivo);
	}
	public String getCuerpo() { 
		return this.cuerpo;
	} 
	
	public boolean contieneTexto(String texto) { 
		return this.titulo.contains(texto) || this.cuerpo.contains(texto);
	}
	
	public Integer tamano() { 
	int totalAdjuntos = 0;
	for (Archivo archivo : this.adjuntos) { 
		totalAdjuntos += archivo.tamano();
	}
	return this.titulo.length() + this.cuerpo.length() + totalAdjuntos;
	}
	}


