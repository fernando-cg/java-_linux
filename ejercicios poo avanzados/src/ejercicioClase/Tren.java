package ejercicioClase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tren extends Tierra {

	private String energia ;



	@Override
	public String toString() {
		return "Tren -> energia=" + energia + ", " + super.toString() + "]";
	}



	public Tren(int capacidad, String energia) {
		super(capacidad);
		this.energia = energia;
		
		Calendar cal = new GregorianCalendar();
		
		cal.set(0, 0, 0, 6, 0, 0);
		
		setTiempo(cal.getTime()) ;
		
		float precio = 0 ;
		
		if(energia.equalsIgnoreCase("Diesel")) {
			
			precio = 88 ;
		}
		else if(energia.equalsIgnoreCase("Electrico")) {
			
			precio = 76 ;
		}
		
		if(capacidad >= 300) {
			precio = precio - ((precio*12)/100) ;
		}
		
		setPrecio(precio) ;
	}
	
	
}
