package hEJ3;

public class Tren extends Medio {
	private String compania ;

	public Tren(String nombre, int pasajeros, int velocidad, float precio, String compania) {
		super(nombre, pasajeros, velocidad, precio);
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Tren [compania=" + compania + ", getNombre()=" + getNombre() + ", getPasajeros()=" + getPasajeros()
				+ ", getVelocidad()=" + getVelocidad() + ", getPrecio()=" + getPrecio() + "]";
	}

	
}
