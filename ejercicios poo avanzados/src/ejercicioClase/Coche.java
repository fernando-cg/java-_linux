package ejercicioClase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Coche extends Tierra {

	private String marca ;
	
	private String modelo ;
	
	private String color ;



	@Override
	public String toString() {
		return "Coche -> marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", " + super.toString()
				+ "]";
	}



	public Coche(int capacidad, String marca, String modelo, String color) {
		super(capacidad);
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		
		Calendar cal = new GregorianCalendar();
		
		cal.set(0, 0, 0, 9, 0, 0);
		
		setTiempo(cal.getTime()) ;
		
		float precio = 75 ;
		
		if(marca.equalsIgnoreCase("Mercedes") || marca.equalsIgnoreCase("Bmw") || marca.equalsIgnoreCase("Mercedes")) {
			
			precio = precio + ((precio *20)/100) ;
		}
		
		if(color.equalsIgnoreCase("negro") || color.contentEquals("rojo")) {
			
			precio = precio + ((precio *4)/100) ;

		}
		
		setPrecio(precio) ;
	}
	
	
}
