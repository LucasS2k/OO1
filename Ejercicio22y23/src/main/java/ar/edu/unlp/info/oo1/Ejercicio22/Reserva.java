package ar.edu.unlp.info.oo1.Ejercicio22;
import ar.edu.unlp.info.oo1.Ejercicio19;
import java.time.LocalDate;

public class Reserva {
	private DateLapse periodo;
	private Propiedad propiedad;
	private Usuario inquilino;
	public Reserva (DateLapse periodo, Propiedad propiedad, Usuario inquilino) { 
		this.periodo = periodo;
		this.propiedad = propiedad;
		this.inquilino = inquilino;
	}
	public boolean overlaps(DateLapse anotherDateLapse) { 
		if (anotherDateLapse == null) { 
			return false;
		}
		return !(this.getTo().isBefore(anotherDateLapse) || this.getFrom().isAfter(anotherDateLapse));
	}
	public Double calcularPrecio() { 
		return this.periodo.sizeInDays() * this.propiedad.getPrecio();
	}
	public DateLapse getPeriodo() { 
		return this.periodo;
	}
	
	public boolean estaEnCurso() { 
		return this.periodo.includesDate(LocalDate.now());
	}
}
