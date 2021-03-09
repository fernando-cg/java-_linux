package ejercicioClase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Barco extends Transporte {

	//atributos
	
	private int categoria ;

	//metodos 
	


	public Barco(int capacidad, int categoria) {
		super(capacidad);
		this.categoria = categoria;
		
		Calendar cal = new GregorianCalendar();
		
		cal.set(0, 0, 0, 7, 0, 0);
		
		setTiempo(cal.getTime()) ;
		
		float precio = 0 ;
		
		if(categoria == 1) {
			
			precio = 120 ;
		}
		else if(categoria == 2) {
			
			precio = 97 ;
		}
		else if(categoria == 3) {
			
			precio = 89;
		}
		
		if(capacidad > 1000) {
			precio = precio - ((precio * 9)/100) ;
		}
		
		setPrecio(precio) ;
	}

	@Override
	public String toString() {
		return "Barco -> categoria=" + categoria + ", " + super.toString() + "]";
	}		
}
