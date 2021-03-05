package entregable;

public class Usuario {

	private String nombre ;
	
	private String dni ;
	
	private int telefono ;
	
	private String email ;
	
	private String direccion ;

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public Usuario(String nombre, String dni, int telefono, String email, String direccion) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
	}
	
	
}
