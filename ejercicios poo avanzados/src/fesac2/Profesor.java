package fesac2;

import java.util.Date;

public class Profesor extends Equipo_docente{
	
	private String asignatura ;
	
	private String tutor ;
	
	private int sueldoTotal ;
	
	private int SueldoPlus ;

	public Profesor(String nombre, String apellido1, String apellido2, String dni, Date fechanac, int telefono,
			String email, int antiguedad, int sueldoBase, String asignatura, String tutor) {
		super(nombre, apellido1, apellido2, dni, fechanac, telefono, email, antiguedad, sueldoBase);
		this.asignatura = asignatura;
		this.tutor = tutor;
	}

	public int getSueldoTotal() {
		return sueldoTotal;
	}

	public void setSueldoTotal(int sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}

	public int getSueldoPlus() {
		return SueldoPlus;
	}

	public void setSueldoPlus(int sueldoPlus) {
		SueldoPlus = sueldoPlus;
	}

	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + ", tutor=" + tutor + ", sueldoTotal=" + sueldoTotal
				+ ", SueldoPlus=" + SueldoPlus + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
