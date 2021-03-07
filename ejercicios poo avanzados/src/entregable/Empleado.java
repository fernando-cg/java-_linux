package entregable;

import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Empleado extends Usuario {
	
	private int id ;
	
	private static int idNext = 1;
	
	public Empleado(String nombre, String dni, int telefono, String email, String direccion) {
		super(nombre, dni, telefono, email, direccion);
		id = idNext;
		
		idNext ++ ;
	}

	public ArrayList<Cliente> agregarCliente(ArrayList<Cliente> clientes) {
		
		String nombre = JOptionPane.showInputDialog("Introduzca su numbre");
		
		String dni = JOptionPane.showInputDialog("Introduzca su dni como en el ejemplo", "123451214f");
		
		int telefono = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su teléfono"));
		
		String email = JOptionPane.showInputDialog("Introduzca su email");
		
		String direccion = JOptionPane.showInputDialog("Introduzca su dirección de vivienda");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad"));
		
		clientes.add(new Cliente(nombre,dni,telefono,email,direccion,edad)) ;
		
		return clientes;
	}
	
	public ArrayList<Cliente> modificarCliente(ArrayList<Cliente> clientes) {
		
		String[] opciones = new String[clientes.size()] ;
		
		for(int x = 0 ; x < clientes.size() ; x++) {
			
			opciones[x] = clientes.get(x).getId() + "->" + clientes.get(x).getNombre() + " dni:" + clientes.get(x).getDni();
		}
		
		JPanel pane2 = new JPanel(new GridBagLayout());
		
		JComboBox box = new JComboBox(opciones);
		
		JOptionPane.showMessageDialog(null, box, "Seleccione un cliente",JOptionPane.QUESTION_MESSAGE);
		
		int resp = box.getSelectedIndex() ;
		
		String modificar[] = {"Nombre","dni","Telefono","email","direccion","edad","Volver atras"} ;
		
		int menu2 = JOptionPane.showOptionDialog(null, "¿Seleccione que desea modificar", "Empleado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, modificar,modificar[6]);
		
		switch (menu2) {
		case 0:
			String nombre = JOptionPane.showInputDialog("Introduzca su numbre");
			clientes.get(resp).setNombre(nombre);
			break;
			
		case 1:
			String dni = JOptionPane.showInputDialog("Introduzca su dni como en el ejemplo", "123451214f");
			clientes.get(resp).setDni(dni);
			break;
			
		case 2:
			int telefono = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su teléfono"));
			clientes.get(resp).setTelefono(telefono);
			break;
			
		case 3:
			String email = JOptionPane.showInputDialog("Introduzca su email");
			clientes.get(resp).setEmail(email);
			break;
			
		case 4:
			
			String direccion = JOptionPane.showInputDialog("Introduzca su dirección de vivienda");
			clientes.get(resp).setDireccion(direccion);
			
			break;
			
		case 5:
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad"));
			clientes.get(resp).setEdad(edad);
			break;
			
		case 6:
			
			break;
			
		}
		
		return clientes;
		
	}
	
	public ArrayList<Cliente> eliminarCliente(ArrayList<Cliente> clientes) {
		String[] opciones = new String[clientes.size()] ;
		
		for(int x = 0 ; x < clientes.size() ; x++) {
			
			opciones[x] = clientes.get(x).getId() + "->" + clientes.get(x).getNombre() + " dni:" + clientes.get(x).getDni();
		}
		
		JPanel pane2 = new JPanel(new GridBagLayout());
		
		JComboBox box = new JComboBox(opciones);
		
		JOptionPane.showMessageDialog(null, box, "Seleccione el cliente que desea eliminar",JOptionPane.QUESTION_MESSAGE);
		
		int resp = box.getSelectedIndex() ;
		
		clientes.remove(resp) ;
		
		JOptionPane.showMessageDialog(null,"Operacion realizada") ;
		
		return clientes;
	}
	
	public ArrayList agregarProducto(ArrayList<Pelicula> peliculas, ArrayList<Juego> juegos,int elemento) {
		
		if(elemento == 0) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el codigo"));
			String titulo = JOptionPane.showInputDialog("Introduzca el título");
			String genero = JOptionPane.showInputDialog("Introduzca el género");
			int edadRecomendada = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad recomendada"));
			double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio"));
			int cantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la Cantidad disponible"));
			String duracion = JOptionPane.showInputDialog("Introduzca la duración");
			String idioma = JOptionPane.showInputDialog("Introduzca el idioma");
			peliculas.add(new Pelicula(codigo,titulo,genero,edadRecomendada,precio,cantidadDisponible,duracion,idioma)) ;
			return peliculas ;
		}
		else {
			
			int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el codigo"));
			String titulo = JOptionPane.showInputDialog("Introduzca el título");
			String genero = JOptionPane.showInputDialog("Introduzca el género");
			int edadRecomendada = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad recomendada"));
			double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio"));
			int cantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la Cantidad disponible"));
			int annioLanzamiento = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de lanzamiento"));
			String plataforma = JOptionPane.showInputDialog("Introduzca las plataformas disponibles");
			
			String modificar[] = {"Si","No"} ;
			
			int menu2 = JOptionPane.showOptionDialog(null, "¿Tiene modo multijugador?", "Empleado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, modificar,modificar[0]);
			
			boolean online ;
			
			if(menu2==0) {
				online = true ;
			}else {
				online = false ;
			}
			juegos.add(new Juego(codigo,titulo,genero,edadRecomendada,precio,cantidadDisponible,annioLanzamiento,plataforma,online)) ;
			return juegos;
		}
	}
	
	public ArrayList modificarProducto(ArrayList<Pelicula> peliculas, ArrayList<Juego> juegos, int i) {
	
		if(i == 0) {
			String pelis[] = new String[peliculas.size()] ;
			for(int x = 0 ; x < peliculas.size() ; x++) {
				
				pelis[x] = peliculas.get(x).getTitulo() ;
			}
			JComboBox box = new JComboBox(pelis);
			
			JOptionPane.showMessageDialog(null, box, "Seleccione la pelicula que quieres modificar",JOptionPane.QUESTION_MESSAGE);
			
			int resp = box.getSelectedIndex() ;
			
			String modificar[] = {"Codigo","Titulo","Genero","Edad Recomendada","Precio","Cantidad Disponible","Duracion" ,"Idioma","volver atrás"} ;
			
			int menu2 = JOptionPane.showOptionDialog(null, "¿Seleccione que desea modificar", "Empleado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, modificar,modificar[8]);
			
			switch (menu2) {
			case 0:
				peliculas.get(resp).setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el codigo")));
				break;
				
			case 1:
				peliculas.get(resp).setTitulo(JOptionPane.showInputDialog("Introduzca el título"));
				break;
				
			case 2:
				peliculas.get(resp).setGenero(JOptionPane.showInputDialog("Introduzca el género"));
				break;
				
			case 3:
				peliculas.get(resp).setEdadRecomendada(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad recomendada")));
				break;
				
			case 4:
				peliculas.get(resp).setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio")));
				break;
				
			case 5:
				peliculas.get(resp).setCantidadDisponible(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la Cantidad disponible")));
				break;
				
			case 6:
				peliculas.get(resp).setDuracion(JOptionPane.showInputDialog("Introduzca la duración"));
				break;
				
			case 7:
				peliculas.get(resp).setIdioma(JOptionPane.showInputDialog("Introduzca el ididoma")) ;
				break;
				
			case 8:
			
				break;
				
			}
				
		return peliculas ;
		}
		else {
			
			String games[] = new String[peliculas.size()] ;
			
			for(int x = 0 ; x < juegos.size() ; x++) {
				
				games[x] = peliculas.get(x).getTitulo() ;
			}
			JComboBox box = new JComboBox(games);
			
			JOptionPane.showMessageDialog(null, box, "Seleccione el juego que quieres modificar",JOptionPane.QUESTION_MESSAGE);
			
			int resp = box.getSelectedIndex() ;
			
			String modificar[] = {"Codigo","Titulo","Genero","Edad Recomendada","Precio","Cantidad Disponible","Año de Lanzamiento" ,"Plataforma", "Online","volver atrás"} ;
			
			int menu2 = JOptionPane.showOptionDialog(null, "¿Seleccione que desea modificar", "Empleado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, modificar,modificar[8]);
			
			switch (menu2) {
			case 0:
				juegos.get(resp).setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el codigo")));
				break;
				
			case 1:
				juegos.get(resp).setTitulo(JOptionPane.showInputDialog("Introduzca el título"));
				break;
				
			case 2:
				juegos.get(resp).setGenero(JOptionPane.showInputDialog("Introduzca el género"));
				break;
				
			case 3:
				juegos.get(resp).setEdadRecomendada(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad recomendada")));
				break;
				
			case 4:
				juegos.get(resp).setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio")));
				break;
				
			case 5:
				juegos.get(resp).setCantidadDisponible(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la Cantidad disponible")));
				break;
				
			case 6:
				juegos.get(resp).setAnioLanzamiento(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de lanzamiento")));
				break;
				
			case 7:
				juegos.get(resp).setPlataforma(JOptionPane.showInputDialog("Introduzca Las plataformas Disponibles")) ;
				break;
				
			case 8:
				
				String mod[] = {"Si","No"} ;
				
				int men = JOptionPane.showOptionDialog(null, "¿Tiene modo multijugador?", "Empleado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, modificar,modificar[0]);
				
				boolean online ;
				
				if(men==0) {
					online = true ;
				}else {
					online = false ;
				}
				
				juegos.get(resp).setMultijugador(online);
			
				break;
				
			case 9:
				
				break;
				
				
			}
			return juegos ;
		}
	}
	
	public ArrayList eliminarProducto(ArrayList<Pelicula> peliculas, ArrayList<Juego> juegos, int i) {
		if(i == 0) {
			
			String pelis[] = new String[peliculas.size()] ;
			for(int x = 0 ; x < peliculas.size() ; x++) {
				
				pelis[x] = peliculas.get(x).getTitulo() ;
			}
			JComboBox box = new JComboBox(pelis);
			
			JOptionPane.showMessageDialog(null, box, "Seleccione la pelicula que quieres Eliminar",JOptionPane.QUESTION_MESSAGE);
			
			int resp = box.getSelectedIndex() ;
			
			peliculas.remove(resp) ;
			
			JOptionPane.showMessageDialog(null,"Operacion realizada") ;
			
			return peliculas;
		}
		else {
			
			
			String games[] = new String[juegos.size()] ;
			for(int x = 0 ; x < juegos.size() ; x++) {
				
				games[x] = juegos.get(x).getTitulo() ;
			}
			JComboBox box = new JComboBox(games);
			
			JOptionPane.showMessageDialog(null, box, "Seleccione el juego que quieres Eliminar",JOptionPane.QUESTION_MESSAGE);
			
			int resp = box.getSelectedIndex() ;
			
			juegos.remove(resp) ;
			
			JOptionPane.showMessageDialog(null,"Operacion realizada") ;
			
			return juegos ;
		}
	}
}
