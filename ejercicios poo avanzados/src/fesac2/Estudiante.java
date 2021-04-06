package fesac2;

import java.util.Date;

public class Estudiante extends Persona {

	private int id_estudiante ;
	
	private String estudios ;
	
	private int curso ;
	
	private int notamedia ;

	public Estudiante(String nombre, String apellido1, String apellido2, String dni, Date fechanac, int telefono,
			String email, String estudios, int curso, int notamedia) {
		super(nombre, apellido1, apellido2, dni, fechanac, telefono, email);
		this.estudios = estudios;
		this.curso = curso;
		this.notamedia = notamedia;
	}

	public int getNotamedia() {
		return notamedia;
	}

	public void setNotamedia(int notamedia) {
		this.notamedia = notamedia;
	}

	@Override
	public String toString() {
		return "Estudiante [id_estudiante=" + id_estudiante + ", estudios=" + estudios + ", curso=" + curso
				+ ", notamedia=" + notamedia + ", toString()=" + super.toString() + "]";
	}
	
	
}
