package ar.edu.unlp.info.oo1.Ejercicio14;

import java.util.List;

public class LifoStrategy implements JobStrategy{
	@Override
	public JobDescription next (List <JobDescription> jobs) { 
		if (jobs.isEmpty()) return null;
		return jobs.get (jobs.size()-1);
	}
}
