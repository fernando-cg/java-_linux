package entregable;

import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Main {
	
	public static void regcliente(ArrayList<Cliente> clientes, ArrayList<Pelicula> peliculas, ArrayList<Juego> juegos) {
		
		String opciones[] = {"Alquilar producto","Devolver producto","volver atrás"} ;
		
		int menu = JOptionPane.showOptionDialog(null, "¿Seleccione una oppción?", "Cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
		
		switch (menu) {
		
		case 0:
			
			/*
			ArrayList<String> salida2 = new ArrayList<String>() ;
			
			for(int x = 0 ; x < clientes.size() ; x++) {
			
				
					
					String salida = (x+1)+ " " + clientes.get(x).getNombre()+ " " +clientes.get(x).getDni() ;
					salida2.add(salida) ;
			}
			
			int seleccion =JOptionPane.showInputDialog(null,"Seleccione opcion","Selector de opciones",JOptionPane.QUESTION_MESSAGE, salida2.toArray())
			*/
			
			String respuesta = JOptionPane.showInputDialog("introduzca su dni como en el ejemplo", "123451214f");
			
			String selecion[] = {"Pelicula","Videojuego","volver atrás"} ;
			
			int tipoalquiler = JOptionPane.showOptionDialog(null, "¿Seleccione que desea alquilar?", "Tipo de alquiler", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
			
			switch (tipoalquiler) {
			
			case 0:
				
				String[] pelis = new String[peliculas.size()];
				
			for(int x = 0 ; x < peliculas.size() ; x++) {
			
				
					
					String salida = (x+1)+ " " + peliculas.get(x).getTitulo()+ " " +clientes.get(x).getDni() ;
					
					pelis[x] = salida ;
			}
			
			 int resp = JOptionPane.showInputDialog(null, "Seleccione una pelicula", "Peliculas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, pelis, pelis[0]);
				
				break;
				
			case 1:
				
				String[] games = new String[juegos.size()];
				
				break;
				
			case 2:
				
				break;
				
			}
			
			break;

		case 1:
			
			
			
			break;
			
		case 2:
			
			
			break;
		}
		
	}
	
	public static void regempleado() {
		
	}

	public static void main(String[] args) {

		ArrayList< Pelicula >  peliculas  =  new  ArrayList<Pelicula> () ;
		
		ArrayList< Juego >  juegos  =  new  ArrayList<Juego> () ;
		
		ArrayList<Cliente>  clientes  =  new  ArrayList<Cliente> () ;
		
		ArrayList<Empleado>  empleados  =  new  ArrayList<Empleado> () ;
		
		ArrayList<Alquiler>  alquileres  =  new  ArrayList<Alquiler> () ;
		
		clientes.add(new Cliente ("Kasioeso", "39073276Q", 954323564, "kasioesoestacogido@gmail.com", "Calle San Marcos, 73", 23, 43));
		clientes.add(new Cliente ("Kasioesoo", "39073276Q", 954323564, "kasioesoestacogido@gmail.com", "Calle San Marcos, 73", 23, 43));
		
		do {
			
			String opciones[] = {"Empleado","Cliente","Salir"} ;
			
			int menu = JOptionPane.showOptionDialog(null, "¿Qué tipo de persona eres?", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
			
			switch (menu) {
				case 0:
					
					regempleado() ;
					
					break;
		
				case 1:
					
					regcliente(clientes,peliculas,juegos) ;
					
					break;
					
				case 2:
					
					System.exit(0);
					
					break;
				}
		}while(true) ;
	}

}
