package fesac;

public class TrabajadorFesac {

	private int sueldo ;
	
	private String nombre ;
	
	private String apellidos ;

	public TrabajadorFesac(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
}
