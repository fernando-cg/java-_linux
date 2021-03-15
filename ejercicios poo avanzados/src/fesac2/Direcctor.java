package fesac2;

import java.util.Date;

public class Direcctor extends Equipo_docente {

	public Direcctor(String nombre, String apellido1, String apellido2, String dni, Date fechanac, int telefono,
			String email, int antiguedad, int sueldoBase) {
		super(nombre, apellido1, apellido2, dni, fechanac, telefono, email, antiguedad, sueldoBase);

		
	}

	@Override
	public String toString() {
		return "Direcctor [toString()=" + super.toString() + "]";
	}

	
}
