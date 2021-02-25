package cash;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Main {
	
	public static void registrar(ArrayList<Articulo> articulo) {
		
		String nombre =JOptionPane.showInputDialog(null,"Introduzca el nombre del producto") ;
		
		String fecha =JOptionPane.showInputDialog(null,"Introduzca la fecha de caducidad (dd/mm/aaaa)") ;

		int dia, mes, anio ;

		dia = Integer.parseInt(fecha.substring(0,2)) ;

		mes = Integer.parseInt(fecha.substring(3,5)) - 1 ;

		anio = Integer.parseInt(fecha.substring(6,fecha.length())) ;
		
		double precio =Double.parseDouble(JOptionPane.showInputDialog(null,"Introduzca el precio del producto")) ;
		
		int unidades =Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca las unidades del producto")) ;
		
		articulo.add(new Articulo(nombre,precio,unidades,dia,mes,anio)) ;
	}

	public static void main(String[] args) {
		
		ArrayList<Articulo> articulo = new ArrayList<Articulo>() ;

		articulo.add(new Articulo("uni1",13,9,28,12,2021)) ;
		articulo.add(new Articulo("uni2",13,1000,29,12,2021)) ;
		articulo.add(new Articulo("uni3",13,1000,30,12,2021)) ;
		
	do {
		String opciones[] = {"Introducir artículos", "Ordenar productos", "Mostrar listado","Stock","Salir"} ;
		int menu = JOptionPane.showOptionDialog(null, "Seleccione una opcción:", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[4]);
		
			switch (menu) {
			case 0:
				
				registrar(articulo) ;
				
				break;
				
			case 1:
				
				Collections.sort(articulo, new CompararFecha()) ;
				
				break;
				
			case 2:
				
				JOptionPane.showMessageDialog(null,articulo.toString()) ;
				
				break;
				
			case 3:
				ArrayList<String> stock = new ArrayList<String>() ;
				for(int x = 0 ; x < articulo.size() ; x++) {
				
					if(articulo.get(x).getUnidades()< 10) {
						String salida = (x+1)+ " " + articulo.get(x).getNombre() + " tiene " +articulo.get(x).getUnidades() + " Unidades" + "\n" ;
						stock.add(salida) ;
					}
				}
				
				JOptionPane.showMessageDialog(null,stock.toArray());
				
				break;
				
			case 4:
				
				System.exit(0);
				
				break;
				
			}
		
		}while(true) ;
	}

}
