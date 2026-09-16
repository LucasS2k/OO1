package e.Ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean Estado;
	private List <Farola> Farolas;
	
	public Farola() { 
		this.Estado = false;
		this.Farolas = new ArrayList <>();
	}
	
	
	public List <Farola> getNeighbors(){ 
		return this.Farolas;
	}
	
	public boolean isOn() {
		if (this.Estado == true){ 
			return true;
		} 
		else return false;
	}
	
	public boolean isOff () { 
		if (this.Estado == false){ 
			return true;
		}
		else return false;
	}
	
	public void pairWithNeighbor (Farola otraFarola) { 
		if (!this.Farolas.contains(otraFarola)) { 
			this.Farolas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public void turnOff() {
		if (this.isOn()) { 
			this.Estado = false;
			for (Farola vecina : this.Farolas) { 
				vecina.turnOff();
			}
		};
	}
	
	public void turnOn() { 
		if (this.isOff()) { 
			this.Estado = true;
			for (Farola vecina : this.Farolas) { 
				vecina.turnOn();
			}
		}
	}
	
	
	
}
