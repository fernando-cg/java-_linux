package hEJ3;

public class Medio {

	private String nombre ;
	
	private int pasajeros ;
	
	private int velocidad ;
	
	private float precio ;

	
	public Medio(String nombre, int pasajeros, int velocidad, float precio) {
		super();
		this.nombre = nombre;
		this.pasajeros = pasajeros;
		this.velocidad = velocidad;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPasajeros() {
		return pasajeros;
	}


	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
