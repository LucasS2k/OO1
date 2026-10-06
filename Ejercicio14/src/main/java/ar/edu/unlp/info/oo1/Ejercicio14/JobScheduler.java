package ar.edu.unlp.info.oo1.Ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    private List<JobDescription> jobs;
    private JobStrategy strategy;

    public JobScheduler (JobStrategy strategy) {
        this.jobs = new ArrayList<>();
        this.strategy = strategy;
    }
    public JobScheduler () { 
    	this.jobs =  new ArrayList<>();
    }
    
    public void unschedule(JobDescription job) {
		if (job != null) {
			this.jobs.remove(job);
		}
	}
    
    public void schedule(JobDescription job) {
		this.jobs.add(job);
	}
    
    public JobStrategy getStrategy() {
		return this.strategy;
	}

    public void setStrategy (JobStrategy strategy) { 
    	this.strategy = strategy;
    }
    public List <JobDescription> getJobs () { 
    	return this.jobs;
    }
    public JobDescription next() {
        JobDescription nextJob = this.strategy.next(this.jobs);
        if (nextJob != null) { 
        	this.unschedule(nextJob);
        }
               return nextJob;
    }

}
