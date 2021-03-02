package hEJ3;

public class Familiar extends Coche {
	
	private boolean isofix ;

	public Familiar(String nombre, int pasajeros, int velocidad, float precio, int puertas, String color, String marca,
			String modelo, boolean isofix) {
		super(nombre, pasajeros, velocidad, precio, puertas, color, marca, modelo);
		this.isofix = isofix;
	}

	@Override
	public String toString() {
		return "Familiar [isofix=" + isofix + ", toString()=" + super.toString() + ", getNombre()=" + getNombre()
				+ ", getPasajeros()=" + getPasajeros() + ", getVelocidad()=" + getVelocidad() + "]";
	}
	
	
	
	
}
