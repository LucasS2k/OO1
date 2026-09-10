package ar.edu.unlp.info.oo1.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	
		private int cantidadDeProductos;
		private double precioTotal;
		private double pesoTotal;
		private List <Producto> productos = new ArrayList<>();
		
		public Balanza(){
			this.cantidadDeProductos = 0;
			this.precioTotal = 0;
			this.pesoTotal = 0;
			this.productos = new ArrayList<>();
			
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
			this.productos.clear();
		}
		
		public void agregarProducto (Producto producto) {
			this.precioTotal+= producto.getPrecio();
			this.pesoTotal+= producto.getPeso();
			this.cantidadDeProductos++;
			this.productos.add(producto);
		}
		
		public Ticket emitirTicket () {
		 return new Ticket (this.precioTotal, this.pesoTotal, this.cantidadDeProductos, this.productos);
		}
}
