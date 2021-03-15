package fesac2;

import java.util.Date;

public class Trabajador extends Persona {

	private int id_trabajador ;
	
	private String area ;
	
	private int horaTrabajo ;
	
	private int horaExtra ;
	
	private int sueldoBase ;
	
	private int sueldoTotal ;

	public Trabajador(String nombre, String apellido1, String apellido2, String dni, Date fechanac, int telefono,
			String email, String area, int horaTrabajo, int horaExtra, int sueldoBase) {
		super(nombre, apellido1, apellido2, dni, fechanac, telefono, email);
		this.area = area;
		this.horaTrabajo = horaTrabajo;
		this.horaExtra = horaExtra;
		this.sueldoBase = sueldoBase;
	}

	public int getSueldoTotal() {
		return sueldoTotal;
	}

	public void setSueldoTotal(int sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}

	@Override
	public String toString() {
		return "Trabajador [area=" + area + ", horaTrabajo=" + horaTrabajo + ", horaExtra=" + horaExtra
				+ ", sueldoBase=" + sueldoBase + ", sueldoTotal=" + sueldoTotal + ", toString()=" + super.toString()
				+ "]";
	}

	
	
}
