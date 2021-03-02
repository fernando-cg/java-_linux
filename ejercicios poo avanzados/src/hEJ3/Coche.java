package hEJ3;

public class Coche extends Medio {

	private int puertas ;
	
	private String color ;
	
	private String marca ;
	
	private String modelo ;

	public Coche(String nombre, int pasajeros, int velocidad, float precio, int puertas, String color,String marca, String modelo) {
		
		super(nombre, pasajeros, velocidad, precio);
		
		this.color = color ;
		
		this.marca = marca ;
		
		this.modelo = modelo ;
		
		this.puertas = puertas ;
	}

	@Override
	public String toString() {
		return "Coche [puertas=" + puertas + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
				+ ", getNombre()=" + getNombre() + ", getPasajeros()=" + getPasajeros() + ", getVelocidad()="
				+ getVelocidad() + ", getPrecio()=" + getPrecio() + "]";
	}

	
}
