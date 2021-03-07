package entregable;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alquiler {
	
	private int idCliente ;
	
	private int idEmpleado ;
	
	private int codProducto ;
	
	private Date fechaAlquiler ;
	
	private Date fechaEntregaPrevista;
	
	private Date fechaEntrega ;
	
	private double penalizacion ;
	
	private long milisec ;
	
	
	public double penalizacion() {
		
		double penalizacion=0 ;
		
		if(fechaEntrega.compareTo(fechaEntregaPrevista) > 0) {
			
			Calendar date = new GregorianCalendar() ;
			
			
			
			penalizacion = 0.5 * (date.getTimeInMillis() - milisec) ;
		}
		
		return penalizacion ;
	}


	public Alquiler(int idCliente, int idEmpleado, int codProducto) {
		Calendar date = new GregorianCalendar() ;
		this.idCliente = idCliente;
		this.idEmpleado = idEmpleado;
		this.codProducto = codProducto;
		this.fechaAlquiler = date.getTime() ;
		
		milisec = date.getTimeInMillis() ;
		
		date.set(date.DAY_OF_MONTH, date.MONTH + 2, date.YEAR);
		
		this.fechaEntregaPrevista = date.getTime();
		
		this.fechaEntrega = null;
		
		this.penalizacion = 0;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public int getCodProducto() {
		return codProducto;
	}
	
	
	
}
