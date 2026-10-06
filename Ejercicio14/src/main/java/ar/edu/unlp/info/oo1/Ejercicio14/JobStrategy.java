package ar.edu.unlp.info.oo1.Ejercicio14;

import java.util.List;

public interface JobStrategy {
	JobDescription next (List <JobDescription> jobs);
}
