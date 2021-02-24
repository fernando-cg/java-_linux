package fesac_olimpiadas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Atleta implements Comparable<Atleta> {
	
	private int dorsal ;
	
	private String nombre ;
	
	private String pais ;
	
	private Date tiempo ;

	private long tiempoms ;
	
	public Atleta( String nombre, String pais, int horas, int minutos, int segundos) {
		this.dorsal = ((int) (Math.random()*100000));
		this.nombre = nombre;
		this.pais = pais;
		Calendar calendar = Calendar.getInstance() ;
	    calendar.set(Calendar.HOUR, horas);
	    calendar.set(Calendar.MINUTE, minutos);
	    calendar.set(Calendar.SECOND, segundos);
		this.tiempo = calendar.getTime()  ;
		this.tiempoms = calendar.getTimeInMillis() ;
	}
	
	
	

	public long getTiempoms() {
		return tiempoms;
	}
	
	

	public int getDorsal() {
		return dorsal;
	}

	public void carrera() {
		
	}



	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		
		return "dorsal: " + dorsal + ", nombre: " + nombre + ", pais: " + pais + ", tiempo: " + formatter.format(tiempo) + "\n" ;
	}



	@Override
	public int compareTo(Atleta o) {
		
		if(o.getTiempoms() < tiempoms) {
			
			return -1 ;
		}
		else if (o.getTiempoms() < tiempoms) {
			
			return 0 ;
		}
		else {
			return 1 ;
		}
		
	}
		
}