package cafetera;

import javax.swing.JOptionPane;

public class Cafetera {

	private double capacidadMaxima ;
	
	private double cantidadActual ;

	//constructor predeterminado ;
	
	public Cafetera() {
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}

	
	//constructor dos
	
	public Cafetera(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = capacidadMaxima;
	}

	//constructor 3 
	
	public Cafetera(double capacidadMaxima, double cantidadActual) {
		if(capacidadMaxima < cantidadActual) {
			this.cantidadActual = cantidadActual ;
			this.capacidadMaxima = cantidadActual ;
		}
		else {
			this.capacidadMaxima = capacidadMaxima;
			this.cantidadActual = cantidadActual;
		}
		
	}
	
	public void llenarCafetera() {
		cantidadActual = capacidadMaxima ;
	}
	
	public void servirTaza(int cantidad){
		
		if(cantidad >= cantidadActual) {
			
			cantidadActual = cantidadActual - cantidad ;
			
			JOptionPane.showInternalMessageDialog(null, "te queda " + cantidadActual + "gramos de cafe");
		}
		else {
			cantidadActual = 0 ;
		}
		
	}
	
	public void vaciarCafetera() {
		
		cantidadActual = 0 ;
	}
	
	public void agregarCafe(int cafe) {
		
		cantidadActual = cafe ;
	}
}
