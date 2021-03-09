package ejercicioClase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Transporte {

	//atributos
	
	private float precio ;
	
	private Date tiempo ;
	
	private int capacidad ;
	
	//metodos
	
	public double velocidadMedia(int distancia , Date temp) {
		
		int minutos = temp.getMinutes() ;
		int horas = temp.getHours() ;		
		int metros = distancia * 1000 ;
		
		int segundos ;
		
		if(horas!=24) {
			segundos = minutos * 60 + horas * 3600 ;
		}
		else {
			 segundos = minutos * 60 ;
		}
		
		double sistemaInternacional = metros/segundos ;
		
		
		if(horas == 9) {	
		
			return distancia/horas ;
		}
		else if(horas == 6) {
			return sistemaInternacional ;
		}
		else if(horas == 15) {
			return distancia/horas ;
		}
		else if(horas == 7) {
			return sistemaInternacional *  1.9438 ;
		}
		else if(minutos == 30) {
			return sistemaInternacional * 2.24 ;
		}
		
		return horas ;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("kk:mm");
		return "Transporte ->precio=" + precio + ", tiempo=" + formatter.format(tiempo) + ", capacidad=" + capacidad + "]";
	}

	public Transporte( int capacidad) {
		super();
		this.capacidad = capacidad;
	}

	public void setTiempo(Date tiempo) {
		this.tiempo = tiempo;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Date getTiempo() {
		return tiempo;
	}
	
		
}
