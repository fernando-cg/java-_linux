package ejercicioClase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Avion extends Transporte {

	//atributos
	
	private int nMotores ;

	//Metodos
	


	public Avion(int capacidad, int nMotores) {
		super(capacidad);
		this.nMotores = nMotores;
		
		Calendar cal = new GregorianCalendar();
		
		cal.set(0, 0, 0, 0, 30, 0);
		
		setTiempo(cal.getTime()) ;
		
		float precio ;
		
		if(nMotores == 2) {
			precio = 110 ;
		}
		else {
			
			precio = 127 ;
		}
		
		if(capacidad < 20) {
			precio = precio + ((precio * 14) / 100) ;
		}

		setPrecio(precio) ;
		
	}

	@Override
	public String toString() {
		return "Avion -> numero de motores=" + nMotores + ", " + super.toString() + "]";
	}
	
	
}
