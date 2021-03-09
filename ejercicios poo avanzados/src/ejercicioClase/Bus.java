package ejercicioClase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Bus extends Tierra {

	private int ejes ;
	
	private boolean banios ;
	
	
	
	@Override
	public String toString() {
		return "Bus -> ejes=" + ejes + ", baños=" + banios + ", " + super.toString() + "]";
	}



	public Bus(int capacidad, int ejes, boolean banios) {
		super(capacidad);
		this.ejes = ejes;
		this.banios = banios;
		
		Calendar cal = new GregorianCalendar();
		
		cal.set(0, 0, 0, 15, 0, 0);
		
		setTiempo(cal.getTime()) ;
		
		float precio = 60 ;
		
		if(banios == true) {
			
			precio = precio + 5 ;
		
		}
		
		setPrecio(precio) ;
	}
	
}
