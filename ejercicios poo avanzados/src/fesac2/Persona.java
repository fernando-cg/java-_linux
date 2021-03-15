package fesac2;

import java.util.Date;

public class Persona {

	//atributos
	
	private String nombre ;
	
	private String apellido1 ;
	
	private String apellido2 ;
	
	private String dni ;
	
	private Date fechanac ;
	
	private int telefono ;
	
	private String email ;
	
	//metodos
	
	public Persona(String nombre, String apellido1, String apellido2, String dni, Date fechanac, int telefono,
			String email) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechanac = fechanac;
		this.telefono = telefono;
		this.email = email;
	}
	
}
