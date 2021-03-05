package entregable;

import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Main {
	
	public static void regcliente(ArrayList<Cliente> clientes) {
		
		String opciones[] = {"Alquilar producto","Devolver producto","volver atrás"} ;
		
		int menu = JOptionPane.showOptionDialog(null, "¿Seleccione una oppción?", "Cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
		
		switch (menu) {
		case 0:
			
			ArrayList<String> salida2 = new ArrayList<String>() ;
			
			for(int x = 0 ; x < clientes.size() ; x++) {
			
				
					
					String salida = (x+1)+ " " + clientes.get(x).getNombre()+ " " +clientes.get(x).getDni() ;
					salida2.add(salida) ;
			}
			
			int seleccion =JOptionPane.showInputDialog(null,"Seleccione opcion","Selector de opciones",JOptionPane.QUESTION_MESSAGE, salida2.toArray())
			
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
					
					regcliente(clientes) ;
					
					break;
					
				case 2:
					
					System.exit(0);
					
					break;
				}
		}while(true) ;
	}

}
