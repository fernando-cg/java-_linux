package entregable;

import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Main {
	
	public static void regcliente(ArrayList<Cliente> clientes, ArrayList<Pelicula> peliculas, ArrayList<Juego> juegos, ArrayList<Alquiler> alquileres) {
		
		boolean condicion = true ;
		int posicion = 0 ;
		int id = 0;
		
		do {
			
			String respuesta = JOptionPane.showInputDialog("introduzca su dni como en el ejemplo", "123451214f");
			
			for(int x = 0 ; x < clientes.size() ;x++) {
				
				if(respuesta.equals(clientes.get(x).getDni())) {
					x = posicion ;
					condicion = false ;
					id = clientes.get(x).getId() ;
					break ;
				}
			}
			
			
		}while(condicion == true) ;
		
		String opciones[] = {"Alquilar producto","Devolver producto","volver atrás"} ;
		
		int menu = JOptionPane.showOptionDialog(null, "¿Seleccione una oppción?", "Cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
		
		switch (menu) {
		
		case 0:
			
			
			String selecion[] = {"Pelicula","Videojuego","volver atrás"} ;
			
			int tipoalquiler = JOptionPane.showOptionDialog(null, "¿Seleccione que desea alquilar?", "Tipo de alquiler", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, selecion, selecion[2]);
			
			switch (tipoalquiler) {
			
			case 0:
				
				String[] pelis = new String[peliculas.size()];
				
			for(int x = 0 ; x < peliculas.size() ; x++) {
			
				
					
					String salida = (x+1)+ "->" + peliculas.get(x).getTitulo()+ ", Disponibles: " +peliculas.get(x).getCantidadDisponible() ;
					
					pelis[x] = salida ;
			}
			
			JPanel panel = new JPanel(new GridBagLayout());
			JComboBox box = new JComboBox(pelis);
			
			JOptionPane.showMessageDialog(null, box, "Seleccione una película",JOptionPane.QUESTION_MESSAGE);
			
			int resp = box.getSelectedIndex() ;
			
			int respuesta3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la ID del empleado","1")) ;
			
			alquileres = clientes.get(posicion).alquilarProducto(alquileres,respuesta3,peliculas.get(resp).getCodigo()) ;
			
			peliculas.get(resp).setCantidadDisponible(peliculas.get(resp).getCantidadDisponible()-1);
			
				break;
				
			case 1:
				
				String[] games = new String[juegos.size()];
				
			for(int x = 0 ; x < juegos.size() ; x++) {
			
				
					
					String salida2 = (x+1)+ "->" + juegos.get(x).getTitulo()+ ", Disponibles: " + juegos.get(x).getCantidadDisponible() ;
					
					games[x] = salida2 ;
			}
			
			JPanel panel2 = new JPanel(new GridBagLayout());
			
			JComboBox box2 = new JComboBox(games);
			
			JOptionPane.showMessageDialog(null, box2, "Seleccione un juego",JOptionPane.QUESTION_MESSAGE);
			
			int resp2 = box2.getSelectedIndex() ;
			
			int respuesta4 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la ID del empleado","1")) ;
			
			alquileres = clientes.get(posicion).alquilarProducto(alquileres,respuesta4,juegos.get(resp2).getCodigo()) ;
			
			juegos.get(resp2).setCantidadDisponible(juegos.get(resp2).getCantidadDisponible()-1);
			
				
				break;
				
			case 2:
				
				
				break;
				
			}
			
			break;

		case 1:
			
			JPanel panel3 = new JPanel(new GridBagLayout());
			
			ArrayList<String>  alquiler  =  new  ArrayList<String> () ;
			
			for(int x = 0 ; x < alquileres.size(); x++) {
				
				if(alquileres.get(x).getIdCliente() == id) {
					for(int y = 0 ; y < alquileres.size(); y++) {
						
						if(juegos.get(y).getCodigo() == alquileres.get(x).getCodProducto()) {
							alquiler.add(juegos.get(y).getTitulo()) ;
						}
						else if(peliculas.get(y).getCodigo() == alquileres.get(x).getCodProducto()){
							alquiler.add(peliculas.get(y).getTitulo()) ;
						}
					}
				}
			}
			
			JComboBox box3 = new JComboBox(alquiler.toArray());
			
			JOptionPane.showMessageDialog(null, box3, "Seleccione el elemento a devolver",JOptionPane.QUESTION_MESSAGE);
			
			int resp3 = box3.getSelectedIndex() ;
			
			int codigoalquiler ;
			
			
			clientes.get(posicion).devolverProducto(alquiler.get(resp3),peliculas,juegos,alquileres);
			
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
		clientes.add(new Cliente ("Kasioesoo", "39073276Q", 954323564, "kasioesoestacogido@gmail.com", "Calle San Marcos, 73", 22, 43));
		peliculas.add(new Pelicula(0, "pp", null, 0, 0, 0, null, null)) ;
		peliculas.add(new Pelicula(0, "pp3", null, 0, 0, 0, null, null)) ;
		juegos.add(new Juego(0, "hola 1", null, 0, 0, 0, 0, null, false)) ;
		juegos.add(new Juego(1, "hola 2", null, 0, 0, 0, 0, null, false)) ;
		
		do {
			
			String opciones[] = {"Empleado","Cliente","Salir"} ;
			
			int menu = JOptionPane.showOptionDialog(null, "¿Qué tipo de persona eres?", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
			
			switch (menu) {
				case 0:
					
					regempleado() ;
					
					break;
		
				case 1:
					
					regcliente(clientes,peliculas,juegos,alquileres) ;
					
					break;
					
				case 2:
					
					System.exit(0);
					
					break;
				}
		}while(true) ;
	}

}
