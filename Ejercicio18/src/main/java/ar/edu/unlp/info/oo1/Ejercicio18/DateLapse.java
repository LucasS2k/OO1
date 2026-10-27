package ar.edu.unlp.info.oo1.Ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public interface DateLapse {
	public LocalDate getFrom();
	public LocalDate getTo();
	public int sizeInDays();
	public boolean includesDate(LocalDate other);
	LocalDate hoy = LocalDate.now();
	LocalDate primerFecha = LocalDate.of(1972,12,15);
	LocalDate segundaFecha = LocalDate.of(2032, 12, 15);
	
	
	long diasTranscuridos = primerFecha.until(segundaFecha, ChronoUnit.DAYS);
	long mesesTranscurridos = primerFecha.until(segundaFecha, ChronoUnit.MONTHS);
	long aniosTranscurridos = primerFecha.until(segundaFecha, ChronoUnit.YEARS);
	
}
