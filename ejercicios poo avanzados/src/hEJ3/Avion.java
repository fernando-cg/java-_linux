package hEJ3;

public class Avion extends Medio{

	private String modelo ;

	public Avion(String nombre, int pasajeros, int velocidad, float precio, String modelo) {
		super(nombre, pasajeros, velocidad, precio);
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Avion [modelo=" + modelo + ", getNombre()=" + getNombre() + ", getPasajeros()=" + getPasajeros()
				+ ", getVelocidad()=" + getVelocidad() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	
}
