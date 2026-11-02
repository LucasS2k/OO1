package ar.edu.unlp.info.oo1.Ejercicio27;

public class PedidoViandas extends Pedido{
	private boolean aptoCeliaco;
	public PedidoViandas (String email, FormaDeEntrega formaDeEntrega, boolean apto) { 
		super(email, formaDeEntrega);
		this.aptoCeliaco = apto;
	}
	public boolean agregarVianda(Vianda vianda) { 
		if (this.aptoCeliaco && !vianda.getAptoCeliaco()) {
			return false;
		}
		
		if (this.formaDeEntrega.calcularTiempoEstimado(this.fechaInicio) > 40) { 
			this.productos.add(vianda);
			return true;
		}
		return false;
	}
}
