package ar.edu.unlp.info.oo1.Ejercicio19;
import java.time.LocalDate;
import ar.edu.unlp.info.oo1.Ejercicio18.*;
import java.time.temporal.ChronoUnit;

public class NewDateLapse implements DateLapse{
	private LocalDate from;
	private int sizeInDays;
	public NewDateLapse(LocalDate from, LocalDate to) { 
		this.from = from;
		this.sizeInDays = (int) from.until(to, ChronoUnit.DAYS);
	}
	@Override
	public LocalDate getFrom() {
		return this.from;
	}
	@Override
	public LocalDate getTo() {
		return this.from.plusDays(sizeInDays);
	}
	@Override
	public int sizeInDays() {
		return this.sizeInDays;
	}
	@Override
	public boolean includesDate(LocalDate other) {
		if (other == null) { 
			return false;
		}
		return !other.isBefore(this.getFrom()) && !other.isAfter(getTo()); 
	}
	
}