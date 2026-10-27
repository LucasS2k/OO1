package ar.edu.unlp.info.oo1.Ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List <Carpeta> carpetas;
	
	public ClienteDeCorreo() { 
		this.inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
		this.carpetas.add(this.inbox);
	}
	
	public void recibir(Email email) { 
		this.inbox.agregarEmail(email);
	}
	
	public Email buscar (String texto) { 
		for (Carpeta carpeta : this.carpetas) { 
			Email encontrado = carpeta.buscar(texto);
			if (encontrado != null) { 
				return encontrado;
			}
		}
		return null;
	}
	
	public Integer tamano() { 
		int total = 0;
		for (Carpeta carpeta : this.carpetas) { 
			total += carpeta.espacioOcupado();
		}
		return total;
	}
}
