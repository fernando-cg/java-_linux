package fesac2;

import java.util.Date;

public class Equipo_docente extends Persona{
	
	private int id_equipo ;
	
	private int antiguedad ;
	
	private int sueldoBase ;

	public Equipo_docente(String nombre, String apellido1, String apellido2, String dni, Date fechanac, int telefono,
			String email, int antiguedad, int sueldoBase) {
		super(nombre, apellido1, apellido2, dni, fechanac, telefono, email);
		this.antiguedad = antiguedad;
		this.sueldoBase = sueldoBase;
	}
	
	
}
