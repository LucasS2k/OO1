package ar.edu.unlp.info.oo1.Ejercicio2;
public class Balanza {
	
		private int cantidadDeProductos;
		private double precioTotal;
		private double pesoTotal;
		
		public Balanza(){
			this.cantidadDeProductos = 0;
			this.precioTotal = 0;
			this.pesoTotal = 0;
			
		}
		public int getCantidadDeProductos () {
			return this.cantidadDeProductos;
		}
		
		void setCantidadDeProductos(int cant) {
			this.cantidadDeProductos = cant;
		}
		
		public double getPrecioTotal() {
			return this.precioTotal;
		}
		
		void setPrecioTotal (double precio) {
			this.precioTotal = precio;
		}
		
		public double getPesoTotal(){
			return this.pesoTotal;
		}
		
		void setPesoTotal(double peso){
			this.pesoTotal = peso;
		}
		
		public void ponerEnCero () {
			this.cantidadDeProductos = 0;
			this.pesoTotal=0;
			this.precioTotal=0;
		}
		
		public void agregarProducto (Producto producto) {
			this.precioTotal+= producto.getPrecio();
			this.pesoTotal+= producto.getPeso();
			this.cantidadDeProductos++;
		}
		
		public Ticket emitirTicket () {
		 return new Ticket (this.precioTotal, this.pesoTotal, this.cantidadDeProductos);
		}
}
