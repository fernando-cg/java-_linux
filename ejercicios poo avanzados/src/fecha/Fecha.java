package fecha;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
	
	private Date fecha ;
	
	private long fecha_en_milisec ;

	
	
	public Fecha() {
		
		Calendar calendario = Calendar.getInstance() ;
		
		calendario.set(1900, 12, 1);
		fecha_en_milisec = calendario.getTimeInMillis() ;
	}



	public Fecha(int dia, int mes, int anio) {

		Calendar calendario = Calendar.getInstance() ;
		
		calendario.set(anio, mes-1, dia) ;
		
		fecha = calendario.getTime() ;
		
		fecha_en_milisec = calendario.getTimeInMillis() ;
	}

	public String bisiesto() {
		
		GregorianCalendar calendar = new GregorianCalendar();

		if(calendar.isLeapYear(fecha.getYear())) {
			
		}
		
		return "No es bisiesto" ;
	}
	
	public int diaMes(String mes) {
		
		 int numeroDias = -1;
		    switch (mes.toLowerCase().trim()) {
		        case "enero":
		        case "marzo":
		        case "mayo":
		        case "julio":
		        case "agosto":
		        case "octubre":
		        case "diciembre":
		            numeroDias = 31;
		            break;
		        case "abril":
		        case "junio":
		        case "septiembre":
		        case "noviembre":
		            numeroDias = 30;
		            break;
		        case "febrero":
		    		GregorianCalendar calendar = new GregorianCalendar();

		    		
		            if (calendar.isLeapYear(fecha.getYear())) {
		                numeroDias = 29;
		            } else {
		                numeroDias = 28;
		            }
		            break;		 
		    }
		    
		    return numeroDias ;
	}
	
	public void validar() {
		
	}
	
}
