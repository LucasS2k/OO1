package ar.edu.unlp.info.oo1.Ejercicio27;

public class PedidoSupermercado extends Pedido{
	private boolean tieneCupon;
	public PedidoSupermercado (String email, FormaDeEntrega formaDeEntrega, boolean tieneCupon) { 
		super(email, formaDeEntrega);
		this.tieneCupon = tieneCupon;
	}
	public double calcularPeso(){ 
		return this.productos.stream().mapToDouble(Producto:: getPeso).sum();
	}
	public boolean agregarArticulo(Producto producto) { 
		if (this.calcularPeso() + producto.getPeso() <= 35.0) { 
			this.productos.add(producto);
			return true;
		}return false;
	}
	@Override
	public double calcularCosto() { 
		double total = super.calcularCosto();
		if (this.tieneCupon) { 
			total = total *0.90;
		}return total;
	}
}
