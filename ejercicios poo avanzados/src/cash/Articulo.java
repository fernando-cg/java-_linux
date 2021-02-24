package cash;

import java.util.Calendar;
import java.util.Date;

public class Articulo {
	
	//atributos
	
	private int identificador ;
	
	private String nombre ;
	
	private Date fechaCaducidad ;
	
	private double precio ;
	
	private double unidades ;

	public Articulo( String nombre, double precio, double unidades,int dia , int mes , int anio) {
		this.identificador = (int)(Math.random()*Math.pow(10, 8)) ;
		this.nombre = nombre;
		this.precio = precio;
		this.unidades = unidades;
		Calendar calendario = Calendar.getInstance() ;
		calendario.set(anio, mes, dia);
	}
	
	//metodos
	
	
}
