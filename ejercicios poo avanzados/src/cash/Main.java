package cash;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	
	public static void registrar(ArrayList<Articulo> articulo) {
		
		String nombre =JOptionPane.showInputDialog(null,"Introduzca el nombre del producto") ;
		
		String fecha =JOptionPane.showInputDialog(null,"Introduzca la fecha de caducidad (dd/mm/aaaa)") ;

		int dia, mes, anio ;

		dia = Integer.parseInt(fecha.substring(0,1)) ;

		mes = Integer.parseInt(fecha.substring(3,4)) ;

		anio = Integer.parseInt(fecha.substring(6,fecha.length())) ;
		
		double precio =Double.parseDouble(JOptionPane.showInputDialog(null,"Introduzca el precio del producto")) ;
		
		int unidades =Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el precio del producto")) ;
		
		articulo.add(new Articulo(nombre,precio,unidades,dia,mes,anio)) ;
	}

	public static void main(String[] args) {
		
		ArrayList<Articulo> articulo = new ArrayList<Articulo>() ;

		
		String opciones[] = {"Introducir artículos", "Ordenar productos", "Mostrar listado","Stock","Salir"} ;
		int menu = JOptionPane.showOptionDialog(null, "Seleccione una opcción:", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[4]);

		switch (menu) {
		case 0:
			
			registrar(articulo) ;
			
			break;
			
		case 1:
			
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			System.exit(0);
			
			break;
			
		}
	}

}
