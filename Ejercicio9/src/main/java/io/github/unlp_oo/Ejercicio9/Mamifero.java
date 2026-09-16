package io.github.unlp_oo.Ejercicio9;

import java.util.Date;

public class Mamifero {
	private String Identificador;
	private String Especie;
	private Date FechaNacimiento;
	private Mamifero Padre;
	private Mamifero Madre;
	private Mamifero AbueloMaterno;
	private Mamifero AbuelaMaterna;
	private Mamifero AbueloPaterno;
	private Mamifero AbuelaPaterna;
	private Boolean Ancestro;
	
	public Mamifero (String Id) {
		this.Identificador = Id;
	}
	
	public Mamifero () { 
		
	}
	public String getIdentificador () {
		return this.Identificador;
	}
	
	public void setIdentificador (String Id) {
		this.Identificador = Id;
	}
	
	public String getEspecie () {
	return this.Especie;}
	
	public void setEspecie (String especie) { 
		this.Especie = especie;
	}
	
	public Date getFechaNacimiento () { 
		return this.FechaNacimiento;
	}
	
	public void setFechaNacimiento (Date fecha) { 
		this.FechaNacimiento = fecha;
	}
	
	public Mamifero getPadre () { 
		return this.Padre;
	}
	
	public void setPadre (Mamifero padre) { 
		this.Padre = padre;
	}
	
	public Mamifero getMadre () { 
		return this.Madre;
	} 
	
	public void setMadre (Mamifero madre) { 
		this.Madre = madre;
	}
	
	public Mamifero getAbueloMaterno() { 
		return (this.Madre !=null) ? this.Madre.getPadre() : null;
	}
	
	public Mamifero getAbuelaMaterna () { 
		return (this.Madre !=null) ? this.Madre.getMadre() : null;
	}
	
	public Mamifero getAbueloPaterno () { 
		return (this.Padre !=null) ? this.Padre.getPadre() : null;
	}
	
	public Mamifero getAbuelaPaterna () { 
		return (this.Padre!= null) ? this.Padre.getMadre() : null;
	}
	
	public boolean tieneComoAncestroA (Mamifero unMamifero) { 
		if (unMamifero == null) { 
			return false;
		}
		boolean esPadreOMadre = (this.Padre != null && this.Padre.equals(unMamifero)) || (this.Madre!=null && this.Madre.equals(unMamifero));
	
		if (esPadreOMadre) { 
			return true;
		}
		boolean ancestroPorPadre = (this.Padre != null) && this.Padre.tieneComoAncestroA(unMamifero);
        boolean ancestroPorMadre = (this.Madre != null) && this.Madre.tieneComoAncestroA(unMamifero);

        return ancestroPorPadre || ancestroPorMadre;
	} } 
